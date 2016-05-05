package com.icaboalo.devfapp.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import com.icaboalo.devfapp.R

class CategoryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)
        val toolbar = findViewById(R.id.app_bar) as Toolbar
        setSupportActionBar(toolbar)
    }
}
