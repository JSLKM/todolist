package com.example.listmaker

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TodoListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    var listPositionTextView: TextView = itemView.findViewById(R.id.itemNumber)
    var listTitleTextView: TextView = itemView.findViewById(R.id.itemString)
}