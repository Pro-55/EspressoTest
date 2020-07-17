package com.example.espressotest.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.espressotest.R
import com.example.espressotest.data.models.User
import kotlinx.android.synthetic.main.layout_users_item.view.*

class UsersAdapter : RecyclerView.Adapter<UsersAdapter.ViewHolder>() {

    var listener: Listener? = null
    var users: List<User> = listOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(
        LayoutInflater.from(parent.context)
            .inflate(R.layout.layout_users_item, parent, false)
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = with(holder.itemView) {
        val user = users[position]

        txt_first_name.text = "${user.fName} ${user.lName}"
        img_profile.setImageDrawable(resources.getDrawable(user.profile))

        setOnClickListener { listener?.onClick(user) }
    }

    override fun getItemCount(): Int = users.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    interface Listener {
        fun onClick(user: User)
    }

}