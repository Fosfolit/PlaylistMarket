package com.example.playlistmarket

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val buttonBackMain = findViewById<Button>(R.id.buttonBackMain)
        buttonBackMain.setOnClickListener {
            onDestroy()
        }
        val buttonStyle = findViewById<Button>(R.id.buttonStyle)
        buttonStyle.setOnClickListener {
            val displayIntent = Intent(this, EmtpyActivity::class.java)
            startActivity(displayIntent)
        }
        val buttonShare = findViewById<Button>(R.id.buttonShare)
        buttonShare.setOnClickListener {
            val displayIntent = Intent(this, EmtpyActivity::class.java)
            startActivity(displayIntent)
        }
        val buttonHelper = findViewById<Button>(R.id.buttonHelper)
        buttonHelper.setOnClickListener {
            val displayIntent = Intent(this, EmtpyActivity::class.java)
            startActivity(displayIntent)
        }
        val buttonUserText = findViewById<Button>(R.id.buttonUserText)
        buttonUserText.setOnClickListener {
            val displayIntent = Intent(this, EmtpyActivity::class.java)
            startActivity(displayIntent)
        }
    }
}