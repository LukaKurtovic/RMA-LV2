package com.example.inspiringpersons.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.inspiringpersons.R
import com.example.inspiringpersons.data.PeopleRepository

class PersonAdapter(private val personList : PeopleRepository,
                    private val listener : OnImageClickListener
) : RecyclerView.Adapter<PersonAdapter.PersonViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_person, parent, false)

        return PersonViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return personList.people.size
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        val currentPerson = personList.people[position]

        holder.imageView.setImageResource(currentPerson.Image)
        holder.textViewName.setText(currentPerson.Name)
        holder.textViewDescription.setText(currentPerson.Description)
    }

     inner class PersonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener{
        val imageView: ImageView = itemView.findViewById(R.id.iv)
        val textViewName: TextView = itemView.findViewById(R.id.tv_name)
        val textViewDescription: TextView = itemView.findViewById(R.id.tv_description)

        init {
            imageView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            val position = adapterPosition
            if(position != RecyclerView.NO_POSITION){
            listener.onImageClick(position)
            }
        }
    }
    interface OnImageClickListener{
        fun onImageClick(position: Int)
    }
}