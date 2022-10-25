package co.edu.unab.appsintomas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.Arrays;
import java.util.List;

import co.edu.unab.appsintomas.data.DataInfo;
import co.edu.unab.appsintomas.entities.usuario;
import co.edu.unab.appsintomas.network.SintomasApiCliente;
import co.edu.unab.appsintomas.network.SintomasApiService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class activity_docente extends AppCompatActivity {
    private ListView listasintomas;
    private SintomasApiService service;
    private TextView nombreUsuario,estadoUsuario;

    private usuario usuariorecibido;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_docente);
        getSupportActionBar().hide();
        setup();

    }

    public void setup(){
        this.service=SintomasApiCliente.getSintomasApiService();
        listasintomas = findViewById(R.id.listasintomas);
        // Initializing a new list
        List<String> lista = Arrays.asList(
                "¿TIENE GRIPA?",
                "¿DIFICULTAD PARA RESPIRAR?",
                "¿AHOGAMIENTO?",
                "¿TIENE FIEBRE?",
                "¿PERDIDA DEL OLFATO?"

        );

        // Initialize a new ArrayAdapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                getApplicationContext(),
                android.R.layout.simple_list_item_multiple_choice,
                lista
        );

        // Set the adapter for ListView
        listasintomas.setAdapter(adapter);
        listasintomas.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);

        //imagen picassoI
        //usuario user2=traerDatos();
        usuario user= new usuario(1234,56789,"Bruce"
                ,"Banner","HUlk","enojado2022","CE",56474,
                "https://upload.wikimedia.org/wikipedia/en/thumb/3/3b/Mark_Ruffalo_as_%22Professor_Hulk%22.jpeg/1280px-Mark_Ruffalo_as_%22Professor_Hulk%22.jpeg",
                0,"DOCENTE");



        //Toast.makeText(activity_docente.this, "INFORMACIÓN: "+DataInfo.respuesta.getUser(), Toast.LENGTH_SHORT).show();
        traerDatos();

    }

    public void llamarhd(View view){
        Intent intent = new Intent(this, historialdocente.class);
        startActivity(intent);

    }
    public void llamarcd(View view){
        Intent intent = new Intent(this, cursosdocente.class);
        startActivity(intent);

    }

    private void traerDatos() {
        String authToken = DataInfo.respuesta.getToken();

        this.service.getDocente("Bearer " + authToken, DataInfo.respuesta.getDocente_id())
                .enqueue(new Callback<usuario>() {
                    @Override
                    public void onResponse(Call<usuario> call, Response<usuario> response) {
                        if (response.isSuccessful()) {
                            usuariorecibido = response.body();
                            DataInfo.respuesta.setUser(usuariorecibido);
                            //Toast.makeText(MainActivity.this, "SALUDO: "+DataInfo.respuesta.getsaludo(), Toast.LENGTH_SHORT).show();
                           Toast.makeText(activity_docente.this, "SALUDO: "+usuariorecibido, Toast.LENGTH_SHORT).show();
                            String urlimg= usuariorecibido.getUrl_foto();
                            ImageView imgdocente= findViewById(R.id.imagendocente);
                            Picasso.get()
                                    .load(urlimg)
                                    .placeholder(R.drawable.loading)
                                    .error(R.drawable.nofoto)
                                    .into(imgdocente);
                            nombreUsuario=findViewById(R.id.txtnombredocente);
                            nombreUsuario.setText(usuariorecibido.getNombres());
                            estadoUsuario=findViewById(R.id.txtestado);

                                if(usuariorecibido.getestado()==0){
                                     estadoUsuario.setText("Estado:SIN REPORTE");

                                  } else{estadoUsuario.setText("Estado:CON REPORTE");}

                        }
                    }

                    @Override
                    public void onFailure(Call<usuario> call, Throwable t) {
                        Toast.makeText(activity_docente.this, "Error al obtener el usuario" + t.getMessage(), Toast.LENGTH_SHORT).show();

                    }
                });

    }

}