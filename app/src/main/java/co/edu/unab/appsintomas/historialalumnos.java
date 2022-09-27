package co.edu.unab.appsintomas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;

public class historialalumnos extends AppCompatActivity {
    private ListView listareporte;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historialalumnos);
        getSupportActionBar().hide();
        setup();
    }

    public void setup(){

        listareporte = findViewById(R.id.listahistorialalumno);
        // Initializing a new list
        List<String> lista = Arrays.asList(
                "15-07-2022:HABILITADO",
                "12-06-2022:HABILITADO",
                "13-05-2022:HABILITADO",
                "10-04-2022:HABILITADO",
                "09-03-2022:HABILITADO"

        );

        // Initialize a new ArrayAdapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                lista
        );

        // Set the adapter for ListView
        listareporte.setAdapter(adapter);

    }

}