package com.example.oopdemo

import android.util.Log

class MyCar : Car(),SpeedController {
    override fun start(){
        Log.i("MyTag","this is my car starting ... brand id id ${getBrandId()} ")
    }

    override fun accelerate() {

    }

    override fun decelerate() {

    }
}