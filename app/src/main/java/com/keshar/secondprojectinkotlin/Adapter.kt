package com.keshar.secondprojectinkotlin

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.keshar.secondprojectinkotlin.HobbiesAdapter.HobbiesViewHolder
import kotlinx.android.synthetic.main.custom_item_layout.view.*

class HobbiesAdapter(val context: Context) : RecyclerView.Adapter<HobbiesViewHolder>() {
    private var hobbiesList = ArrayList<Hobby>()
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): HobbiesViewHolder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.custom_item_layout, p0, false)
        return HobbiesViewHolder(view)
    }

    override fun getItemCount(): Int {

        return hobbiesList?.size
    }

    override fun onBindViewHolder(holder: HobbiesViewHolder, position: Int) {
        val currentItem = hobbiesList[position]
        holder.setData(currentItem, position)

    }

    fun addHobbyToList(newHobbiesList: List<Hobby>) {
        hobbiesList.addAll(newHobbiesList)
        notifyDataSetChanged()

    }

    inner class HobbiesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var currentItem: Hobby? = null
        var position: Int? = null

        init {
            itemView.title.setOnClickListener {
                Toast.makeText(context, currentItem!!.title + " cliccked!", Toast.LENGTH_SHORT).show()
            }
        }

        fun setData(currentItem: Hobby, position: Int) {
            itemView.title.text = currentItem.title
            this.currentItem = currentItem
            this.position

        }

    }
}