package com.example.prak7pbm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.*
import android.widget.Spinner
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_form_input.*


const val THE_MESSAGE1 = "com.example.prak7pbm.MESSAGE1"
const val THE_MESSAGE2 = "com.example.prak7pbm.MESSAGE2"
const val THE_MESSAGE3 = "com.example.prak7pbm.MESSAGE3"
const val THE_MESSAGE4 = "com.example.prak7pbm.MESSAGE4"

class form_input : AppCompatActivity() {
    var jurs = arrayOf("TI", "SI", "KA","MI", "TK")

    private lateinit var spinner: Spinner
    var txt: TextView?=null
    private lateinit var jurusan: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_input)

        spinner = spin
        spinner.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, jurs)
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                jurusan = spinner.selectedItem.toString()
            }
        }
        val message = intent.getStringExtra(Send)

        val textView = findViewById<TextView>(R.id.txtShow).apply {
            text = message
        }

    }

    fun sendText(view: View){
        val intent = Intent(this, Layout_Tampil::class.java).apply {
            this.putExtra(THE_MESSAGE1, nama.text.toString())
            this.putExtra(THE_MESSAGE2, Nim.text.toString())
            this.putExtra(THE_MESSAGE3, jurusan)
            this.putExtra(THE_MESSAGE4, Univ.text.toString())
        }
        startActivity(intent)
    }
}