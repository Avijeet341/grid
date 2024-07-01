package com.avi.gridplease

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.avi.gridplease.Adapter.GridAdapter
import com.avi.gridplease.Model.GridItem
import com.avi.gridplease.databinding.ActivityMainBinding

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
            GridItem(R.drawable.pain, "Title 5"),
            GridItem(R.drawable.giyu_tomioka, "Title 6"),
            GridItem(R.drawable.doodle, "Title 7"),
            GridItem(R.drawable.itachi, "Title 8"),
            GridItem(R.drawable.family, "Title 9"),
            GridItem(R.drawable.kimetsu_no_yaiba, "Title 10"),
            GridItem(R.drawable.kokushibo, "Title 11"),
            GridItem(R.drawable.madara, "Title 11"),
            GridItem(R.drawable.vibe, "Title 11"),
            GridItem(R.drawable.this_is_good, "Title 11"),
            GridItem(R.drawable.squad, "Title 11"),
            GridItem(R.drawable.space_light, "Title 12")
        )
    }
}