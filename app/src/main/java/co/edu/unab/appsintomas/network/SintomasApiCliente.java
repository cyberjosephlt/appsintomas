package co.edu.unab.appsintomas.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SintomasApiCliente {
    private static SintomasApiService service;
    private static final String URL_BASE="https://servicio.miproyecto.xyz/api/";

    public static SintomasApiService getSintomasApiService(){

        if(service==null){

            Retrofit retrofit =new Retrofit.Builder()
                    .baseUrl(URL_BASE)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            service=retrofit.create(SintomasApiService.class);

        }
        return service;
    }
}
