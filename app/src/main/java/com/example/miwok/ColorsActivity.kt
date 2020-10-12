package com.example.miwok

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class ColorsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_numbers)

        var listView = findViewById<ListView>(R.id.listV)

        var lst = mutableListOf<word>()

        lst.add(word("red", "lutti",R.drawable.color_red,R.raw.color_red))
        lst.add(word("yellow", "eki",R.drawable.color_mustard_yellow,R.raw.color_mustard_yellow))
        lst.add(word("dusty yellow", "uch",R.drawable.color_dusty_yellow,R.raw.color_dusty_yellow))
        lst.add(word("green", "tort",R.drawable.color_green,R.raw.color_green))
        lst.add(word("brown", "besh",R.drawable.color_brown,R.raw.color_brown))
        lst.add(word("gray", "alty",R.drawable.color_gray,R.raw.color_gray))
        lst.add(word("black", "zhety",R.drawable.color_black,R.raw.color_black))
        lst.add(word("white", "segis",R.drawable.color_white,R.raw.color_white))


        listView.adapter = MyAdapter(this, R.layout.list_item, lst,"#8800A0")

    }
}