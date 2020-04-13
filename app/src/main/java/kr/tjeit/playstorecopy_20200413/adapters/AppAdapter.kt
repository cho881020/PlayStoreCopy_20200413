package kr.tjeit.playstorecopy_20200413.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kr.tjeit.playstorecopy_20200413.R
import kr.tjeit.playstorecopy_20200413.datas.App

class AppAdapter(context: Context, resId: Int, list:ArrayList<App>) : ArrayAdapter<App>(context, resId, list) {

    val mContext = context
    val mList = list
    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        tempRow?.let {
//            null이 아닐때
        }.let {
//            null 일때
            tempRow = inf.inflate(R.layout.app_list_item, null)
        }

        val row = tempRow!!


        return row
    }


}