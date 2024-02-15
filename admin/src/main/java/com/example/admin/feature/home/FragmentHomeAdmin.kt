package com.example.admin.feature.home

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.admin.R
import com.example.admin.databinding.FragmentHomeAdminBinding
import com.example.core.DashboardInformation
import com.example.core.DuedateInformation
import com.example.home.adapter.DuedateAdapter
import com.example.home.adapter.PemberitahuanAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FragmentHomeAdmin : Fragment(),
    PemberitahuanAdapter.PemberitahuanAdapterListener,
    DuedateAdapter.DuedateAdapterListener{
    private val homeViewModel: HomeAdminViewModel by viewModels()
    private val pemberitahuanAdapter: PemberitahuanAdapter by lazy { PemberitahuanAdapter(this) }
    private val duedateAdapter: DuedateAdapter by lazy { DuedateAdapter(this) }

    private var _binding: FragmentHomeAdminBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeAdminBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        if (homeViewModel.getUserName().isEmpty()) {
            findNavController().navigate(FragmentHomeAdminDirections.actionFragmentHomeAdminToFragmentLoginAdmin())
        } else {
            binding.cvCat1.setOnClickListener {
                findNavController().navigate(R.id.action_fragmentHomeAdmin_to_fragmentMateriAdmin)
            }
            binding.cvCat2.setOnClickListener {
                findNavController().navigate(R.id.action_fragmentHomeAdmin_to_fragmentTugasAdmin)
            }
            binding.cvCat3.setOnClickListener {
                findNavController().navigate(R.id.action_fragmentHomeAdmin_to_fragmentQuizAdmin)
            }
            binding.cvCat4.setOnClickListener {
                findNavController().navigate(R.id.action_fragmentHomeAdmin_to_fragmentNilaiAdmin)
            }

            binding.textView.text = "Hi, ${homeViewModel.getUserName()}"

            binding.rvPemberitahuan.apply {
                adapter = pemberitahuanAdapter
            }
            pemberitahuanAdapter.submitList(homeViewModel.dashboardInformationProvider())

            binding.rvPopuler.apply {
                adapter = duedateAdapter
            }
            duedateAdapter.submitList(homeViewModel.duedateInformationProvider())
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    override fun onclick(data: DashboardInformation) {
        val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"))
        i.setPackage("com.android.chrome")
        startActivity(i)
    }
    override fun onclick(data: DuedateInformation) {
        findNavController().navigate(R.id.action_fragmentHomeAdmin_to_fragmentTugasAdmin)
    }

}