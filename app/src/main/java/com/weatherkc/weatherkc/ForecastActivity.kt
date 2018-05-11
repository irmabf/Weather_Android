package com.weatherkc.weatherkc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle

import kotlinx.android.synthetic.main.activity_forecast.*
import kotlin.math.min

class ForecastActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forecast)

        val forecast = Forecast(
                maxTemp = 25f,
                minTemp = 10f,
                humidity = 35f,
                description = "Soleado con alguna nube",
                icon = R.drawable.ico_01)

        setForecast(forecast)

    }

    fun setForecast(forecast: Forecast){
        forecast_image.setImageResource(forecast.icon)
        forecast_description.text = forecast.description

        maxTemp.text = getString(R.string.max_temp_format, forecast.maxTemp)
        minTemp.text = getString(R.string.min_temp_format, forecast.minTemp)
        humidity.text = getString(R.string.humidity_format, forecast.humidity)
    }

}

