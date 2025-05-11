package com.example.kotlinservicesapp

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import android.provider.Settings

class MyService: Service() {

    // to play music, we need a media player object
    lateint var mediaPlayer: MediaPlayer

    override fun onBind(intent: Intent?): IBinder? {

        // return null: if binding is not allowed
        return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        mediaPlayer = MediaPlayer.create(
            this,
            Settings.System.DEFAULT_RINGTONE_URI
        )

        mediaPlayer.isLooping

        mediaPlayer.start()

        return START_STICKY
    }

    override fun onDestroy() {
        super.onDestroy()

        mediaPlayer.stop()
    }
}