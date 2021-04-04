package com.tjoeun.serverapp_daily10minutes_20210314.datas

import org.json.JSONObject

class Proof {

    var id = 0
    var content = ""

    //    인증글의 하위정보로 > 누가 작성했는지 User를 담아두자
    lateinit var writer : User

    companion object {

        fun getProofFromJson(JsonObj : JSONObject) : Proof {

            val proof = Proof()

            proof.id = JsonObj.getInt("id")
            proof.content = JsonObj.getString("content")



            return proof
        }
    }

}