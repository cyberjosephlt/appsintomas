package co.edu.unab.appsintomas.network;

import java.util.List;

import co.edu.unab.appsintomas.entities.RespuestaLogin;
import co.edu.unab.appsintomas.entities.cursos;
import co.edu.unab.appsintomas.entities.usuario;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface SintomasApiService {

    @FormUrlEncoded
    @POST("login")
    Call<RespuestaLogin> login(@Field("email") String email, @Field("password") String password);


   // @GET("docente/{id}")
    //Call<usuario> getDocente(@Header("Autorization") String authToken,@Path("id") int id);
    @Headers({ "Content-Type: application/json;charset=UTF-8"})
    @GET("docente/{id}")
     Call<usuario> getDocente(@Header("Authorization") String authToken,@Path("id") int id);
     //@PATCH("docente/{id}") Call<usuario> getDocente(@Header("Authorization") String authToken, @Path("id") int id);

    @GET("estudiante")
    Call<List<usuario>> getEstudiante(@Header("Autorization") String authToken);


}