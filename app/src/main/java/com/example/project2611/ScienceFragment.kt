package com.example.project2611

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.project2611.AdapterHome
import com.example.project2611.BukuModel
import com.example.project2611.R

class ScienceFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_science, container, false)

        // RecyclerView
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerBukuScience)

        // Data yang akan ditampilkan
        val data: ArrayList<BukuModel> = ArrayList()
        data.add(
            BukuModel(R.drawable.science1, "Tiga Dalam Kayu",
                "Lorem Ipsum Dolor Sit Amet Lorem Ipsum Dolor Sit Amet")
        )
        data.add(
            BukuModel(R.drawable.science2, "The Poppy War",
                "Lorem Ipsum Dolor Sit Amet Lorem Ipsum Dolor Sit Amet")
        )
        data.add(BukuModel(R.drawable.science3, "Stranger The Dreamer",
            "Lorem Ipsum Dolor Sit Amet Lorem Ipsum Dolor Sit Amet")
        )
        data.add(
            BukuModel(R.drawable.science2, "The Poppy War",
                "Lorem Ipsum Dolor Sit Amet Lorem Ipsum Dolor Sit Amet")
        )
        data.add(
            BukuModel(R.drawable.science3, "Stranger The Dreamer",
                "Lorem Ipsum Dolor Sit Amet Lorem Ipsum Dolor Sit Amet")
        )
        data.add(
            BukuModel(R.drawable.science1, "Tiga Dalam Kayu",
                "Lorem Ipsum Dolor Sit Amet Lorem Ipsum Dolor Sit Amet")
        )
        // Inisialisasi Adapter
        val adapter = AdapterHome(data)

        // Set LayoutManager
        recyclerView.layoutManager = LinearLayoutManager(context)

        // Set Adapter ke RecyclerView
        recyclerView.adapter = adapter

        return view
    }
}