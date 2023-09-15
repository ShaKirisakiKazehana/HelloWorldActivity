package edu.temple.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.widget.Button
import android.widget.EditText
import android.widget.SeekBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // Declare view properties - the first one is done for you
    lateinit var myButton: Button
    lateinit var displayMessageTextView: TextView
    lateinit var nameEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize with views defined in Layout - the first one is done for you
        displayMessageTextView = findViewById(R.id.displayTextView)
        myButton = findViewById<Button>(R.id.clickMeButton)
        nameEditText = findViewById(R.id.nameEditText)
        // Respond to button click event per specifications
        myButton.setOnClickListener{
            displayMessageTextView.text = "Hello, " + nameEditText.text
        }

    }
}