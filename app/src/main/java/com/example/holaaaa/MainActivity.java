package com.example.holaaaa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewCantante;
    private RecyclerViewAdaptador adaptadorCantante;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewCantante = (RecyclerView) findViewById(R.id.rvLista);
        recyclerViewCantante.setLayoutManager(new LinearLayoutManager(this));

        adaptadorCantante = new RecyclerViewAdaptador(obtenerCantante());
        recyclerViewCantante.setAdapter(adaptadorCantante);
    }

    public List<modeloCantante> obtenerCantante() {
        List<modeloCantante> cantante = new ArrayList<>();
        cantante.add(new modeloCantante("noseequien es", "español", R.drawable.ima1));
        cantante.add(new modeloCantante("dasdassa es", "español", R.drawable.ima2));
        cantante.add(new modeloCantante("ssssss es", "español", R.drawable.ima3));
        cantante.add(new modeloCantante("ninini es", "español", R.drawable.ima4));
        cantante.add(new modeloCantante("akekiko es", "español", R.drawable.ima5));
        cantante.add(new modeloCantante("dsdsaas es", "español", R.drawable.ima6));
        return cantante;
    }
}