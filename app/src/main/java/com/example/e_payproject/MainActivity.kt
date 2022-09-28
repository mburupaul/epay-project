package com.example.e_payproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {


    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<Items>
    lateinit var imageid : Array<Int>
    lateinit var heading : Array<String>
    lateinit var description : Array<String>
    lateinit var cost : Array<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageid = arrayOf(
            R.drawable.iphone,
            R.drawable.oil,
            R.drawable.sanmsung,
            R.drawable.tv,
            R.drawable.woofer,


            )
        heading = arrayOf(
            "Iphone 13 pro max",
            "Fresh fri cooking oil",
            "Samsung phone",
            "Flat screen smart tv",
            "Home theater woofer",

            )
        description = arrayOf(
                "Iphone 13 pro max",
        "Fresh fri cooking oil",
        "Samsung phone",
        "Flat screen smart tv",
        "Home theater woofer",

        )

        cost = arrayOf(
            "Ksh. 122,000",
            "Ksh. 2000",
            "Ksh. 42000",
            "Ksh. 62000",
            "Ksh. 12000",



            )

        newRecyclerView = findViewById(R.id.recyclerview)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf()
    }


}

