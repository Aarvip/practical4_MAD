package com.example.practical4_mad
import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import com.example.practical4_mad.R

class AlarmService : Service() {
    var mp: MediaPlayer? = null
    override fun onBind(intent: Intent): IBinder? {
        return null
    }
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int
    {
        if (intent != null) {
            mp = MediaPlayer.create(this, R.raw.alarm)
            mp?.start()
        }
        return START_STICKY
    }
    override fun onDestroy() {
        mp?.stop()
        mp?.release()
        super.onDestroy()

    }
}