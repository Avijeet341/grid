package com.avi.gridplease

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.avi.gridplease.Adapter.GridAdapter
import com.avi.gridplease.Model.GridItem
import com.avi.gridplease.databinding.ActivityMainBinding
import com.avi.gridplease.databinding.GridItemBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupStaggeredGridView()
    }

    private fun setupStaggeredGridView() {
         binding.recyclerView.apply {
             layoutManager=StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
             adapter=GridAdapter(createGridList()){gridItem,position->
                 Toast.makeText(this@MainActivity,"Clicked on GridItem :${gridItem.title}",Toast.LENGTH_SHORT).show()
             }
         }
    }

    private fun createGridList(): ArrayList<GridItem> {
       return  arrayListOf(
           GridItem(R.drawable.spider3, "Title 1"),
           GridItem(R.drawable.hashira, "Title 2"),
           GridItem(R.drawable.india, "Title 3"),
           GridItem(R.drawable.kk, "Title 4"),
           GridItem(R.drawable.kk, "Title 5"),
           GridItem(R.drawable.kk, "Title 6"),
           GridItem(R.drawable.kk, "Title 7"),
           GridItem(R.drawable.kk, "Title 8"),
           GridItem(R.drawable.kk, "Title 9"),
           GridItem(R.drawable.kk, "Title 10"),
           GridItem(R.drawable.kk, "Title 11"),
           GridItem(R.drawable.kk, "Title 11"),
           GridItem(R.drawable.kk, "Title 11"),
           GridItem(R.drawable.kk, "Title 11"),
           GridItem(R.drawable.kk, "Title 11"),
           GridItem(R.drawable.kk, "Title 12")
       )
    }
}