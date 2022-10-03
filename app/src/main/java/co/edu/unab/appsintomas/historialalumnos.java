package co.edu.unab.appsintomas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import co.edu.unab.appsintomas.entities.reporte;

public class historialalumnos extends AppCompatActivity {
    private ListView listareporte;
    private ArrayList<reporte> listadoreportes= new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historialalumnos);
        getSupportActionBar().hide();
        setup();
    }

    public void setup(){

        listareporte = findViewById(R.id.listahistorialalumno);

        reporte historial = new reporte("457855","65895","22-09-2022",0,0,1,0,1);
        // Initializing a new list
        listadoreportes.add(historial);

        // Initialize a new ArrayAdapter
        ArrayAdapter<reporte> adapter = new ArrayAdapter<reporte>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                listadoreportes
        );

        listareporte.setAdapter(adapter);

    }

}