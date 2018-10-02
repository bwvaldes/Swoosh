package com.example.swoosh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity(), View.OnClickListener {

    var league = ""

    override fun onClick(v: View?) {
        when (v) {
            beginner -> {
                compareSkillState(true)
            }

            baller -> {
                compareSkillState(isBeginner = false)
            }
        }
    }


    private fun compareSkillState(isBeginner: Boolean) {

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

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
        println(league)

        // Method 1

//        beginner.setOnClickListener(this)
//        baller.setOnClickListener(this)
    }
}
