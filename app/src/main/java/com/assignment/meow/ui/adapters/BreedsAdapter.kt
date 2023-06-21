package com.assignment.meow.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.assignment.meow.data.cat.response.BreedListResponse
import com.assignment.meow.databinding.BreedItemBinding

class BreedsAdapter(
    private val breedList: BreedListResponse?,
    val onItemClick: (BreedListResponse.BreedListResponseItem) -> Unit
) :
    Adapter<BreedsAdapter.BreedViewHolder>() {


    class BreedViewHolder(val view: BreedItemBinding) : ViewHolder(view.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BreedViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = BreedItemBinding.inflate(inflater, parent, false)
        return BreedViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return breedList?.size!!
    }

    override fun onBindViewHolder(holder: BreedViewHolder, position: Int) {
        holder.view.breed.text = breedList?.get(position)?.name ?: "cat"
        holder.view.root.setOnClickListener {
            breedList?.get(position)?.let { it1 -> onItemClick(it1) }
        }
    }
}