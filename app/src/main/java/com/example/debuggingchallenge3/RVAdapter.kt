package com.example.debuggingchallenge3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.debuggingchallenge3.*
import kotlinx.android.synthetic.main.item_row.view.*

class RVAdapter(private var definitions: ArrayList<ArrayList<String>>): RecyclerView.Adapter<RVAdapter.ItemViewHolder>() {
    class ItemViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_row,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val definition = definitions[position]

        holder.itemView.apply {
            tvWord.text = definition[0]
            tvDefinition.text = definition[1]
        }
    }

    override fun getItemCount() = definitions.size

    fun update(){
        notifyDataSetChanged()
    }
}