package co.edu.unab.appsintomas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

import co.edu.unab.appsintomas.data.DataInfo;
import co.edu.unab.appsintomas.entities.RespuestaLogin;
import co.edu.unab.appsintomas.entities.usuario;
import co.edu.unab.appsintomas.network.SintomasApiCliente;
import co.edu.unab.appsintomas.network.SintomasApiService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
     private EditText useremail,userpassword;
     private SintomasApiService service;
     private String id;
     private usuario usuariorecibido;
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
    String email=useremail.getText().toString();
    String password= userpassword.getText().toString();

    if(!TextUtils.isEmpty(email) && !TextUtils.isEmpty(password)){

        this.service.login(email, password).enqueue(new Callback<RespuestaLogin>() {
            @Override
            public void onResponse(Call<RespuestaLogin> call, Response<RespuestaLogin> response) {

                if(response.isSuccessful()){
                    RespuestaLogin respuesta= response.body();
                    if(respuesta!=null){

                        DataInfo.respuesta=respuesta;

                        id= String.valueOf(DataInfo.respuesta.getDocente_id());
                        //Toast.makeText(MainActivity.this, "INFORMACIÓN: ID: "+DataInfo.respuesta.getDocente_id()+" TOKEN: "+DataInfo.respuesta.getToken(), Toast.LENGTH_SHORT).show();
                        traerDatos();
                        startActivity(new Intent(
                                MainActivity.this,
                                activity_docente.class));

                    } else{
                        Toast.makeText(MainActivity.this, "Error en el Login", Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void onFailure(Call<RespuestaLogin> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Error"+t.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });


    }

}

private void setup(){
        useremail=findViewById(R.id.txtusuario);
        userpassword=findViewById(R.id.txtcontrasena);
        this.service= SintomasApiCliente.getSintomasApiService();

}
private void traerDatos(){
    String authToken=DataInfo.respuesta.getToken();
    this.service.getDocente(id,"Bearer "+ authToken)
            .enqueue(new Callback<usuario>() {
                @Override
                public void onResponse(Call<usuario> call, Response<usuario> response) {
                    if (response.isSuccessful()) {
                        //usuariorecibido = response.body();
                      //DataInfo.respuesta.setsaludo("Bienvenid@: "+usuariorecibido.getNombres()+" "+usuariorecibido.getApellidoss());
                        //Toast.makeText(MainActivity.this, "SALUDO: "+DataInfo.respuesta.getsaludo(), Toast.LENGTH_SHORT).show();
                        Toast.makeText(MainActivity.this, "SALUDO: "+response.body().toString(), Toast.LENGTH_SHORT).show();
                    }
                }

                @Override
                public void onFailure(Call<usuario> call, Throwable t) {
                    Toast.makeText(MainActivity.this, "Error al obtener el usuario"+t.getMessage(), Toast.LENGTH_SHORT).show();

                }
            });





}
}