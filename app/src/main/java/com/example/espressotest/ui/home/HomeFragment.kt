package com.example.espressotest.ui.home

import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.espressotest.MainViewModel
import com.example.espressotest.R
import com.example.espressotest.data.models.User
import com.example.espressotest.databinding.FragmentHomeBinding
import com.example.espressotest.framework.BaseFragment
import com.example.espressotest.ui.details.DetailsFragment
import com.example.espressotest.utils.Constants
import com.example.espressotest.utils.extensions.attachFragment
import com.example.espressotest.utils.extensions.getViewModel
import javax.inject.Inject

class HomeFragment : BaseFragment() {

    // Global
    @Inject lateinit var factory: ViewModelProvider.Factory
    @Inject lateinit var sp: SharedPreferences
    private lateinit var binding: FragmentHomeBinding
    private val viewModel by lazy { requireActivity().getViewModel<MainViewModel>(factory) }
    private var adapter: UsersAdapter? = null

    companion object {
        private val TAG = HomeFragment::class.java.simpleName

        @JvmStatic
        fun newInstance() = HomeFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupRecyclerView()

        adapter?.users = viewModel.getUsers()

    }

    private fun setupRecyclerView() {
        adapter = UsersAdapter()
        adapter?.listener = object : UsersAdapter.Listener {
            override fun onClick(user: User) {
                val args = Bundle().apply { putInt(Constants.USER_ID, user._id) }
                requireActivity()
                    .attachFragment(R.id.view_fragment_container, DetailsFragment::class.java, args)
            }
        }

        binding.recyclerUsers.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerUsers.adapter = adapter

    }

}