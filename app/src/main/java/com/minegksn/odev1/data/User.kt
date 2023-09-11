package com.minegksn.odev1.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(
    val bilgiler: String
): Parcelable
