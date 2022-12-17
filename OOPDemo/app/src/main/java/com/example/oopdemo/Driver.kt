package com.example.oopdemo

import android.util.Log

class Driver(name: String, credit : Int) {
     private var totalCredits = 50
    private var driverName = ""
    init {
        totalCredits += 150
        driverName = name
    }
    fun showDetails(){
        Log.i("MyTag", "name of the driver is $driverName with $totalCredits credits")
    }
}