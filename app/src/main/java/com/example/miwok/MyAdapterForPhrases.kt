package com.example.miwok
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView


class myAdapterForPhrase(var mcxt: Context, var resourse: Int, var item:List<examp>): ArrayAdapter<examp>(mcxt , resourse, item){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val layoutInflater: LayoutInflater = LayoutInflater.from(mcxt)
        val view : View = layoutInflater.inflate(resourse,null)
        val eng: TextView = view.findViewById(R.id.onEnglish)
        val miw: TextView = view.findViewById(R.id.onMiwok)

        var mItem:examp = item[position]
        eng.text = mItem.eng
        miw.text = mItem.miw

        return view
    }
}

