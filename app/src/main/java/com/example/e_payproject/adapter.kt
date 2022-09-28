package com.example.e_payproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class adapter(private val itemslist : ArrayList<Items>) : RecyclerView.Adapter<adapter.mylist>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): mylist {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.listitem,
        parent,false)
        return mylist(itemView)

    }

    override fun onBindViewHolder(holder: mylist, position: Int) {
        val currentitem = itemslist[position]
        holder.tittleimage.setImageResource(currentitem.tittleimage)
        holder.heading.text = currentitem.heading
        holder.description.text = currentitem.description
        holder.cost.text = currentitem.cost


    }

    override fun getItemCount(): Int {
       return itemslist.size
    }
    class mylist(itemView: View) : RecyclerView.ViewHolder(itemView){
        val tittleimage : ShapeableImageView = itemView.findViewById(R.id.tittleimage)
        val heading : TextView =itemView.findViewById(R.id.Heading)
        val description : TextView =itemView.findViewById(R.id.description)
        val cost : TextView =itemView.findViewById(R.id.cost)


    }

}