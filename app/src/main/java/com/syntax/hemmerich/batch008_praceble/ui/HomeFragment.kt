package com.syntax.hemmerich.batch008_praceble.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.syntax.hemmerich.batch008_praceble.R
import com.syntax.hemmerich.batch008_praceble.data.User
import com.syntax.hemmerich.batch008_praceble.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var superUser = User("admin","1234")
        binding.btnPressMe.setOnClickListener {
           val navController = findNavController()
           navController.navigate(HomeFragmentDirections.actionHomeFragmentToDetailsFragment(superUser))
        }
    }

}