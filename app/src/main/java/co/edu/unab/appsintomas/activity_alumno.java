package co.edu.unab.appsintomas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;

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
    }

    public void llamar5(View view){
        Intent intent = new Intent(this, historialalumnos.class);
        startActivity(intent);

    }

}