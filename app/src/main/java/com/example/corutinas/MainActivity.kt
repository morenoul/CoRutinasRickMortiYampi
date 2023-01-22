package com.example.corutinas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.corutinas.adapter.PersonajeAdapter
import com.example.corutinas.databinding.ActivityMainBinding
import com.example.corutinas.interfaces.APIService
import com.example.corutinas.models.Personaje
import com.example.corutinas.models.ResultPersonajeResponse
import com.example.corutinas.providers.PersonajeProvider
import com.example.corutinas.retrofitAdapter.RetrofitHelper
import kotlinx.coroutines.*


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        initRecryclerView()
        doCall()

        setContentView(binding.root)
    }
    private fun initRecryclerView(){
        binding.listaPersonajes.adapter = PersonajeAdapter(this, PersonajeProvider.listaPersonajes)
        binding.listaPersonajes.layoutManager = LinearLayoutManager(this)
        binding.listaPersonajes.adapter?.notifyDataSetChanged()
    }


    private  fun doCall(){
        val apiService =  RetrofitHelper.getInstance().create(APIService::class.java)

        // invocar la coroutina global

        GlobalScope.launch {
            //println(apiService.getQuotesApi().body())
            val result = apiService.getPersonajesApi()
            if (result != null){
                var personajes = ArrayList<Personaje>()
                for (personaje in result.body()!!.results!!){
                    var aux = personaje.name?.let { personaje.status?.let { it1 ->
                        personaje.location?.name?.let { it2 ->
                            personaje.image?.let { it3 ->
                                Personaje(it,
                                    it1, it2, it3
                                )
                            }
                        }
                    } }
                    personajes.add(aux!!)
                    Log.d("Personaje", aux.toString())
                }
                initCharacter(personajes)
                }

            }
        }


    private fun initCharacter(personajes: ArrayList<Personaje>){
        PersonajeProvider.listaPersonajes.clear()
        PersonajeProvider.listaPersonajes.addAll(personajes)
        //
        //println(personajes)
    }


    private fun showError() {
        Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show()
    }


}