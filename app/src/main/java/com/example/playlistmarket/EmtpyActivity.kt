package com.example.playlistmarket

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class EmtpyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_empty)
        val buttonSetting = findViewById<Button>(R.id.buttonBack)
        buttonSetting.setOnClickListener {
            onDestroy()
        }
    }
}