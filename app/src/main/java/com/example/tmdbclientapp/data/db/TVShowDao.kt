package com.example.tmdbclientapp.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.tmdbclientapp.data.model.tvshow.TVShow

/**
 * @author Mingaleev D. 09.06.2022
 **/
@Dao
interface TVShowDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveTVShows(tvShows: List<TVShow>)

    @Query("DELETE FROM popular_tvShows")
    suspend fun deleteAllTVShows()

    @Query("SELECT * FROM popular_tvShows")
    suspend fun getTVShows(tvShows: List<TVShow>)
}