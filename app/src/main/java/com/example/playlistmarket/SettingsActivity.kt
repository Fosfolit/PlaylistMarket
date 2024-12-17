package com.example.playlistmarket

import android.content.Intent
import android.net.Uri
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
            val openLinkIntent = Intent(Intent.ACTION_SEND)

            openLinkIntent.setType("plain/text")
            openLinkIntent.putExtra(Intent.EXTRA_TEXT, "vds")
            openLinkIntent.putExtra(Intent.EXTRA_STREAM, "2134231444")
            startActivity(openLinkIntent)
        }
        val buttonUserText = findViewById<Button>(R.id.buttonUserText)
        buttonUserText.setOnClickListener {
            val address = Uri.parse("https://yandex.ru/legal/practicum_offer/")
            val openLinkIntent = Intent(Intent.ACTION_VIEW)
            openLinkIntent.data = address
            startActivity(openLinkIntent)
        }
    }

}