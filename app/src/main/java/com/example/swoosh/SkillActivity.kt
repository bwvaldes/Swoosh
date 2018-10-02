package com.example.swoosh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity(), View.OnClickListener {
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
//        if (isBeginner) {
//            baller.isChecked = false
//            beginner.isChecked = true
//        } else {
//            baller.isChecked = true
//            beginner.isChecked = false
//        }
        baller.isChecked=!isBeginner
        beginner.isChecked=isBeginner

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        beginner.setOnClickListener(this)
        baller.setOnClickListener(this)
    }
}
