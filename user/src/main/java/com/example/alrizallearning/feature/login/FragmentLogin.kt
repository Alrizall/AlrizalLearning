package com.example.admin.feature.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.admin.databinding.FragmentLoginAdminBinding
import com.example.alrizallearrning.databinding.FragmentLoginBinding

class FragmentLogin : Fragment() {
    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        binding.btnLogin.setOnClickListener {
            val username = binding.edtUsername.text.toString()
            val password = binding.edtPassword.text.toString()

            when {
                username.isEmpty() -> {
                    Toast.makeText(it.context, "masukan username", Toast.LENGTH_SHORT).show()
                }
                password.isEmpty() -> {
                    Toast.makeText(it.context,"masukan password", Toast.LENGTH_SHORT).show()
                }
                else -> {
                    Toast.makeText(it.context,"sukses", Toast.LENGTH_SHORT).show()
                }
            }
            findNavController().navigate(
                FragmentLoginAdminDirections.actionFragmentLoginAdminToFragmentHomeAdmin()
            )
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

