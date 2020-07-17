package com.example.espressotest.ui.details

import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.espressotest.MainViewModel
import com.example.espressotest.R
import com.example.espressotest.databinding.FragmentDetailsBinding
import com.example.espressotest.framework.BaseFragment
import com.example.espressotest.utils.Constants
import com.example.espressotest.utils.extensions.getViewModel
import javax.inject.Inject

class DetailsFragment : BaseFragment() {

    // Global
    @Inject lateinit var factory: ViewModelProvider.Factory
    @Inject lateinit var sp: SharedPreferences
    private lateinit var binding: FragmentDetailsBinding
    private val viewModel by lazy { requireActivity().getViewModel<MainViewModel>(factory) }
    private var userId: Int? = null

    companion object {
        private val TAG = DetailsFragment::class.java.simpleName

        @JvmStatic
        fun newInstance() = DetailsFragment()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let { b -> userId = b.getInt(Constants.USER_ID) }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_details, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.imgBtnBack.setOnClickListener { onBackPressed() }

        userId?.let { id ->
            viewModel.getUser(id)?.let { u ->
                binding.imgDetailsProfile.setImageDrawable(resources.getDrawable(u.profile))
                binding.txtDetailsName.text = "${u.fName} ${u.lName}"
            } ?: onBackPressed()
        } ?: onBackPressed()

    }

}