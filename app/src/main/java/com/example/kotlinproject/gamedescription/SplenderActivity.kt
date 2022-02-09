package com.example.kotlinproject.gamedescription

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import com.example.kotlinproject.R
import com.example.kotlinproject.baseactivities.HomeActivity
import kotlinx.android.synthetic.main.activity_splender.*

class SplenderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splender)

        val v: VideoView = findViewById(R.id.videosplender)
        v.setVideoPath("android.resource://com.example.kotlinproject/"+R.raw.splender)
        v.start()
        v.setOnPreparedListener{
                m: MediaPlayer ->
            m.setOnVideoSizeChangedListener{
                    m: MediaPlayer?, width: Int, height: Int ->
                val mediaController = MediaController(this)
                v.setMediaController(mediaController)
                mediaController.setAnchorView(v)
            }
        }

        val goIntent = Intent(this, HomeActivity::class.java)

        button_back.setOnClickListener {
            startActivity(goIntent)
        }
    }
}