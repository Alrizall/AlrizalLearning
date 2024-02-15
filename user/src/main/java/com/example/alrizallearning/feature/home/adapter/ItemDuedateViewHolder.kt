package com.example.home.adapter

import androidx.recyclerview.widget.RecyclerView
import com.example.admin.databinding.ItemCourseBinding
import com.example.core.DuedateInformation

class ItemDuedateViewHolder (private val binding: ItemCourseBinding) : RecyclerView.ViewHolder (binding.root){
    fun bind (data : DuedateInformation) {
        binding.tvMateri1.text = data.description
    }
}