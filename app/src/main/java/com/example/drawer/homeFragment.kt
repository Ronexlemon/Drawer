package com.example.drawer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.findNavController
import com.example.drawer.databinding.FragmentHomeBinding

class homeFragment : Fragment(R.layout.fragment_home) {
  private lateinit var binding : FragmentHomeBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater)
        binding.bottomappbar.setOnMenuItemClickListener {
            when(it.itemId){
                R.id.about -> {Toast.makeText(activity,"backdrop page",Toast.LENGTH_LONG).show()
                view!!.findNavController().navigate(R.id.action_homeFragment_to_backDropFragment)
                    true}
                R.id.home ->{Toast.makeText(activity,"sheet page",Toast.LENGTH_LONG).show()
                    view!!.findNavController().navigate(R.id.action_homeFragment_to_sheetFragment)
                    true}
                R.id.rec -> {Toast.makeText(activity,"view page",Toast.LENGTH_LONG).show()
                    view!!.findNavController().navigate(R.id.action_homeFragment_to_recyclerFragment)
                    true}
                else -> false
            }
        }

        return binding.root
    }



}