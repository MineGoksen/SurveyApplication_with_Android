package com.minegksn.odev1.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Personal(
    val email: String,
    val phone: String
): Parcelable
