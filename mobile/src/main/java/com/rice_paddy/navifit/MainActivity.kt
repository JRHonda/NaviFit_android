package com.rice_paddy.navifit

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Button
import android.view.View


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clickedButton(test(69))



        // Example of a call to a native method
        sampleTextField.text = "My name is Justin Honda."
        Log.d("myTag", "This is my message");
    }

    override fun onResume() {
        super.onResume()

    }

    override fun onStart() {
        super.onStart()

         //Function that changes the text of the button when button is clicked
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String
    

    fun test(number: Int): String {
        return number.toString()
    }

    fun clickedButton(message: String) {
        val clkBtn = findViewById(R.id.testButton) as Button

        clkBtn.text = "Click me"

        clkBtn.setOnClickListener {
            testButton.text = message
            Log.d("myTag", "You have clicked me");
        }
    }

    companion object {

        // Used to load the 'native-lib' library on application startup.
        init {
            System.loadLibrary("native-lib")
        }
    }
}
