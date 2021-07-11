package com.android.teams.presentation

import android.os.Bundle
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG
import android.widget.Toast.LENGTH_SHORT
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.android.teams.R
import com.android.teams.databinding.ActivityTeamsBinding
import com.android.teams.utils.isNetworkAvailable
import kotlinx.android.synthetic.main.activity_teams.*
import org.koin.android.viewmodel.ext.android.viewModel

class ForzaTeamsActivity : AppCompatActivity() {

    private lateinit var activityTeamsBinding: ActivityTeamsBinding
    private var mAdapter: TeamsAdapter? =
        TeamsAdapter()
    private val teamViewModel: TeamsViewModel by viewModel()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityTeamsBinding = DataBindingUtil.setContentView(this, R.layout.activity_teams)

        activityTeamsBinding.teamsRecyclerView.adapter = mAdapter

        if (isNetworkAvailable()) {
            teamViewModel.getTeams()
        } else {
            Toast.makeText(
                this,
                getString(R.string.no_internet_connection),
                LENGTH_SHORT
            ).show()
        }

        with(teamViewModel) {

            teamsData.observe(this@ForzaTeamsActivity, Observer {
                activityTeamsBinding.teamsProgressBar.visibility = GONE
                mAdapter?.mTeamList = it
            })

            messageData.observe(this@ForzaTeamsActivity, Observer {
                Toast.makeText(this@ForzaTeamsActivity, it, LENGTH_LONG).show()
            })

            showProgressbar.observe(this@ForzaTeamsActivity, Observer { isVisible ->
                teams_progress_bar.visibility = if (isVisible) VISIBLE else GONE
            })
        }
    }


    override fun onDestroy() {
        mAdapter = null
        super.onDestroy()
    }

    companion object {
        private val TAG = ForzaTeamsActivity::class.java.name
    }
}
