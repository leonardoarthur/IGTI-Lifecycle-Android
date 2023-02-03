package com.example.igtiandroid_ciclodevida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, "Main Activity::onCreate")
        configurarListeners()
    }

    private fun configurarListeners() {
        TODO("Not yet implemented")
    }


    companion object {
        private const val TAG =
            "Log teste" //pode ser inserido no campo de tag do log, para agilizar o tempo, como uma var dentro do log
    }

    override fun onStart() {
        super.onStart()
        Log.i("on Start LOG", "main activity::onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("on Resume LOG", "main Activity::onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Pause LOG", "main Activity::onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("on Stop LOG", "main activity::onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("on Restart LOG", "main activity::onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("on destroy LOG", "KABUUUUM")
    }
}