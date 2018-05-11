package com.weatherkc.weatherkc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle

import kotlinx.android.synthetic.main.activity_forecast.*
import kotlin.math.max
import kotlin.math.min

class ForecastActivity : AppCompatActivity() {

    companion object {
        val TAG = ForecastActivity::class.java.canonicalName
    }

<<<<<<< HEAD
    var forecast: Forecast? = null
        set(value) {
            if (value != null){
                forecast_image.setImageResource(value.icon)
                forecast_description.text = value.description

                maxTemp.text = getString(R.string.max_temp_format, value.maxTemp)
                minTemp.text = getString(R.string.min_temp_format, value.minTemp)
                humidity.text = getString(R.string.humidity_format, value.humidity)
            }
=======
        //Intanciamos a la clase Forecast
        val forecast = Forecast(
                25f,
                10f,
                35f,
                "Soleado con alguna nube",
                R.drawable.ico_01
        )
        european_system_button?.setOnClickListener{
            forecast_image.setImageResource(R.drawable.offline_weather)
        }
        american_system_button.setOnClickListener{
            forecast_image.setImageResource(R.drawable.offline_weather2)
>>>>>>> 61debf701f4af9e223f582f05d6edea0d01f2de2
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forecast)

        forecast = Forecast(
                maxTemp = 25f,
                minTemp = 10f,
                humidity = 35f,
                description = "Soleado con alguna nube",
                icon = R.drawable.ico_01)

    }
}

