package co.edu.unab.appsintomas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import co.edu.unab.appsintomas.data.DataInfo;
import co.edu.unab.appsintomas.entities.RespuestaLogin;
import co.edu.unab.appsintomas.network.SintomasApiCliente;
import co.edu.unab.appsintomas.network.SintomasApiService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
     private EditText useremail,userpassword;
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
                        Toast.makeText(MainActivity.this, "respuesta: "+DataInfo.respuesta, Toast.LENGTH_LONG).show();
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

}
}