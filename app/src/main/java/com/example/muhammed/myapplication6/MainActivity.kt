package com.example.muhammed.myapplication6

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {

    lateinit var listView : ListView
    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.listView1)
        textView = findViewById(R.id.textView)

        var personArray = arrayOf("Muhammed","Essa","Ahmed","Osama","Ali","fatima", "Omer")
        listView.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,personArray)

        listView.setOnItemClickListener{
            parent: AdapterView<*>?, view: View?, position: Int, id: Long ->
            textView.text = personArray[position]
 Toast.makeText(applicationContext,"My name is : "+personArray[position],Toast.LENGTH_LONG).show()
        }

    }
}
