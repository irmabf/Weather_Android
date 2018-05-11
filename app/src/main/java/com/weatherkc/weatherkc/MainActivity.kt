package com.weatherkc.weatherkc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity(), View.OnClickListener  {

    val TAG = MainActivity::class.java.canonicalName

    //lateinit  var forecastImage: ImageView
    val forecastImage by lazy {
        findViewById<ImageView>(R.id.forecast_image)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Accedemos a la vista desde nuestro controlador, equivalente a los outlets de iOS
        val europeanButton = findViewById<Button>(R.id.european_system_button)
        val americanButton = findViewById<Button>(R.id.american_system_button)

        //git forecastImage = findViewById(R.id.forecast_image)

       // if (europeanButton != null){
        //    europeanButton.setOnClickListener(this)
       // }
        europeanButton?.setOnClickListener{
            forecastImage.setImageResource(R.drawable.offline_weather)
        }
        americanButton?.setOnClickListener{
            forecastImage.setImageResource(R.drawable.offline_weather2)
        }

        Log.v(TAG, "Han llamado a onCreate")

    }

    override fun onClick(v: View?) {
       /* if (v != null){
            if (v.id == R.id.european_system_button){
                Log.v(TAG, "Han pulsado el botón europeo")
            }else if (v.id == R.id.american_system_button){
                Log.v(TAG, "Han pulsado el botón americano")
            }
        }*/

       /* Log.v(TAG, when (v?.id){
            R.id.european_system_button -> "Han pulsado el botón europeo"
            R.id.american_system_button -> "Han pulsado el botón americano"
            else -> "No se lo que han pulsado"

        })*/
        val imageToShow = when (v?.id) {
            R.id.european_system_button -> R.drawable.offline_weather
            else -> R.drawable.offline_weather2
        }
        forecastImage?.setImageResource(imageToShow)
    }
}

