package com.example.solaro

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_developer_details.*

class DeveloperDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_developer_details)

        backButton.setOnClickListener{
            finish()
        }

        linkedInlogo.setOnClickListener{
            val intentLinkedIn = Intent(Intent.ACTION_VIEW , Uri.parse("https://www.linkedin.com/in/arin-verma-a600051b3/"))
            startActivity(intentLinkedIn)
        }

        instagramlogo.setOnClickListener{
            val intentInstagram = Intent(Intent.ACTION_VIEW , Uri.parse("https://www.instagram.com/arinverma10/"))
            startActivity(intentInstagram)
        }

        githublogo.setOnClickListener{
            val intentGithub = Intent(Intent.ACTION_VIEW , Uri.parse("https://github.com/bluedreamer10"))
            startActivity(intentGithub)
        }
    }
}