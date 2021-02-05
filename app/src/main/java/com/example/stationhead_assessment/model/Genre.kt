package com.example.stationhead_assessment.model

data class Genre(
    val id: String,
    val displayName: String,
    val tracklistUrl: String,
    val monthlyStreams: List<Pair<String, Int>> // Month is represented as an ISO 8601 string in the format YYYY-MM
)
