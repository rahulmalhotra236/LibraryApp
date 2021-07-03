package com.example.library

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_books.view.*
import kotlinx.android.synthetic.main.activity_main.*

class PopularBooksAdapter(val popularBooksList: ArrayList<PopularBooksModels>): RecyclerView.Adapter<popularBookviewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): popularBookviewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.popularbookssamples , parent ,false)
        return popularBookviewHolder(view)
    }

    override fun onBindViewHolder(holder: popularBookviewHolder, position: Int) {

        val currentItem = popularBooksList[position]
        holder.bookImage.setImageResource(currentItem.bookImage)
        holder.bookName.text = currentItem.bookName
        holder.authorName.text = currentItem.authorName

    }

    override fun getItemCount(): Int {
        return popularBooksList.size
    }
}

class popularBookviewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
    val bookName: TextView = itemView.findViewById(R.id.bookName)
    val authorName: TextView = itemView.findViewById(R.id.authorName)
    val bookImage: ImageView = itemView.findViewById(R.id.bookImage)
}