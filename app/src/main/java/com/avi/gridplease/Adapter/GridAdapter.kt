package com.avi.gridplease.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.avi.gridplease.Model.GridItem
import com.avi.gridplease.databinding.GridItemBinding

class GridAdapter(
    private val gridItemList:ArrayList<GridItem>,
    private val listener:(GridItem,Int)->Unit
):RecyclerView.Adapter<GridAdapter.ViewHolder>() {

    inner class ViewHolder(private var gridItemBinding: GridItemBinding)
        :RecyclerView.ViewHolder(gridItemBinding.root){
        fun bindItem(gridItem:GridItem){
               gridItemBinding.image.setImageResource(gridItem.imageResId)
               gridItemBinding.imageDiscription.text=gridItem.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
         val  v=GridItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return gridItemList.size
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
         holder.bindItem(gridItemList[position])
        holder.itemView.setOnClickListener {
            listener(gridItemList[position],position)
        }
    }


}