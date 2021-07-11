package com.android.teams.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.android.teams.R
import com.android.teams.domain.model.Team
import com.android.teams.databinding.HolderTeamBinding
import kotlin.properties.Delegates

class TeamsAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var mTeamList: List<Team> by Delegates.observable(emptyList()) { _, _, _ ->
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val holderTeamBinding = DataBindingUtil.inflate<ViewDataBinding>(
            LayoutInflater.from(parent.context), R.layout.holder_team, parent, false
        )
        return TeamViewHolder(holderTeamBinding)
    }

    override fun getItemCount(): Int = if (mTeamList.isNullOrEmpty()) 0 else mTeamList.size

    private fun getItem(position: Int): Team = mTeamList[position]

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as TeamViewHolder).onBind(getItem(position))
    }

    private inner class TeamViewHolder(private val viewDataBinding: ViewDataBinding) :
        RecyclerView.ViewHolder(viewDataBinding.root) {

        fun onBind(team: Team) {
            (viewDataBinding as HolderTeamBinding).team = team
        }
    }
}