package com.example.kotlinpractice

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import com.example.kotlinpractice.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val navController = NavHostFragment.findNavController(this)

        binding.SecondFragmentBtn.setOnClickListener {
            navController.navigate(R.id.action_firstFragment_to_secondFragment)
        }

        binding.ThirdFragmentBtn.setOnClickListener {
            navController.navigate(R.id.action_firstFragment_to_thirdFragment)
        }

        binding.backBtn.setOnClickListener {
            navController.popBackStack()
        }

//        val fragmentManager = requireActivity().supportFragmentManager
//
//        binding.SecondFragmentBtn.setOnClickListener {
//            val transaction = fragmentManager.beginTransaction()
//            transaction.replace(R.id.fragment_container_view, SecondFragment())
//            transaction.addToBackStack(null)
//            transaction.commit()
//        }
//
//        binding.ThirdFragmentBtn.setOnClickListener {
//            val transaction = fragmentManager.beginTransaction()
//            transaction.replace(R.id.fragment_container_view, ThirdFragment())
//            transaction.addToBackStack(null)
//            transaction.commit()
//        }
//
//        binding.backBtn.setOnClickListener {
//            fragmentManager.popBackStack()
//        }
    }
}