package com.android.gd10_d_10670

import com.google.gson.annotations.SerializedName

data class ResponseDataMahasiswa (
    @SerializedName("status") val stt:String,
    val totaldata: Int,
    val data: List<MahasiswaData>
    )