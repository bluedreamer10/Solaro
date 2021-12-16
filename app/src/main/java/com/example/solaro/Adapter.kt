package com.example.solaro

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.view.view.*
//We need adapter and viewHolder

class Adapter(var planet: List<PlanetData>): RecyclerView.Adapter<Adapter.MyViewHolder>() {


    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view){
        var title = view.title
        var planetImg = view.planet_img
        var galaxy = view.galaxy
        var distance = view.distance
        var gravity = view.gravity
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.view,parent,false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        var dummyImage:Int? = null

        holder.itemView.setOnClickListener{
            val intent2 = Intent(holder.itemView.context,PlanetDetail::class.java)
            intent2.putExtra("planet",planet[position])
            intent2.putExtra("planetImage", dummyImage)
            holder.itemView.context.startActivity(intent2)
        }

        holder.title.text = planet[position].title
        holder.galaxy.text = planet[position].galaxy
        holder.gravity.text = planet[position].gravity + "m/s²"
        holder.distance.text = planet[position].distance + "M km"

        when(planet[position].title!!.toLowerCase())
        {
            "mars" -> {
                dummyImage = R.drawable.ic_mars
            }
            "neptune"->{
                dummyImage = R.drawable.ic_neptune
            }
            "earth"->{
                dummyImage = R.drawable.ic_earth
            }
            "sun"->{
                dummyImage = R.drawable.ic_sun
            }
            "jupiter"->{
                dummyImage = R.drawable.ic_jupiter
            }
            "mercury"->{
                dummyImage = R.drawable.ic_mercury
            }
            "moon"->{
                dummyImage = R.drawable.ic_moon
            }
            "venus"->{
                dummyImage = R.drawable.ic_venus
            }
            "saturn"->{
                dummyImage = R.drawable.ic_saturn
            }
            "uranus"->{
                dummyImage = R.drawable.ic_uranus
            }
        }

        holder.planetImg.setImageResource(dummyImage!!)
    }

    override fun getItemCount(): Int {
       return planet.size
    }
}

