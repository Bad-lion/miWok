package com.example.miwok
import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity




class NumbersActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_numbers)

        var listView = findViewById<ListView>(R.id.listV)

        var lst = mutableListOf<word>()

        lst.add(word("one", "lutti",R.drawable.number_one,R.raw.number_one))
        lst.add(word("two", "otiko",R.drawable.number_two,R.raw.number_two))
        lst.add(word("three", "tolookosu",R.drawable.number_three,R.raw.number_three))
        lst.add(word("four", "oyulsa",R.drawable.number_four,R.raw.number_four))
        lst.add(word("five", "massokka",R.drawable.number_five,R.raw.number_five))
        lst.add(word("six", "temmokka",R.drawable.number_six,R.raw.number_six))
        lst.add(word("seven", "kenekaku",R.drawable.number_seven,R.raw.number_seven))
        lst.add(word("eight", "segis",R.drawable.number_eight,R.raw.number_eight))
        lst.add(word("nine", "togus",R.drawable.number_nine,R.raw.number_nine))
        lst.add(word("ten", "on",R.drawable.number_ten,R.raw.number_ten))

        listView.adapter = MyAdapter(this, R.layout.list_item, lst,"#FD8E09")



    }




//        val listView = findViewById<ListView>(R.id.list)
//
//        listView.adapter = MyCustomAdapter(this)
//    }
//
//    private class MyCustomAdapter(context: Context) : BaseAdapter() {
//
//
//        private val mContext = context
//
//        init {
//
//        }
//
//        override fun getCount(): Int {
//            return 5
//        }
//
//        override fun getItemId(position: Int): Long {
//            return position.toLong()
//        }
//
//
//        override fun getItem(position: Int): Any {
//            return "TEST STRING"
//        }
//
//        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
//            val textView = TextView(mContext)
//            textView.setText("sadasd")
//            return textView
//        }
//    }
//-----------------------------------------------------------------------------------------------

//        val listOfNumbers = mutableListOf<word>()
//
//        var w = word("asdsa","sdsa")
//
//        listOfNumbers.add(word("asdsa", "sdsa"))
//
//
//
////        val itemsAdapter: ArrayAdapter<String> =
////            ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, listOfNumbers)
//
//
//        val gridView: GridView = findViewById(R.id.list)
//
//        val adapter = ArrayAdapter(this, R.layout.list_item, listOfNumbers)
//        gridView.adapter = adapter
//
//
//
//      //  listView.setAdapter(adapter)
//
//
}

