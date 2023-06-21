package com.assignment.meow.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.assignment.meow.R
import com.assignment.meow.data.cat.response.CatListResponse
import com.assignment.meow.databinding.CatItemBinding
import com.bumptech.glide.Glide

class CatPagingAdapter :
    PagingDataAdapter<CatListResponse.CatListResponseItem, CatPagingAdapter.ViewHolder>(
        CatsComparator
    ) {

    object CatsComparator : DiffUtil.ItemCallback<CatListResponse.CatListResponseItem>() {
        override fun areItemsTheSame(oldItem: CatListResponse.CatListResponseItem, newItem: CatListResponse.CatListResponseItem): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: CatListResponse.CatListResponseItem, newItem: CatListResponse.CatListResponseItem): Boolean {
            return oldItem == newItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = CatItemBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        if (getItem(position)?.breeds != null && getItem(position)?.breeds?.size!! > 0) {
            holder.view.catBreed.visibility = View.VISIBLE
            holder.view.catBreed.text = getItem(position)?.breeds?.first()?.name
        } else
            holder.view.catBreed.visibility = View.GONE

        holder.view.catImage.let {
            Glide.with(holder.itemView.context)
                .load(getItem(position)?.url)
                .placeholder(R.drawable.cat_paceholder)
                .into(
                it
            )
        }
    }

    class ViewHolder(val view: CatItemBinding) : RecyclerView.ViewHolder(view.root)

}
