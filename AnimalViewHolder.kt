package com.example.animallistkotlin

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_layout.view.*

class AnimalViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
{
    fun setData(animalModel:Animal){
        itemView.apply {
         tvAnimalName.text = animalModel.name
            Glide.with(ivAnimal).load(animalModel.image).into(ivAnimal)
        }
    }
}