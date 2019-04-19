package founder.nugroho.mvpdagger2rerofit.API

import com.google.gson.Gson
import founder.nugroho.mvpdagger2rerofit.Models.Album
import founder.nugroho.mvpdagger2rerofit.Models.Post
import founder.nugroho.mvpdagger2rerofit.Models.User
import founder.nugroho.mvpdagger2rerofit.UTIL.Constants
import io.reactivex.Observable
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Path
import java.util.*

interface ApiServiceInterface {

    @GET("albums")
    fun getAlbumList() : io.reactivex.Observable<List<Album>>

    @GET("albums/{id}")
    fun getAlbum(@Path("id") id : Int): io.reactivex.Observable<Album>

    @DELETE("albums/{id}")
    fun deleteAlbum(@Path("id") id: Int)

    @GET("posts")
    fun getPostList(): io.reactivex.Observable<List<Post>>

    @GET("posts/{id}")
    fun getPost(@Path("id") id: Int ): Observable<Post>

    @DELETE("albums/{id}")
    fun deletePost(@Path("id") id: Int)

    @GET("users")
    fun getUserList(): io.reactivex.Observable<List<User>>

    @GET("posts/{id}")
    fun getUser(@Path("id") id: Int): io.reactivex.Observable<User>

    @DELETE("albums/{id}")
    fun deleteUser(@Path("id") id: Int)

    companion object Factory {
        fun create() : ApiServiceInterface {
            val retrofit = retrofit2.Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(Constants.BASE_URL)
                .build()


            return retrofit.create(ApiServiceInterface::class.java)
        }
    }
}