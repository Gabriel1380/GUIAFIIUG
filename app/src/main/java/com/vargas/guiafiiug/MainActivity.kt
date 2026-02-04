package com.vargas.guiafiiug

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {

    private lateinit var searchEditText: EditText
    private lateinit var searchButton: Button
    private lateinit var aulasCard: CardView
    private lateinit var departamentosCard: CardView
    private lateinit var bloquesCard: CardView
    private lateinit var mapaCard: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inicializar vistas
        searchEditText = findViewById(R.id.searchEditText)
        searchButton = findViewById(R.id.searchButton)
        aulasCard = findViewById(R.id.aulasCard)
        departamentosCard = findViewById(R.id.departamentosCard)
        bloquesCard = findViewById(R.id.bloquesCard)
        mapaCard = findViewById(R.id.mapaCard)

        // Configurar listeners
        searchButton.setOnClickListener { realizarBusqueda() }

        aulasCard.setOnClickListener {
            val intent = Intent(this@MainActivity, AulasActivity::class.java)
            startActivity(intent)
        }

        departamentosCard.setOnClickListener {
            val intent = Intent(this@MainActivity, DepartamentosActivity::class.java)
            startActivity(intent)
        }

        bloquesCard.setOnClickListener {
            val intent = Intent(this@MainActivity, BloquesActivity::class.java)
            startActivity(intent)
        }

        mapaCard.setOnClickListener {
            val intent = Intent(this@MainActivity, MapaActivity::class.java)
            startActivity(intent)
        }
    }

    private fun realizarBusqueda() {
        val busqueda = searchEditText.text.toString().trim()

        if (busqueda.isEmpty()) {
            Toast.makeText(this, "Por favor ingresa algo para buscar", Toast.LENGTH_SHORT).show()
            return
        }

        // Crear intent para la actividad de resultados
        val intent = Intent(this@MainActivity, ResultadoActivity::class.java)
        intent.putExtra("busqueda", busqueda)
        startActivity(intent)
    }
}