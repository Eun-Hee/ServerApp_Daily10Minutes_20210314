package com.tjoeun.serverapp_daily10minutes_20210314

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bumptech.glide.Glide
import com.tjoeun.serverapp_daily10minutes_20210314.datas.Project
import com.tjoeun.serverapp_daily10minutes_20210314.utils.ServerUtil
import kotlinx.android.synthetic.main.activity_view_project_detail.*
import org.json.JSONObject


class ViewProjectDetailActivity : BaseActivity() {

//    상세화면에서 프로젝트 정보는 여러 함수가 공유해서 사용해야함.
//    그런 변수는 멤버변수로 만드는게 편함.
//    변수에 객체를 담는건 => onCreate 이후에. => lateinit var 사용하자.

    lateinit var mProject : Project


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_project_detail)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

//        참가신청 버튼이 눌리면 => 신청 API 호출

        applyBtn.setOnClickListener {

            ServerUtil.postRequestApplyProject(mContext, mProject.id, object : ServerUtil.JsonResponHandler {
                override fun onResponse(json: JSONObject) {

//                    신청 결과에 따른 처리
//                    code : 200 => 신청성공, 그외 값 : 신청실패, message : 실패사유 String
//                    400 - 잘못된 데이터 유입
//                    403 - 권한이 없는데 요청 ex) 관리자 전용 기능 => 일반회원이 요청
//                    404 - /user, /project 등 기능 주소를 잘못 입력한 경우 (Not found)
//                    500 - 서버 내부의 로직 에러

                    val code = json.getInt("code")

                    if (code == 200) {
//                    정상 신청 완료
                    }
                    else {
//                        여타 이유로 실패
                        val message = json.getString("message")

                        runOnUiThread{
                            Toast.
                        }
                    }
                    }

            })
        }

    }

    override fun setValues() {

//        들어오는 intent를 통해서 프로젝트 정보 저장.
        mProject = intent.getSerializableExtra("projectInfo") as Project

//        프로젝트 제목 / 이미지 표시.
        projectTitleTxt.text = mProject.title
        Glide.with(mContext).load(mProject.imageURL).into(projectImg)


//        프로젝트 설명 문구 반영
        projectDescTxt.text = mProject.description

//        참여 인원 수 반영 : ?명 양식으로 가공
        memberCountTxt.text = "${mProject.ongoingUsersCount}명"

    }

}