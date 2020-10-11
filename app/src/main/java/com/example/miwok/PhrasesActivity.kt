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

        lst.add(examp("any phrases", "another phrases"))
        lst.add(examp("any phrases asd", "another phrases version 2"))
        lst.add(examp("any phrases asfdsa", "another phrases version 3"))



        listView.adapter = myAdapterForPhrase(this, R.layout.list_item_for_phrases, lst)

    }
}