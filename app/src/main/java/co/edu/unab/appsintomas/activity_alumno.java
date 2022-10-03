package co.edu.unab.appsintomas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import com.squareup.picasso.Picasso;

import java.util.Arrays;
import java.util.List;

import co.edu.unab.appsintomas.entities.usuario;

public class activity_alumno extends AppCompatActivity {
    private ListView listasintomasa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alumno);
        getSupportActionBar().hide();

        setup();
    }


    public void setup(){

        listasintomasa= findViewById(R.id.listasintomasal);
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
        listasintomasa.setAdapter(adapter);
        listasintomasa.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);


        //imagen picassoI
        usuario user= new usuario("56789","Steve Jobs"
                ,"applebest","manzanita2022","CE",46574,
                "https://img1.freepng.es/20171220/vwq/steve-jobs-png-5a3a404a148806.97453834151376698608417047.jpg",
                "inhabilitado","ALUMNO");
        String urlimg= user.getUrl_foto();
        ImageView imgdocente= findViewById(R.id.imagenalumno);
        Picasso.get()
                .load(urlimg)
                .placeholder(R.drawable.loading)
                .error(R.drawable.nofoto)
                .into(imgdocente);



    }

    public void llamar5(View view){
        Intent intent = new Intent(this, historialalumnos.class);
        startActivity(intent);

    }

}