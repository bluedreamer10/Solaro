package com.example.solaro

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_planet_detail.*

class PlanetDetail : AppCompatActivity() {

    private lateinit var obj: PlanetData
    private var planetImg: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_planet_detail)

        window.decorView.apply {
            systemUiVisibility = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN
        }

        obj = intent.getParcelableExtra("planet")!!
        planetImg = intent.getIntExtra("planetImage", -1)
        setData(obj,planetImg!!)

        button_info.setOnClickListener {
            val intenttoNew = Intent(this,FinalActivity::class.java)
            startActivity(intenttoNew)
        }

        backBtnDetailPage.setOnClickListener{
            finish()
        }
    }

    private fun setData(obj:PlanetData,planetImage: Int){
        title_info.text = obj.title
        distance_info.text = obj.distance + "M km"
        gravity_info.text = obj.gravity + "m/s²"
        overview_info.text = obj.overview
        planet_img_info.setImageResource(planetImg!!)
        galaxy_info.text = obj.galaxy
    }
}