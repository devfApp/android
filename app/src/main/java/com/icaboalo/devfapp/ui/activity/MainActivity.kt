package com.icaboalo.devfapp.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.StaggeredGridLayoutManager
import android.support.v7.widget.Toolbar
import android.view.View
import android.widget.Toast
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
        val toolbar: Toolbar = findViewById(R.id.app_bar) as Toolbar
        setSupportActionBar(toolbar)
        setupRecycler(createOptions())
    }

    fun createOptions(): ArrayList<OptionApiModel>{
        val options = ArrayList<OptionApiModel>()
        options.add(OptionApiModel("Search", R.drawable.ic_code_black_48dp))
        options.add(OptionApiModel("Events", (R.drawable.ic_event_black_48dp)))
        options.add(OptionApiModel("Files", R.drawable.ic_folder_black_48dp))
        options.add(OptionApiModel("Users", R.drawable.ic_people_black_48dp))
        options.add(OptionApiModel("Skills", R.drawable.ic_code_black_48dp))
        options.add(OptionApiModel("Senseis", R.drawable.ic_code_black_48dp))
        options.add(OptionApiModel("", 0))
        options.add(OptionApiModel("", 0))
        options.add(OptionApiModel("", 0))
        return options
    }

    fun setupRecycler(optionsList: ArrayList<OptionApiModel>){
        optionRecyclerAdapter = OptionRecyclerAdapter(this@MainActivity, optionsList,  object: OnViewHolderClick {
            override fun onClick(v: View, position: Int) {
                Toast.makeText(this@MainActivity, optionsList[position].name, Toast.LENGTH_SHORT).show()
            }
        })
        val gridLayout = StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL)
        recycler_view.adapter = optionRecyclerAdapter
        recycler_view.layoutManager = gridLayout
    }
}
