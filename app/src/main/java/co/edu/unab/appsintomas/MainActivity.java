package co.edu.unab.appsintomas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
    }

    public void llamar(View view){
        Intent intent = new Intent(this, administrador.class);
        startActivity(intent);

    }

    public void llamar2(View view){
        Intent intent = new Intent(this, docente.class);
        startActivity(intent);

    }

    public void llamar4(View view){
        Intent intent = new Intent(this, alumno.class);
        startActivity(intent);

    }
}