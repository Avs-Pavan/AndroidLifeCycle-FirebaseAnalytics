package com.kevin.androidlifecycle

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button
import androidx.core.os.bundleOf
import com.google.firebase.Firebase
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.analytics

class MainActivity : AppCompatActivity() {

    private lateinit var analytics: FirebaseAnalytics

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Obtain the FirebaseAnalytics instance.
        analytics = Firebase.analytics

        analytics.logEvent("Activity_started", bundleOf(
            "Activity_name" to "main_activity"
        ))

        Log.e("Activity A", "onCreate")

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

    }

    override fun onRestart() {
        super.onRestart()
        Log.e("Activity A", "onRestart")
    }

    override fun onStart() {
        super.onStart()
        Log.e("Activity A", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("Activity A", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("Activity A", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("Activity A", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("Activity A", "onDestroy")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.e("Activity A", "onSaveInstanceState")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.e("Activity A", "onRestoreInstanceState")
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.e("Activity A", "onNewIntent")
    }
}