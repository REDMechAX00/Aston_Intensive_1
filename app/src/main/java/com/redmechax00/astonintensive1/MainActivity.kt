package com.redmechax00.astonintensive1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickMain(v: View) {
        Toast.makeText(this, getString(R.string.btn_main_click_text), Toast.LENGTH_SHORT).show()
    }
}