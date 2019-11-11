package com.example.prak7pbm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class Layout_Tampil : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout__tampil)

        val message1 = intent.getStringExtra(THE_MESSAGE1)
        val message2 = intent.getStringExtra(THE_MESSAGE2)
        val message3 = intent.getStringExtra(THE_MESSAGE3)
        val message4 = intent.getStringExtra(THE_MESSAGE4)

        val text1 = findViewById<TextView>(R.id.txtNama).apply {
            text = message1
        }
        val text2 = findViewById<TextView>(R.id.txtNim).apply {
            text = message2
        }
        val text3 = findViewById<TextView>(R.id.txtJurusan).apply {
            text = message3
        }
        val text4 = findViewById<TextView>(R.id.txtUniv).apply {
            text = message4
        }
    }
    fun nextPage(view: View) {


        val intent = Intent(this, Service::class.java)
        startActivity(intent)
    }
}

