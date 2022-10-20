package co.edu.unab.appsintomas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

import co.edu.unab.appsintomas.entities.RespuestaLogin;
import co.edu.unab.appsintomas.network.SintomasApiCliente;
import co.edu.unab.appsintomas.network.SintomasApiService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
     private EditText useremail,password;
     private SintomasApiService service;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setup();
        getSupportActionBar().hide();
    }

public void salir (View view){

         finish();

}

public void ingresar(View view){
    String correo=useremail.getText().toString();
    String contrasena= password.getText().toString();
    if(!TextUtils.isEmpty(correo ) && TextUtils.isEmpty(contrasena)){
        this.service.login(correo,contrasena).enqueue(new Callback<RespuestaLogin>() {
            @Override
            public void onResponse(Call<RespuestaLogin> call, Response<RespuestaLogin> response) {

            }

            @Override
            public void onFailure(Call<RespuestaLogin> call, Throwable t) {

            }
        });


    }

}

private void setup(){
        useremail=findViewById(R.id.txtusuario);
        password=findViewById(R.id.txtcontrasena);
        this.service= SintomasApiCliente.getSintomasApiService();

}

}