package com.minegksn.odev1.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Anket(
    val yuzme: String,
    val kitap: String,
    val muzik: String
): Parcelable
