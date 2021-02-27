package com.ctt.saude_ja.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Medicamento(val nome: String, val frequencia: String, val horario: String, val descricao: String):Parcelable {
}