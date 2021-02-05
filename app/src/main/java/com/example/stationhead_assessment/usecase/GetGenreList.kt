package com.example.stationhead_assessment.usecase

import com.example.stationhead_assessment.model.Genre
import io.reactivex.Observable

class GetGenreList {

    // Do Not edit this function
    public operator fun invoke(): Observable<List<Genre>> {
        return Observable.just(
            listOf(
                Genre(
                    "country",
                    "Country",
                    "https://stationhead-vinyl-mock-data.s3.amazonaws.com/tracklist/top_country.json",
                    listOf(
                        "2021-01" to 9017100,
                        "2020-12" to 9372782,
                        "2020-11" to 7729207,
                        "2020-10" to 884797,
                        "2020-09" to 1157982
                        )
                ),
                Genre(
                    "pop",
                    "Pop",
                    "https://stationhead-vinyl-mock-data.s3.amazonaws.com/tracklist/top_pop.json",
                    listOf(
                        "2020-10" to 1849021,
                        "2020-09" to 473937,
                        "2021-01" to 4905666,
                        "2020-12" to 25741425,
                        "2020-11" to 5291177,
                    )
                ),
                Genre(
                    "latin",
                    "Latin",
                    "https://stationhead-vinyl-mock-data.s3.amazonaws.com/tracklist/top_latin.json",
                    listOf(
                        "2021-01" to 6863896,
                        "2020-12" to 9583153,
                        "2020-11" to 2323713,
                    )
                ),
                Genre(
                    "shanties",
                    "Sea Shanties",
                    "https://stationhead-vinyl-mock-data.s3.amazonaws.com/tracklist/top_shanties.json",
                    listOf(
                        "2021-01" to 6961008,
                    )
                ),
                Genre(
                    "hiphop",
                    "Hip Hop",
                    "https://stationhead-vinyl-mock-data.s3.amazonaws.com/tracklist/top_hiphop.json",
                    listOf(
                        "2021-01" to 9750504,
                        "2020-12" to 9983153,
                        "2020-11" to 3523855,
                    )
                ),
                Genre(
                    "rock",
                    "Rock & Roll",
                    "https://stationhead-vinyl-mock-data.s3.amazonaws.com/tracklist/top_rock.json",
                    listOf(
                        "2021-30" to -1,
                        "2021-05" to -1,
                        "2021-01" to 9208693,
                        "2020-18" to -1,
                        "2020-12" to 9586019,
                        "2020-11" to 8838588,
                        "2020-10" to 11177136
                    )
                ),
            )
        )
    }
}