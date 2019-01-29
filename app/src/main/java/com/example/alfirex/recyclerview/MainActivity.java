package com.example.alfirex.recyclerview;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    // Creamos el ArrayList de Nuestra clase
    ArrayList<CicleFlorida> alCiclosFlorida = new ArrayList<CicleFlorida>();

    // Atributos Nuevos de la Actividad para comunicar con el Adaptador
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    Adaptador adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializamos el Array List
        alCiclosFlorida = new ArrayList<>();
        addElementosArrayList();// Añadimos los valores al ArrayList

        // Obtenemos el id del RecyclerView
        recyclerView = (RecyclerView) findViewById(R.id.idRecyclerView);
        linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        adaptador = new Adaptador(alCiclosFlorida); // Introducimos el array al Adaptador
        recyclerView.setAdapter(adaptador);

    }

    /**
     * Creamos funcion para que rellene nuestro ArrayList
     * y de esta menera insertarlo en el Recycler view
     */
    public void addElementosArrayList(){
        CicleFlorida oCliclosFlorida;

        oCliclosFlorida = new CicleFlorida("DEPORTE","SUPERIOR","BASQUET","Deporte que se Juega con las manos, Para adultos");
        alCiclosFlorida.add(oCliclosFlorida);
        oCliclosFlorida = new CicleFlorida("DEPORTE","MEDIO","BASQUET","Deporte que se Juega con las manos, Para niños");
        alCiclosFlorida.add(oCliclosFlorida);
        oCliclosFlorida = new CicleFlorida("DEPORTE","SUPERIOR","FUTBOL","Deporte que se Juega con los pies");
        alCiclosFlorida.add(oCliclosFlorida);
        oCliclosFlorida = new CicleFlorida("DEPORTE","MEDIO","FUTBOL","Deporte que se Juega con las manos, Para Niños");
        alCiclosFlorida.add(oCliclosFlorida);
        oCliclosFlorida = new CicleFlorida("DEPORTE","MEDIO","LOL","Deporte que se Juega con con el Teclado, Para niños");
        alCiclosFlorida.add(oCliclosFlorida);
        oCliclosFlorida = new CicleFlorida("DEPORTE","SUPERIOR","LOL","Deporte que se Juega con el Teclado, Para adultos");
        alCiclosFlorida.add(oCliclosFlorida);
    }

    /**
     * Metodo que se activa en el momento que apretamos el boton de atras
     */
    @Override
    public void onBackPressed() {
        // llamamos al método , para que muestre el AlertDialog con ciertos parametros
        mostrarAlertDialog("Dialogo de Alerta","Estas seguro que quieres aceptar?");
    }

    /**
     * Método que mostrará el Dialog y le pasamos parámetros de entrada
     */
    void mostrarAlertDialog(String sTitulo, String sMensaje) {
        // Le pasamos por Parametro
        MyAlertDialogFragment newFragment = MyAlertDialogFragment.newInstance(
                sTitulo,sMensaje);

        //Le decimos que que muestre el Dialogo
        newFragment.show(getSupportFragmentManager(), "Ejemplo Dialogo");
    }



}

