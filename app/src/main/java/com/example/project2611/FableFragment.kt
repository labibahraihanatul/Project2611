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

class FableFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_fable, container, false)

        // RecyclerView
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerBukuFable)

        // Data yang akan ditampilkan
        val data: ArrayList<BukuModel> = ArrayList()
        data.add(
            BukuModel(R.drawable.fabel1, "Si Monyet yang Cerdik",
                "Monyetnya pinter banget")
        )
        data.add(
            BukuModel(R.drawable.fabel2, "Kancil dan Raja Hutan",
                "Kancilnya sangat cerdik")
        )
        data.add(BukuModel(R.drawable.fabel3, "Ayo Jadi Anak Baik",
            "Jadi anak baik banyak teman")
        )
        data.add(BukuModel(R.drawable.fabel4, "Kerja Sama dan Kerja Keras",
            "Kumpulan fabel kerja sama dan kerja keras")
        )
        data.add(BukuModel(R.drawable.fabel5, "Fabel Sains",
            "Petualangan si Kancil")
        )
        data.add(BukuModel(R.drawable.fabel6, "Kisah Petualangan si Kancil",
            "Petualangan si Kancil"))

        // Inisialisasi Adapter
        val adapter = AdapterHome(data)

        // Set LayoutManager
        recyclerView.layoutManager = LinearLayoutManager(context)

        // Set Adapter ke RecyclerView
        recyclerView.adapter = adapter

        return view
    }
}