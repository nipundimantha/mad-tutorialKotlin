package com.kotlinTute.myfirstkotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

/**
 * The myfirstkotlin program implements an application that
 * simply displays the age to the standard output.
 *
 * @author  Dimantha H.V.N
 * @version 1.0
 * @since   2020-05-23
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onSubmit(view: View){

            val currentYear = Calendar.getInstance().get(Calendar.YEAR)
            txtAge.text = "AGE : " + (currentYear - inputYear.text.toString().toInt());
        }
}
