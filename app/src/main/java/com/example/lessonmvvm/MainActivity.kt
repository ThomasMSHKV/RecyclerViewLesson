package com.example.lessonmvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Transformation
import androidx.lifecycle.*
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var photoAdapter: PhotoAdapter
    private var dataList = mutableListOf<DataModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(applicationContext, 2)
        photoAdapter = PhotoAdapter(applicationContext)
        recyclerView.adapter = photoAdapter

        dataList.add(DataModel("Title", "Desc", R.drawable.pic_1))
        dataList.add(DataModel("Title", "Desc", R.drawable.pic_2))
        dataList.add(DataModel("Title", "Desc", R.drawable.pic_1))
        dataList.add(DataModel("Title", "Desc", R.drawable.pic_2))
        dataList.add(DataModel("Title", "Desc", R.drawable.pic_1))
        dataList.add(DataModel("Title", "Desc", R.drawable.pic_2))
        dataList.add(DataModel("Title", "Desc", R.drawable.pic_1))
        dataList.add(DataModel("Title", "Desc", R.drawable.pic_2))
        dataList.add(DataModel("Title", "Desc", R.drawable.pic_1))
        dataList.add(DataModel("Title", "Desc", R.drawable.pic_2))



        photoAdapter.setDataList(dataList)



    }

}