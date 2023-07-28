package com.example.recyclerviewdemoapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WhatsAppViewAdaptor(private var whatsAppViewList : List<WhatsAppViewDAta>) : RecyclerView.Adapter<WhatsAppViewAdaptor.WhatsappViewHolder>() {

    inner class WhatsappViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val profileImage: ImageView = itemView.findViewById(R.id.ivProfileImage)
        val tvName: TextView = itemView.findViewById(R.id.tvName)
        val tvAbout: TextView = itemView.findViewById(R.id.tvAbout)
        val tvTime: TextView = itemView.findViewById(R.id.tvTime)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WhatsappViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_view,parent,false)

        return WhatsappViewHolder(view)
    }

    override fun getItemCount(): Int {
        return whatsAppViewList.size
    }

    override fun onBindViewHolder(holder: WhatsappViewHolder, position: Int) {
        holder.profileImage.setImageResource(whatsAppViewList[position].image)
        holder.tvName.text = whatsAppViewList[position].name
        holder.tvAbout.text = whatsAppViewList[position].About
        holder.tvTime.text = whatsAppViewList[position].time
    }
}