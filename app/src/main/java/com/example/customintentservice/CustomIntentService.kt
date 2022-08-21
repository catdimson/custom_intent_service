package com.example.customintentservice

import android.content.Context
import android.content.Intent
import android.widget.Toast

class CustomIntentService : AbstractCustomIntentService("CustomIntentServiceThread") {

    companion object {
        private const val TEXT_EXTRA_KEY = "KEY_EXTRA_TEXT"

        fun run(context: Context, message: String) {
            val serviceIntent = Intent(context, CustomIntentService::class.java)
            serviceIntent.putExtra(TEXT_EXTRA_KEY, message)
            context.startService(serviceIntent)
        }
    }

    override fun onHandleIntent(intent: Intent?) {
        val message = intent?.getStringExtra(TEXT_EXTRA_KEY)
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
}