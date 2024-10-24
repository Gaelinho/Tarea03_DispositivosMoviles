package com.example.tarea03

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.activity.ComponentActivity
import android.util.Log

class PendientesActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.task_list_layout)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.actionbar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        when (id) {
            R.id.ord_fecha -> {
                Log.d("PendientesActivity", "Ordenar por Fecha")
                return true
            }
            R.id.ord_materia -> {
                Log.d("PendientesActivity", "Ordenar por Materia")
                return true
            }
            R.id.prior_menu -> {
                Log.d("PendientesActivity", "Mostrar Prioritarios")
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
