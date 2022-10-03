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

public class activity_docente extends AppCompatActivity {
    private ListView listasintomas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_docente);
        getSupportActionBar().hide();
        setup();

    }

    public void setup(){

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
        usuario user= new usuario("1234","Bruce Banner"
                ,"HUlk","enojado2022","CE",56474,
                "https://upload.wikimedia.org/wikipedia/en/thumb/3/3b/Mark_Ruffalo_as_%22Professor_Hulk%22.jpeg/1280px-Mark_Ruffalo_as_%22Professor_Hulk%22.jpeg",
                "habilitado","DOCENTE");
        String urlimg= user.getUrl_foto();
        ImageView imgdocente= findViewById(R.id.imagendocente);
        Picasso.get()
                .load(urlimg)
                .placeholder(R.drawable.loading)
                .error(R.drawable.nofoto)
                .into(imgdocente);


    }

    public void llamarhd(View view){
        Intent intent = new Intent(this, historialdocente.class);
        startActivity(intent);

    }
    public void llamarcd(View view){
        Intent intent = new Intent(this, cursosdocente.class);
        startActivity(intent);

    }
}