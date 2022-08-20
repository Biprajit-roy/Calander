package com.example.mycalander

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CalendarView
import android.widget.TextView
import android.widget.CalendarView.OnDateChangeListener

class MainActivity : AppCompatActivity() {

    lateinit var dateTv: TextView
    lateinit var calenderView:CalendarView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dateTv = findViewById(R.id.tvDate)
        calenderView = findViewById(R.id.calenderView)

        calendarView
            .setOnDateChangeListener(
                OnDateChangeListener { _, year, month, dayOfMonth ->

                    val date = (dayOfMonth.toString() + "-"
                            + (month + 1) + "-" + year)

                    dateTv.setText(date)
                })
    }
}