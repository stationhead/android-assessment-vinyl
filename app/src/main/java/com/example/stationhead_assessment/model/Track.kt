package com.example.stationhead_assessment.model

data class Track(
    val artists: List<String>,
    val album: Album,
    val name: String,
    val trackNumber: Int,
    val previewUrl: String?,

){
    data class Album(
        val type: AlbumType,
        val trackCount: Int,
        val image: String,
        val name: String,
    )

    enum class AlbumType {SINGLE, ALBUM }
}