package com.example.miwok

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_numbers.*

class FamilyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_numbers)


        var listView = findViewById<ListView>(R.id.listV)

        var lst = mutableListOf<word>()

        lst.add(word("father", "lutti",R.drawable.family_father))
        lst.add(word("mother", "eki",R.drawable.family_mother))
        lst.add(word("son", "uch",R.drawable.family_son))
        lst.add(word("daughter", "tort",R.drawable.family_daughter))
        lst.add(word("older brother", "besh",R.drawable.family_older_brother))
        lst.add(word("older sister", "alty",R.drawable.family_older_sister))
        lst.add(word("grand father", "zhety",R.drawable.family_grandfather))
        lst.add(word("grand mother", "segis",R.drawable.family_grandmother))
        lst.add(word("younger brother", "togus",R.drawable.family_younger_brother))
        lst.add(word("younger sister", "on",R.drawable.family_younger_sister))


        listView.adapter = MyAdapter(this, R.layout.list_item, lst)

    }
}