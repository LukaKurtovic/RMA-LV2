package com.example.inspiringpersons.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.inspiringpersons.data.PeopleRepository
import com.example.inspiringpersons.model.Person
import com.example.inspiringpersons.adapters.PersonAdapter
import com.example.inspiringpersons.R
import kotlin.random.Random

class MainActivity : AppCompatActivity(), PersonAdapter.OnImageClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val insertedPerson = intent.getSerializableExtra(getString(R.string.NAME_EXTRA)) as? Person
        if(insertedPerson != null){
            PeopleRepository.people.add(insertedPerson)
        }
        val rv = findViewById<RecyclerView>(R.id.rv)
        val fab = findViewById<View>(R.id.fab)
        val personList = PeopleRepository
        rv.adapter = PersonAdapter(personList, this)
        rv.layoutManager = LinearLayoutManager(this)
        fab.setOnClickListener{
            val intent = Intent(this, addPerson_activity::class.java)
            startActivity(intent)
        }
    }

    override fun onImageClick(position: Int) {
        Toast.makeText(this, PeopleRepository.people[position].Quotes[Random.nextInt(0,3)],
            Toast.LENGTH_SHORT).show()
    }

}