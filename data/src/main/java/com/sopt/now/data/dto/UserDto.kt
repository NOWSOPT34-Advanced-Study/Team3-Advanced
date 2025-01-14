package com.sopt.now.data.dto

import com.sopt.now.domain.entity.UserEntity
import kotlinx.serialization.Serializable

@Serializable
data class UserDto(
    val id: String,
    val password: String,
    val nickName: String,
    val mbti: String
) {
    fun toUserEntity() = UserEntity(
        id = id,
        password = password,
        nickName = nickName,
        mbti = mbti
    )
}
