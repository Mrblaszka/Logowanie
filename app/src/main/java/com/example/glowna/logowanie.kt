package com.example.glowna

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.Toolbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.logowanie)

        var imie = findViewById<EditText>(R.id.login).text.toString()
        var nazwisko = findViewById<EditText>(R.id.haslo).text.toString()
        val pasek = findViewById<Toolbar>(R.id.toolbar1)
        val logowanie = findViewById<Button>(R.id.zaloguj)

        logowanie.setOnClickListener() {
            pasek.title = imie + nazwisko
        }
    }
     override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.open_info -> {
                val intent = Intent(this, info_o_uzytkowniku::class.java)
                startActivity(intent)
                true
            }
            R.id.open_tabela -> {
                val intent = Intent(this, tabela_ocen::class.java)
                startActivity(intent)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }


}