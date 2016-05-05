package com.icaboalo.devfapp.ui.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.icaboalo.devfapp.io.model.OptionApiModel
import java.util.*

/**
 * Created by icaboalo on 5/05/16.
 */
class OptionRecyclerAdapter: RecyclerView.Adapter<OptionRecyclerAdapter.OptionViewHolder>{

    var context: Context
    var inflater: LayoutInflater
    var optionList: ArrayList<OptionApiModel>
    var viewHolderClickListener: OnViewHolderClick

    constructor(context: Context, optionList: ArrayList<OptionApiModel>, viewHolderClickListener: OnViewHolderClick): super(){
        this.context = context
        this.inflater = LayoutInflater.from(context)
        this.optionList = optionList
        this.viewHolderClickListener = viewHolderClickListener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OptionViewHolder? {
        val view = inflater.inflate(android.R.layout.simple_list_item_1, parent, false)
        val viewHolder = OptionViewHolder(view, viewHolderClickListener)
        return viewHolder
    }

    override fun onBindViewHolder(holder: OptionViewHolder, position: Int) {
        val option = optionList[position]
        holder.test!!.text = option.name
    }

    override fun getItemCount(): Int {
        return optionList.size
    }

    inner class OptionViewHolder: RecyclerView.ViewHolder, View.OnClickListener {

        var test: TextView? = null
        var viewHolderClickListener: OnViewHolderClick

        constructor(itemView: View, viewHolderClickListener: OnViewHolderClick) : super(itemView){
            test = itemView.findViewById(android.R.id.text1) as TextView?
            this.viewHolderClickListener = viewHolderClickListener
        }

        override fun onClick(v: View) {
            viewHolderClickListener.onClick(v, adapterPosition)
        }
    }
}