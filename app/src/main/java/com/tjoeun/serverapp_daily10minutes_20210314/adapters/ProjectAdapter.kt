package com.tjoeun.serverapp_daily10minutes_20210314.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.ArrayAdapter
import com.tjoeun.serverapp_daily10minutes_20210314.datas.Project
import kotlinx.android.synthetic.main.activity_main.*
import java.text.FieldPosition

class ProjectAdapter(
    val mContext: Context,
    val resId : Int,
    val mList : List<Project>) : ArrayAdapter<Project>(mContext, resId, mList) {

    val inflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertview: View?, parent: ViewGroup): View {

        var tempRow = convertview

        if (tempRow == null) {
            tempRow = inflater.inflatetr(

        }
    }

}