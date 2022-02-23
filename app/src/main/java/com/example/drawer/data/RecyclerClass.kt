package com.example.drawer.data

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.drawer.R
import com.example.drawer.databinding.RecyclerViewBinding

class RecyclerClass(var data:List<Data>): RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var layoutinflator= LayoutInflater.from(parent.context)
        var binding:RecyclerViewBinding = DataBindingUtil.inflate(layoutinflator, R.layout.recycler_view,parent,false)
  return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
      return  data.size
    }
}
class ViewHolder(var binding:RecyclerViewBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(data: Data) {
        binding.img.setImageResource(data.image)
        binding.des.text= data.descrp.toString()
    }
}