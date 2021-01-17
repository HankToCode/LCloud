package com.app.cloud.ex

import com.google.gson.Gson

fun Any.toJsonString(): String = Gson().toJson(this) ?: "{}"