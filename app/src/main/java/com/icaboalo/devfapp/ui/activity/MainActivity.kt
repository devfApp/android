package com.icaboalo.devfapp.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import com.icaboalo.devfapp.R
import com.icaboalo.devfapp.io.model.OptionApiModel
import com.icaboalo.devfapp.ui.adapter.OnViewHolderClick
import com.icaboalo.devfapp.ui.adapter.OptionRecyclerAdapter
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    var optionRecyclerAdapter: OptionRecyclerAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupRecycler()
    }

    fun createOptions(): ArrayList<OptionApiModel>{
        val options = ArrayList<OptionApiModel>()
        options.add(OptionApiModel("Search", "", 10))
        options.add(OptionApiModel("Events", "", 10))
        options.add(OptionApiModel("Files", "", 10))
        options.add(OptionApiModel("Skills", "", 10))
        return options
    }

    fun setupRecycler(){
        optionRecyclerAdapter = OptionRecyclerAdapter(this@MainActivity, createOptions(),  object: OnViewHolderClick {
            override fun onClick(v: View, position: Int) {

            }
        })
        val linearLayout = LinearLayoutManager(this@MainActivity)
        recycler_view.adapter = optionRecyclerAdapter
        recycler_view.layoutManager = linearLayout
    }
}
