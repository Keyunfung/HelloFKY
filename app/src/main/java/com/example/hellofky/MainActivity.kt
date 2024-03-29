package com.example.hellofky

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //To show UI  //R = Resource class
        //example - var counter: Int //var variable

        val buttonShow: Button = findViewById(R.id.buttonShow)//val = value
        val imageViewQR = findViewById<ImageView>(R.id.imageViewQR)

        buttonShow.setOnClickListener {
            //To handle the click event of button
            imageViewQR.visibility = View.VISIBLE
        }
    }
}