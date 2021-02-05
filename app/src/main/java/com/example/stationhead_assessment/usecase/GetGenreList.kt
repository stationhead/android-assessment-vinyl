package com.example.stationhead_assessment.usecase

import com.example.stationhead_assessment.model.Genre
import io.reactivex.Observable

class GetGenreList {

    // Do Not edit this function
    public operator fun invoke(): Observable<List<Genre>> {
        return Observable.just(TODO()) // Will add mock data here.
    }
}