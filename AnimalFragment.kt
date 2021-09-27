package com.example.animallistkotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_animal.*


class AnimalFragment : Fragment(R.layout.fragment_animal) {
    private var list: ArrayList<Animal> = ArrayList()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buildAnimalList()
        setRecycleView()
    }

    private fun setRecycleView() {
         var adapter = AnimalAdapter(list)
        var linearLayoutManager = LinearLayoutManager(context)
        recycleView.adapter = adapter
        recycleView.layoutManager=linearLayoutManager
    }

    private fun buildAnimalList() {
for (i in 0..10){
    list.add(Animal(R.drawable.kurama,"fox"))
}
    }

}