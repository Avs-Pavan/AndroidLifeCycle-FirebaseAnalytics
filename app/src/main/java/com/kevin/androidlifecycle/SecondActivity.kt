package com.kevin.androidlifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.os.bundleOf
import com.google.firebase.Firebase
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.analytics

class SecondActivity : AppCompatActivity() {

    private lateinit var analytics: FirebaseAnalytics

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // Obtain the FirebaseAnalytics instance.
        analytics = Firebase.analytics


        analytics.logEvent(
            "Activity_started", bundleOf(
                "Activity_name" to "second_activity"
            )
        )

        Log.e("Activity B", "onCreate")
    }


    override fun onRestart() {
        super.onRestart()
        Log.e("Activity B", "onRestart")
    }

    override fun onStart() {
        super.onStart()
        Log.e("Activity B", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("Activity B", "onResume")
    }


    override fun onPause() {
        super.onPause()
        Log.e("Activity B", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("Activity B", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("Activity B", "onDestroy")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.e("Activity B", "onSaveInstanceState")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.e("Activity B", "onRestoreInstanceState")
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.e("Activity B", "onNewIntent")
    }
}