package com.example.intents_data_passing_seriaizable_objects_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.intents_data_passing_seriaizable_objects_kotlin.model.User

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        var btn_send = findViewById<Button>(R.id.btn_send)

        btn_send.setOnClickListener {
            openDetailsActivity()
        }
    }

    private fun openDetailsActivity() {
        var intent = Intent(this,DetailsActivity::class.java)
        intent.putExtra("user", User())
        startActivity(intent)
    }
}