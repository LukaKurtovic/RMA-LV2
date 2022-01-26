package com.example.inspiringpersons.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.inspiringpersons.model.Person
import com.example.inspiringpersons.R


class addPerson_activity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_person_activity)
        val btnAdd = findViewById<Button>(R.id.btn_add)
        val etName = findViewById<EditText>(R.id.et_name)
        val etDescription = findViewById<EditText>(R.id.et_description)
        btnAdd.setOnClickListener{
            val newPerson = Person(R.mipmap.ic_launcher_round,
                    etName.text.toString(),
                    etDescription.text.toString(),
            mutableListOf("New Person-Quote1", "New Person-Quote2", "New Person-Quote3"))

            val sendToMain = Intent(this, MainActivity::class.java)
            sendToMain.putExtra(getString(R.string.NAME_EXTRA), newPerson)
            startActivity(sendToMain)
        }
    }

}