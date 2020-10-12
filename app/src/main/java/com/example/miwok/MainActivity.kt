package com.example.miwok

//import android.R
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numbersActivity: TextView = findViewById(R.id.numbers)
        numbersActivity.setOnClickListener{
            startActivity(Intent (this, NumbersActivity::class.java))
        }

        val familyActivity: TextView = findViewById(R.id.family)
        familyActivity.setOnClickListener{
            startActivity(Intent (this, FamilyActivity::class.java))
        }


        val colorsActivity: TextView = findViewById(R.id.colors)
        colorsActivity.setOnClickListener{
            startActivity(Intent (this, ColorsActivity::class.java))
        }


        val phrasesActivity: TextView = findViewById(R.id.phrases)
        phrasesActivity.setOnClickListener{
            startActivity(Intent (this, PhrasesActivity::class.java))
        }

        val testActivity: TextView = findViewById(R.id.test)
        testActivity.setOnClickListener{
            startActivity(Intent (this, TestActivity::class.java))
        }

    }

}