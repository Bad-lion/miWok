package com.example.miwok


import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        val playButtone = findViewById<Button>(R.id.play)
        val pauseButtone = findViewById<Button>(R.id.pause)
        var mediaPlayer: MediaPlayer = MediaPlayer.create(this, R.raw.mirbek)

        val playButtone2 = findViewById<Button>(R.id.play2)
        val pauseButtone2 = findViewById<Button>(R.id.pause2)
        var mediaPlayer2: MediaPlayer = MediaPlayer.create(this, R.raw.second)






        playButtone.setOnClickListener {
            if (!mediaPlayer.isPlaying && !mediaPlayer.isPlaying) {
                mediaPlayer.start()
            }

        }

        pauseButtone.setOnClickListener {
            if (mediaPlayer.isPlaying || mediaPlayer2.isPlaying) {
                mediaPlayer.pause()
            }


        }

        playButtone2.setOnClickListener {
            if (!mediaPlayer.isPlaying && !mediaPlayer2.isPlaying) {
                mediaPlayer2.start()
            }

        }

        pauseButtone2.setOnClickListener {
            if (mediaPlayer.isPlaying || mediaPlayer2.isPlaying) {
                mediaPlayer2.pause()
            }

        }
    }
}
