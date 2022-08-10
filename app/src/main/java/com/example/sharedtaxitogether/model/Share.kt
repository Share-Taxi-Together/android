package com.example.sharedtaxitogether.model

import java.io.Serializable

class Share(
//    val creatorId: String,
//    val creator: HashMap<String, Participant> = HashMap(),

//    var startPlace: HashMap<String, Place> = HashMap(),
//    var destPlace: HashMap<String, Place> = HashMap(),

    var creatorUid: String = "",
    var creatorImgUrl: String = "",
    var creatorNickname: String = "",
    var creatorGender: String = "",

    var memberCount: Int = 1,

    var start: String = "",
    var dest: String = "",
    var memberNum: String = "",
    var memberGender: String = "",
    var departTime: String = "",

    val participants: HashMap<String, Participant> = HashMap()): Serializable {
    class Participant(
        val uid: String? = null,
        val imgUrl: String? = null,
        val nickname: String? = null,
        val gender: String? = null
    ):Serializable
}