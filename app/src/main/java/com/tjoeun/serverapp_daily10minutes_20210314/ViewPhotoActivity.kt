package com.tjoeun.serverapp_daily10minutes_20210314

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.tjoeun.serverapp_daily10minutes_20210314.datas.User
import kotlinx.android.synthetic.main.member_list_item.*

class ViewPhotoActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_photo)
    }

    lateinit var mUser : User

    override fun setupEvents() {
    }

    override fun setValues() {

        mUser = intent.getSerializableExtra("user") as User

        Glide.with(mContext).load(mUser.profileImgUrls[0]).

    }
}