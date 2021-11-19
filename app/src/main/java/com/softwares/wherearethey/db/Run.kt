package com.softwares.wherearethey.db

import android.graphics.Bitmap

data class Run(
    var img: Bitmap? = null,
    var timestamp : Long = 0L,
    var avgSpeedInKMH : Float = 0f,
    var distanceInMeters : Int = 0,
    var timeInMillis : Long = 0L,
    var caloriesBurned : Int = 0
){
    var id : Int? = null
}
