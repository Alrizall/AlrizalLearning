package com.example.admin.feature.materi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.admin.R
import com.example.admin.databinding.FragmentMateriAdminBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FragmentMateriAdmin : Fragment() {

    private var _binding: FragmentMateriAdminBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMateriAdminBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        binding.tvBackMateri.setOnClickListener {
            findNavController().popBackStack()
        }
        binding.cvMateri1.setOnClickListener {
            findNavController().navigate(
                FragmentMateriAdminDirections.actionFragmentMateriAdminToItemMateriAdmin(
                    1
                )
            )
        }
        binding.cvMateri2.setOnClickListener {
            findNavController().navigate(
                FragmentMateriAdminDirections.actionFragmentMateriAdminToItemMateriAdmin(
                    2
                )
            )
        }
        binding.cvMateri3.setOnClickListener {
            findNavController().navigate(
                FragmentMateriAdminDirections.actionFragmentMateriAdminToItemMateriAdmin(
                    3
                )
            )
        }
        binding.cvMateri4.setOnClickListener {
            findNavController().navigate(
                FragmentMateriAdminDirections.actionFragmentMateriAdminToItemMateriAdmin(
                    4
                )
            )
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}