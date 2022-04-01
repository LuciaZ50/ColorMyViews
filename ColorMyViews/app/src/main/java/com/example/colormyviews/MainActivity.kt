package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var boxOneText : TextView
    private lateinit var boxTwoText : TextView
    private lateinit var boxThreeText : TextView
    private lateinit var boxFourText : TextView
    private lateinit var boxFiveText : TextView

    private lateinit var rootConstraintLayout : View

    private lateinit var redButton : Button
    private lateinit var greenButton : Button
    private lateinit var yellowButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        boxOneText = findViewById<TextView>(R.id.box_one_text)
        boxTwoText = findViewById<TextView>(R.id.box_two_text)
        boxThreeText = findViewById<TextView>(R.id.box_three_text)
        boxFourText = findViewById<TextView>(R.id.box_four_text)
        boxFiveText = findViewById<TextView>(R.id.box_five_text)


        redButton = findViewById<Button>(R.id.red_button)
        greenButton = findViewById<Button>(R.id.green_button)
        yellowButton = findViewById<Button>(R.id.yellow_button)

        setListeners()
    }


    private fun setListeners() {

        val clickableViews: List<View> =
            listOf(
                boxOneText, boxTwoText, boxThreeText,
                boxFourText, boxFiveText, rootConstraintLayout,
                redButton, greenButton, yellowButton
            )

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }
    

    private fun makeColored(view: View) {
        when (view.id) {

// Boxes using Color class colors for background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            R.id.box_three_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_four_text -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_five_text -> view.setBackgroundColor(Color.BLUE)

// Boxes using custom colors for background
            R.id.red_button -> boxThreeText.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> boxFourText.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> boxFiveText.setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}