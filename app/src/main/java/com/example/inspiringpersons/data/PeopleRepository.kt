package com.example.inspiringpersons.data

import com.example.inspiringpersons.R
import com.example.inspiringpersons.model.Person

object PeopleRepository{
        var people = mutableListOf(
                Person(R.drawable.tesla, "Nikola Tesla", "Nikola tesla je hrvatski znanstvenik iz Smiljana",
                        mutableListOf("If you want to find the secrets of the universe, think in terms of energy, frequency and vibration.",
                                "I don't care that they stole my idea . . I care that they don't have any of their own.",
                                "Of all things, I liked books best.")),
                Person(R.drawable.boskovic, "Ruđer Bošković", "Ruđer Bošković je hrvatski znanstvenik iz Dubrovnika",
                mutableListOf("The deepest intelligence of philosophy and science are inseparable from a religious view of the world.",
                        "We want to believe we couldn't be replaced, and that the people we love are irreplaceable.",
                        "I must have done everything I had. You go through years where you go through everything you've ever written.")),
                Person(R.drawable.kolinda, "Kolinda G. Kitarović", "Kolinda Grabar Kitarović nije hrvatski znanstvenik",
                mutableListOf("Oni kojima u Hrvatskoj nije dovoljno dobro mogu otići.",
                        "Već imam dogovore s nekim državama da nam Hrvati odu na obuku negdje drugdje i da se vrate u Hrvatsku i da rade preko interneta u nekoj drugoj državi, a u Hrvatskoj da zarađuju 8.000 eura.",
                        "Bila sam izuzetno razočarana činjenicom, kako osobno doista zastupam i iz sveg srca podržavam kampanju 'Kupujmo hrvatsko', da su se u toj košari našli i neki proizvodi koji nisu bili hrvatske proizvodnje."))
    )

    fun getQuote(){

    }

}