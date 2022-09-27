package co.edu.unab.appsintomas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

public class cursosdocente extends AppCompatActivity {
    private ListView listview;
    private ArrayList<String> textos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cursosdocente);
        getSupportActionBar().hide();
        setup();
        setup2();
    }

    public void setup(){

        //get the spinner from the xml.
        Spinner dropdown = findViewById(R.id.listspinner);
        //create a list of items for the spinner.
        String[] items = new String[]{"ALGEBRA LINEAL", "ESTADÍSTICA", "MATEMÁTICAS DISCRETAS"};
        //create an adapter to describe how the items are displayed, adapters are used in several places in android.
        //There are multiple variations of this, but this is the basic variant.
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        //set the spinners adapter to the previously created one.
        dropdown.setAdapter(adapter);

    }


    public void setup2(){


        listview =findViewById(R.id.listaalumnoscurso);
        textos = new ArrayList<String>();
        textos .add("FERNEY RENGIFO:HABILITADO");
        textos .add("ANDRES CORDOBA:INHABILITADO");
        textos .add("MICHAEL PANAMEÑO:HABILITADO");
        textos .add("EFRAIN CONGO:INHABILITADO");
        textos .add("EDUAR LUCUMÍ.HABILITADO");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                textos
        );
        listview.setAdapter(adapter);

    }
}