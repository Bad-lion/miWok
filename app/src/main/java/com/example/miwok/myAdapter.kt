package com.example.miwok

import android.content.Context
import android.view.LayoutInflater
import android.view.View

import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView

import android.widget.TextView

class MyAdapter(var mCtx:Context, var resourse: Int, var items:List<word>/*, val mColorResoursId: Int*/):ArrayAdapter<word>(mCtx, resourse, items) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val layoutInflater:LayoutInflater = LayoutInflater.from(mCtx)
        val view:View = layoutInflater.inflate(resourse, null )
        val imageView: ImageView = view.findViewById(R.id.image)
        val english:TextView = view.findViewById(R.id.defaultTextView)
        val miwok:TextView = view.findViewById(R.id.miwokTextView)

        var mItem:word = items[position]
        imageView.setImageDrawable(mCtx.resources.getDrawable(mItem.img))
        english.text = mItem.english
        miwok.text = mItem.miwok
        return view
    }

}