package com.example.prak7pbm

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_service.*

class Service : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service)
        var MediaPlayer: MediaPlayer? = MediaPlayer.create(this,R.raw.buto)
        btnplay.setOnClickListener{
            MediaPlayer?.start()
        }
        btnpause.setOnClickListener{
            MediaPlayer?.pause()
        }
        btnsetop.setOnClickListener{
            MediaPlayer?.pause()
            MediaPlayer?.seekTo(0)
        }
    }

}
