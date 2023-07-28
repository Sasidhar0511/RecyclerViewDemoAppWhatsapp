package com.example.recyclerviewdemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.title = "WhatsApp"

        val viewList = mutableListOf(
            WhatsAppViewDAta(R.drawable.a,"Kumar","Hey there","2.07pm"),
            WhatsAppViewDAta(R.drawable.b,"Raj","Hi","12.00pm"),
            WhatsAppViewDAta(R.drawable.c,"Abi","Attitude King","4.15am"),
            WhatsAppViewDAta(R.drawable.d,"Kiran Kumar","My Life My rule","2.00pm"),
            WhatsAppViewDAta(R.drawable.e,"KD","Biker","10.04am"),
            WhatsAppViewDAta(R.drawable.f,"Priya","Hey there,I am Using Whatsapp","8.27pm"),
            WhatsAppViewDAta(R.drawable.c,"Meda Kumar","Hey there,I am Using Whatsapp","8.27pm"),
            WhatsAppViewDAta(R.drawable.e,"Revathy","Hey there,I am Using Whatsapp","8.27pm"),
            WhatsAppViewDAta(R.drawable.f,"Aiyana","Hey there,I am Using Whatsapp","8.27pm"),
            WhatsAppViewDAta(R.drawable.c,"Dinesh","Attitude King","05.17pm"),
            WhatsAppViewDAta(R.drawable.b,"Priya","Hey there,I am Using Whatsapp","03.27pm"),
            WhatsAppViewDAta(R.drawable.d,"Lakshmi","HMy Life My rule","8.27pm"),
            WhatsAppViewDAta(R.drawable.f,"Priya","Hey there,I am Using Whatsapp","10.27pm"),
            WhatsAppViewDAta(R.drawable.b,"Visvesh","My Life My rule","1.23am"),
            WhatsAppViewDAta(R.drawable.e,"Priya","Attitude King","10.27pm"),
            WhatsAppViewDAta(R.drawable.a,"Pavan","Hey there,I am Using Whatsapp","12.02pm"),
            WhatsAppViewDAta(R.drawable.c,"Hema ","Attitude King","8.27pm")
        )

        val adaptor = WhatsAppViewAdaptor(viewList)
        val rvId = findViewById<RecyclerView>(R.id.recyclerViewId)
        rvId.adapter = adaptor

        rvId.layoutManager = LinearLayoutManager(this)

    }
}