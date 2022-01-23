package com.bigstep.playlibproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.bigstep.playlib.ReactActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnReact: Button = findViewById<Button>(R.id.btnReact)
        btnReact.setOnClickListener {
            startActivity(
                Intent(this@MainActivity, ReactActivity::class.java
            )
            )
        }
    }
}