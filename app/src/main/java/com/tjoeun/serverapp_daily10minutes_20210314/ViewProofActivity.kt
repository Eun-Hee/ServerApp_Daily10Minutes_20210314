package com.tjoeun.serverapp_daily10minutes_20210314

import android.os.Bundle

class ViewProofActivity : BaseActivity() {
    override fun setupEvents() {
    }

    override fun setValues() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_proof)
        setValues()
        setupEvents()
    }
}