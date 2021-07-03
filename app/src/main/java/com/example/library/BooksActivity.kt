package com.example.library

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import kotlinx.android.synthetic.main.activity_books.*

class BooksActivity : AppCompatActivity() {

    companion object {
        const val USER_NAME_EXTRA = "userName"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books)

        val userName = intent.getStringExtra(USER_NAME_EXTRA)
        accountName.text = "$userName"

//        val profilePic = intent.getStringExtra("pic")



        var popularRecyclerView: RecyclerView
        var popularBooksArrayList: ArrayList<PopularBooksModels> = ArrayList()



        popularRecyclerView = findViewById(R.id.popularRecyclerView)

        popularBooksArrayList.add(PopularBooksModels("Albet ki Book", "Albert",R.drawable.albert))
        popularBooksArrayList.add(PopularBooksModels("Albet ki Book", "Albert",R.drawable.albert))
        popularBooksArrayList.add(PopularBooksModels("Albet ki Book", "Albert",R.drawable.albert))
        popularBooksArrayList.add(PopularBooksModels("Albet ki Book", "Albert",R.drawable.albert))
        popularBooksArrayList.add(PopularBooksModels("Albet ki Book", "Albert",R.drawable.albert))

        val adapter = PopularBooksAdapter(popularBooksArrayList)
        val layout = LinearLayoutManager(this)
        layout.orientation = LinearLayoutManager.HORIZONTAL
        popularRecyclerView.adapter = adapter
        popularRecyclerView.layoutManager = layout


        var newestRecyclerView: RecyclerView
        var newestBooksList: ArrayList<NewestBooksModels> = ArrayList()

        newestRecyclerView = findViewById(R.id.newestRecyclerView)

        newestBooksList.add(NewestBooksModels("Albet ki Book", "Albert","Motivation",R.drawable.albert,R.drawable.heart))
        newestBooksList.add(NewestBooksModels("Albet ki Book", "Albert","Motivation",R.drawable.albert,R.drawable.heart))
        newestBooksList.add(NewestBooksModels("Albet ki Book", "Albert","Motivation",R.drawable.albert,R.drawable.heart))
        newestBooksList.add(NewestBooksModels("Albet ki Book", "Albert","Motivation",R.drawable.albert,R.drawable.heart))
        newestBooksList.add(NewestBooksModels("Albet ki Book", "Albert","Motivation",R.drawable.albert,R.drawable.heart))
        newestBooksList.add(NewestBooksModels("Albet ki Book", "Albert","Motivation",R.drawable.albert,R.drawable.heart))


        val nadapter = NewestBooksAdapter(newestBooksList)
        val nlayout = LinearLayoutManager(this)
        nlayout.orientation = LinearLayoutManager.VERTICAL
        newestRecyclerView.adapter = nadapter
        newestRecyclerView.layoutManager = nlayout


    }

}