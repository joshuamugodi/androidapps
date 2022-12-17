package com.example.easycom

import android.app.DatePickerDialog
import android.os.Build.VERSION_CODES.R
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.content.res.ComplexColorCompat.inflate
import android.support.v4.graphics.drawable.DrawableCompat.inflate
import android.support.v7.app.AppCompatActivity
import android.widget.DatePicker
import android.widget.Toast
import androidx.core.content.res.ComplexColorCompat.inflate
import androidx.core.graphics.drawable.DrawableCompat.inflate
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import java.util.Calendar


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    class ActivityMainBinding {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)


        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
//         Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    botton.setOnClickListener{ view ->
        ClickDatePicker(view)
        Toast.makeText(this,"botton works",Toast.LENGTH_LONG).show()
    }
    fun ClickDatePicker(view:view){

        val myCalender = calender.getInstance()
        val year = myCalender.get(Calendar.YEAR)
        val month = myCalender.get(Calendar.MONTH)
        val day = myCalender.get(Calendar.DAY_OF_MONTH)
        DatePickerDialog(this,
            DatePickerdialog.OnDateSetListener {
                    view,selectedyear, selectedmonth, selecteddayOfmonth ->
                Toast.makeText(this,
                "the chosen year is $selectedyear, the month is ${selectedmonth+1}and the day is $selectedyear"
                    ,Toast.LENGTH_LONG).show()
                val selectedDate = "$selecteddayOfmonth/${selecteddayOfmonth+1}/$selectedyear"
                tvSelectionDate.setText(selectedDate)
                val sdf = simpleDateformat("dd,MM,yyyy", locale.ENGLISH)
                val theDate = sdf.parse(selectedDate)
            }
            ,year
            ,month
            ,day).show()
    }
}

}