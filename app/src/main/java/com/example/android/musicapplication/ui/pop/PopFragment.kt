package com.example.android.musicapplication.ui.pop

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.android.musicapplication.databinding.FragmentPopBinding

class PopFragment : Fragment() {
    private var _binding: FragmentPopBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val rockViewModel =
            ViewModelProvider(this).get(PopViewModel::class.java)

        _binding = FragmentPopBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textPop
        rockViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}