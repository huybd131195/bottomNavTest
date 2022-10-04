package com.codefresher.bottomnavtest.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.codefresher.bottomnavtest.R
import com.codefresher.bottomnavtest.databinding.FragmentChartBinding
import com.codefresher.bottomnavtest.databinding.FragmentHomeBinding


class ChartFragment : Fragment() {
    private var _binding: FragmentChartBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentChartBinding.inflate(inflater, container, false)
        binding.detailChart.setOnClickListener {
            findNavController().navigate(R.id.action_chartFragment_to_detailChartFragment)
        }
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}