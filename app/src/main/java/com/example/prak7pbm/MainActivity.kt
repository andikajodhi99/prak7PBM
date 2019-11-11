package com.example.prak7pbm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
const val Send = "com.example.prak7pbm.MESSAGE"
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun sendText(view: View){
        val x = findViewById<EditText>(R.id.Username)
        val message = x.text.toString()

        val intent = Intent(this, form_input::class.java).apply {
            putExtra(Send, message)
        }
        startActivity(intent)
    }
}
