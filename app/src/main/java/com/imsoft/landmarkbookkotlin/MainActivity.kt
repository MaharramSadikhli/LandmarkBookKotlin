package com.imsoft.landmarkbookkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.imsoft.landmarkbookkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var landmarkList: ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        landmarkList = ArrayList<Landmark>()

        val pisa = Landmark("Pisa","Italy/ Pisa", R.drawable.pisa)
        val ponteVecchio = Landmark("Ponte Vecchio", "Italy/ Florance", R.drawable.ponte)
        val riatto = Landmark("Riatto", "Italy/ Venezia", R.drawable.riatto)

        landmarkList.add(pisa)
        landmarkList.add(ponteVecchio)
        landmarkList.add(riatto)

        binding.recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
        val landmarkAdapter = LandmarkAdapter(landmarkList)
        binding.recyclerView.adapter = landmarkAdapter
    }
}