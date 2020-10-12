package com.example.miwok

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class PhrasesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phrases)

        var listView = findViewById<ListView>(R.id.phrasesList)

        var lst = mutableListOf<examp>()

        lst.add(examp("where are you going?", "minto wuksus"))
        lst.add(examp("what's your name", "tinna oyase'na"))
        lst.add(examp("my name is ...", "oyaaset..."))
        lst.add(examp("how are you feeling?", "michakses?"))
        lst.add(examp("i'm feeling good", "kuchi achit"))



        listView.adapter = myAdapterForPhrase(this, R.layout.list_item_for_phrases, lst)

    }
}