package com.example.practical4_mad
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.example.practical4_mad.AlarmService

class AlarmBroadcastReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        val action = intent.getStringExtra("Service1")
        if (action == "Start") {
            context.startService(Intent(context, AlarmService::class.java))
        } else if (action == "Stop") {
            context.stopService(Intent(context, AlarmService::class.java))
        }
    }
}
