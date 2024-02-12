package com.example.zhukov_films.screen.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.zhukov_films.MAIN
import com.example.zhukov_films.R
import com.example.zhukov_films.models.MovieItemModel

class MainAdapter: RecyclerView.Adapter<MainAdapter.MyViewHolder>() {

    private var listMovies = emptyList<MovieItemModel>()

    class MyViewHolder(view: View): RecyclerView.ViewHolder(view) {
            //internal var description: TextView = view.findViewById(R.id.'TODO')
            internal var title: TextView = view.findViewById(R.id.item_title)
            internal var image: ImageView = view.findViewById(R.id.item_img)
            internal var date: TextView = view.findViewById(R.id.item_date)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.title.text = listMovies[position].nameRu
        holder.date.text = listMovies[position].year

        Glide
            .with(MAIN)
            .load(listMovies[position].posterUrl)
            .centerCrop()
            .placeholder(R.drawable.ic_launcher_foreground)
            .into(holder.image)

    }

    override fun getItemCount(): Int {
        return listMovies.size
    }

    fun setList(list: List<MovieItemModel>) {
        listMovies = list
        notifyDataSetChanged()
    }
}