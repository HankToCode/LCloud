package com.lt.ltotc.room.dao

import android.arch.persistence.room.*
import com.lt.ltotc.room.bean.User

@Dao
interface UserDao {
    @get:Query("SELECT * FROM user")
    val allUsers: List<User?>?

    @Insert
    fun insert(vararg users: User?)

    @Update
    fun update(vararg users: User?)

    @Delete
    fun delete(vararg users: User?)
}