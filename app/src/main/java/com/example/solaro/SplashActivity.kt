package com.example.solaro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        //Below 2 lines are used to hide the bottom three key navigation

        window.decorView.apply {
            systemUiVisibility =
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN
        }
        //Below three lines are to provide translation effect to the titles and images in splash screen
//        lottie.animate().translationX(1600f).setDuration(1000).setStartDelay(2500)
//        textViewHeading.animate().translationX(1600f).setDuration(1000).setStartDelay(2500)
        tag.animate().translationX(1600f).setDuration(1000).setStartDelay(2500)

        Handler().postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 3150) // 3500 is the delayed time in milliseconds.
    }
}