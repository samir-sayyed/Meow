package com.assignment.meow.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import androidx.core.view.isVisible
import androidx.paging.LoadState
import androidx.paging.LoadStateAdapter
import androidx.recyclerview.widget.RecyclerView
import com.assignment.meow.R

/**
 * Loader adapter used for showing progress bar while loading pagination page
 * we can us this adapter for adding error message or refresh button for reloading page if needed
 */
class LoaderAdapter : LoadStateAdapter<LoaderAdapter.LoaderViewHolder>() {

    override fun onBindViewHolder(holder: LoaderViewHolder, loadState: LoadState) {
        holder.bind(loadState)
    }

    override fun onCreateViewHolder(parent: ViewGroup, loadState: LoadState): LoaderViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.loader_item, parent, false)
        return LoaderViewHolder(view)
    }

    class LoaderViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        private val pageProgressBar = itemView.findViewById<ProgressBar>(R.id.page_progress_bar)

        fun bind(loadState: LoadState){
            pageProgressBar.isVisible = loadState is LoadState.Loading
        }
    }
}