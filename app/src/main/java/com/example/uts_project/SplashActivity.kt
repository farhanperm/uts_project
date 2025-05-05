package com.example.uts_project

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView


class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splash)

        val fade_in = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        val logo = findViewById<ImageView>(R.id.logo)
        val app_desc = findViewById<TextView>(R.id.app_name)

        logo.startAnimation(fade_in);
        app_desc.startAnimation(fade_in);

        Handler(Looper.getMainLooper()).postDelayed({
            goToLoginActivity()
        }, 3000L)
        }
        private fun goToLoginActivity(){
            Intent(this, LoginActivity::class.java).also {
                startActivity(it)
                finish()
            }
        }
    }