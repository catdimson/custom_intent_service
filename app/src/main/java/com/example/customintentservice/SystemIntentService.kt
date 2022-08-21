package com.example.customintentservice

import android.app.IntentService
import android.content.Context
import android.content.Intent
import android.os.Handler
import android.os.Looper
import android.widget.Toast

class SystemIntentService : IntentService("SystemIntentService") {

    companion object {
        private const val TEXT_EXTRA_KEY = "KEY_EXTRA_TEXT"

        fun run(context: Context, message: String) {
            val serviceIntent = Intent(context, SystemIntentService::class.java)
            serviceIntent.putExtra(TEXT_EXTRA_KEY, message)
            context.startService(serviceIntent)
        }
    }

    override fun onHandleIntent(intent: Intent?) {
        val message = intent?.getStringExtra(TEXT_EXTRA_KEY)
        Handler(Looper.getMainLooper()).post {
            Toast.makeText(this, message, Toast.LENGTH_LONG).show()
        }
    }
}