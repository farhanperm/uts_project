package com.example.uts_project

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class ListChattingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_chatting)

        val chatListView = findViewById<ListView>(R.id.chatListView)
        val chatData = listOf(
            "Mamah: Farhan dimana?",
            "Ardika: Han mabar!",
            "Rapi: OTW kapan?",
            "Fakhri: Aan tolong jemput"
        )

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, chatData)
        chatListView.adapter = adapter
    }
}