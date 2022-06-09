package com.example.tmdbclientapp.data.db

import androidx.room.Database
import com.example.tmdbclientapp.data.model.artist.Artist
import com.example.tmdbclientapp.data.model.movie.Movie
import com.example.tmdbclientapp.data.model.tvshow.TVShow

/**
 * @author Mingaleev D. 09.06.2022
 **/
@Database(
    entities = [Movie::class, TVShow::class, Artist::class],
    version = 1,
    exportSchema = false
)
abstract class TMDBDatabase {

    abstract fun MovieDao(): MovieDao
    abstract fun tvDao(): TVShowDao
    abstract fun artistDao(): ArtistDao
}