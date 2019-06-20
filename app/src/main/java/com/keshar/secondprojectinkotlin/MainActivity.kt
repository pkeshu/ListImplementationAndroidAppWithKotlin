package com.keshar.secondprojectinkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var layoutManager: RecyclerView.LayoutManager
    private lateinit var adapter1: HobbiesAdapter
    private var hobbiesList =ArrayList<Hobby>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        hobbiesList.addAll(Supplier.hobbies)
        layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        adapter1 = HobbiesAdapter(this)
        adapter1.addHobbyToList(hobbiesList)
        recyclerView.adapter = adapter1
    }
}
