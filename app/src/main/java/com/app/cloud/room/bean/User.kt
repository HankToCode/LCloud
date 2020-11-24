package com.app.cloud.room.bean

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
 * 用户数据库
 * 这里需要使用@Entity来注解该类
 * 至少要有一个主键@PrimaryKey
 * 主键是否自动增长，默认为false
 */
@Entity
data class User constructor(@PrimaryKey(autoGenerate = true) var id: String = "", var name: String? = null, var age: Int = 0) {

}