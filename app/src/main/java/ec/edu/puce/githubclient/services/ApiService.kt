package ec.edu.puce.githubclient.services

import androidx.compose.ui.text.style.TextDirection
import coil.memory.MemoryCache
import ec.edu.puce.githubclient.models.Repository
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("/user/repos")
    suspend fun getRepositories(
        @Query(value = "affiliation") affiliation:String="owner",
        @Query(value = "sort") sort: String="created",
        @Query(value = "per_page") perPage: Int=100,
        @Query(value = "direction") direction: String="desc",
    ): List<Repository>
}