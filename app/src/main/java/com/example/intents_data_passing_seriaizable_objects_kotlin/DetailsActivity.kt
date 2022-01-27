package com.example.intents_data_passing_seriaizable_objects_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.intents_data_passing_seriaizable_objects_kotlin.model.User

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        initViews()
    }

    private fun initViews() {
        var tv_user = findViewById<TextView>(R.id.tv_object)
        var user = intent.getSerializableExtra("user")

        tv_user.text = user.toString()
    }
}