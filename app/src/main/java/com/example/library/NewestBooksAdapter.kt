package com.example.library

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NewestBooksAdapter(val newestBooksList: ArrayList<NewestBooksModels>): RecyclerView.Adapter<newestBookviewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): newestBookviewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.newestbookssamples , parent ,false)
        return newestBookviewHolder(view)
    }

    override fun onBindViewHolder(holder: newestBookviewHolder, position: Int) {

        val currentItem = newestBooksList[position]
        holder.nBookImage.setImageResource(currentItem.nBookImage)
        holder.favourite.setImageResource(currentItem.favourite)
        holder.nAuthorName.text = currentItem.nAuthorName
        holder.nBookName.text = currentItem.nBookName
        holder.nCategory.text = currentItem.nCategory

    }

    override fun getItemCount(): Int {
        return newestBooksList.size
    }
}

class newestBookviewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
    val nBookName: TextView = itemView.findViewById(R.id.nBookName)
    val nCategory: TextView = itemView.findViewById(R.id.description)
    val nAuthorName: TextView = itemView.findViewById(R.id.nAuthorName)
    val nBookImage: ImageView = itemView.findViewById(R.id.nBookImage)
    val favourite: ImageView = itemView.findViewById(R.id.favourite)
}