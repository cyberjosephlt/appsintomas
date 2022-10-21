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
import retrofit2.http.POST;

public interface SintomasApiService {

    @FormUrlEncoded
    @POST("login")
    Call<RespuestaLogin> login(@Field("email") String email, @Field("password") String password);


    @GET("docente")
    Call<List<usuario>> getDocente(@Header("Autorizhation") String authToken);

    @GET("estudiante")
    Call<List<usuario>> getEstudiante(@Header("Autorizhation") String authToken);


}