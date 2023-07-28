package com.syntax.hemmerich.batch008_praceble.data

import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(var name: String,var password: String) : Parcelable