package com.example.tmdbclientapp.data.api


import com.example.tmdbclientapp.data.model.artist.ArtistList
import com.example.tmdbclientapp.data.model.movie.MovieList
import com.example.tmdbclientapp.data.model.tvshow.TVShowList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * @author Mingaleev D. 09.06.2022
 **/
interface TMDBService {
    @GET("movie/popular")
    suspend fun getPopularMovies(@Query("api_key") apiKey: String): Response<MovieList>

    @GET("tv/popular")
    suspend fun getPopularTVShow(@Query("api_key") apiKey: String): Response<TVShowList>

    @GET("person/popular")
    suspend fun getPopularArtist(@Query("api_key") apiKey: String): Response<ArtistList>
}