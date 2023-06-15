package com.example.trainingrecyclerview3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.trainingrecyclerview3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private val adapter = CatAdapter()
    private val imadeIdList = listOf(
        R.drawable.cat_1,
        R.drawable.cat_2,
        R.drawable.cat_3,
        R.drawable.cat_4,
        R.drawable.cat_5,
        R.drawable.cat_6,
        R.drawable.cat_7,
        R.drawable.cat_8,
        R.drawable.cat_9,
        R.drawable.cat_10,
        R.drawable.cat_11
    )
    private var index = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        itit()
    }

    private fun itit() {

        binding.apply {
            rcView.layoutManager = GridLayoutManager(this@MainActivity, 3)
            rcView.adapter = adapter
            btAdd.setOnClickListener {
                if (index > 10 ) index = 0
                val cat = Cat(imadeIdList[index], "Котя $index")
                adapter.addCat(cat)
                index++
            }
        }


    }


}