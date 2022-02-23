package com.example.drawer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.drawer.databinding.FragmentShopBinding

class ShopFragment : Fragment(R.layout.fragment_shop) {
    private lateinit var binding : FragmentShopBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentShopBinding.inflate(inflater)
binding.radiogroup.setOnCheckedChangeListener{group, chekedId ->
    when(chekedId){
        R.id.btn3 ->  Toast.makeText(activity,"button one",Toast.LENGTH_LONG).show()
    }

}

        return binding.root
    }


}