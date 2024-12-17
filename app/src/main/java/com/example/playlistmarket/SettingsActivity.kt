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
        val button1 = findViewById<Button>(R.id.buttonStyle)
        button1.setOnClickListener {
            val displayIntent = Intent(this, EmtpyActivity::class.java)
            startActivity(displayIntent)
        }
        val button2 = findViewById<Button>(R.id.buttonShare)
        button2.setOnClickListener {
            val displayIntent = Intent(this, EmtpyActivity::class.java)
            startActivity(displayIntent)
        }
        val button3 = findViewById<Button>(R.id.buttonHelper)
        button3.setOnClickListener {
            val displayIntent = Intent(this, EmtpyActivity::class.java)
            startActivity(displayIntent)
        }
        val button4 = findViewById<Button>(R.id.buttonSS)
        button4.setOnClickListener {
            val displayIntent = Intent(this, EmtpyActivity::class.java)
            startActivity(displayIntent)
        }
    }
}