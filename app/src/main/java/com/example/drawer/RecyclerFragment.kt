package com.example.drawer

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.drawer.data.DataSource
import com.example.drawer.data.RecyclerClass
import com.example.drawer.databinding.FragmentRecyclerBinding


class RecyclerFragment : Fragment(R.layout.fragment_recycler) {

private lateinit var binding : FragmentRecyclerBinding
//private lateinit var data :DataSource
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentRecyclerBinding.inflate(inflater)
initRecycler()
        return binding.root
    }

   private fun initRecycler(){
       binding.recycler.layoutManager= LinearLayoutManager(activity)
       Log.i("tag","tag1")
       displayAll()
   }
    private fun displayAll(){
       // var data :DataSource
        binding.recycler.adapter=RecyclerClass(DataSource().listOfResources())
        Log.i("tag","tag2")
    }
}