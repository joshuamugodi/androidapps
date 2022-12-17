package com.example.oopdemo

import android.util.Log

open class Car {
    var maxSpeed = 30
    open fun start(){
        Log.i("MyTage", "Car is starting ... ")
        Log.i("MyTage", " maximum speed is $maxSpeed ")
    }
}