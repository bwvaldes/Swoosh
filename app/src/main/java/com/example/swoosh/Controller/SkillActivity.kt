package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.Utilities.EXTRA_LEAGUE
import com.example.swoosh.R
import com.example.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    private var league = ""

    private var selectedSkill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
        println(league)

    }

    fun onBeginnerClicked(view: View) {
        beginnerBtn.isChecked = true
        ballerBtn.isChecked = false

        selectedSkill = "beginner"
    }

    fun onBallerClicked(view: View) {
        beginnerBtn.isChecked = false
        ballerBtn.isChecked = true

        selectedSkill = "baller"
    }

    fun onFinishedClicked(view: View) {
        if (selectedSkill!= "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE, league)
            finishActivity.putExtra(EXTRA_SKILL, selectedSkill)
            startActivity(finishActivity)
        }else{
            Toast.makeText(this,"Please select a skill level...", Toast.LENGTH_SHORT).show()
        }
    }


}

//override fun onClick(v: View?) {
//        when (v) {
//            beginner -> {
//                compareSkillState(true)
//            }
//
//            baller -> {
//                compareSkillState(isBeginner = false)
//            }
//        }
//    }

// Method 1

//        beginner.setOnClickListener(this)
//        baller.setOnClickListener(this)

//private fun compareSkillState(isBeginner: Boolean) {

// : Method 1

//        if (isBeginner) {
//            baller.isChecked = false
//            beginner.isChecked = true
//        } else {
//            baller.isChecked = true
//            beginner.isChecked = false
//        }

//Simpler Method

//        baller.isChecked=!isBeginner
//        beginner.isChecked=isBeginner

// }