package com.example.listas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private EditText etAgregar;
    private Button bAgregar;
    private ListView lvLista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etAgregar=findViewById(R.id.etAgregar);
        bAgregar=findViewById(R.id.bAgregar);
        lvLista=findViewById(R.id.lvLista);

        ListaEnlazada le = new ListaEnlazada();
        le.crearListaEnlazada();
        Log.i("log", le.toString());

    }

}