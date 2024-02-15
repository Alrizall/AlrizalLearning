package com.example.home.adapter

import androidx.recyclerview.widget.RecyclerView
import com.example.admin.databinding.ItemPemberitahuanBinding
import com.example.core.DashboardInformation



class ItemPermberitahuanViewHolder (private val binding: ItemPemberitahuanBinding) : RecyclerView.ViewHolder (binding.root){
    fun bind (data : DashboardInformation) {
        binding.tvInformation.text = data.title
//        Glide.with(binding.uvUx1.context).load(data.image).into(binding.uvUx1) //load image
    }
}