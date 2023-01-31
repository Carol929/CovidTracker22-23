package com.example.covidtracker22_23

import android.text.BoringLayout


data class countyData(
    val state : String?,
    val county : String?,
    val actuals : Actuals,
    val cdcTransmissionLevel: Int,
    val metrics : Metrics,
    val lastUpdatedDate : String
) {
    data class Actuals(
        val cases: Int?,
        val newCases: Int?
    )

    data class Metrics(
        val testPositivityRatio: Double?,
        val weeklyNewCasesPer100K: Double?
    )
}
