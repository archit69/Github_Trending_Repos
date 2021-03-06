package com.example.top_github.data.service

import com.example.top_github.data.model.TrendingRepos
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * api service interface describing context path and query params
 */
interface TrendingReposService{

    @GET("developers")
    fun getTrendingRepos(
        @Query("language") language: String,
        @Query("since") period: String
    ): Single<List<TrendingRepos>>
}