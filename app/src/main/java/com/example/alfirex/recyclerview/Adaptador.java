package com.example.alfirex.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

// Implementamos el RecyclerView con la referencia de nuestra clase Interna
public class Adaptador extends RecyclerView.Adapter<Adaptador.ElViewHolder> {
    // Creamos El ArrayLis de Ciclos Para obtner la informacion de su tamaño e añadir al intem su informacion
    ArrayList<CicleFlorida> alCiclosFlorida;

    // Contructor para recibir el array desde la actividad en la que lo invocamos
    public Adaptador(ArrayList<CicleFlorida> alCiclosFlorida) {
        this.alCiclosFlorida = alCiclosFlorida;
    }

    /**
     * Este metodo hace que reciba la clase Interna la informacion del Layout del Item
     * @return  ElViewHolder Retornamos el contructor de la clase interna y le enviamos la informacion
     * del layout del Item
     */
    @Override
    public ElViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Optenemos la informacion del XML que contiene cada elemento del RecyclerView que creamos antes en la carpeta Layout
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.un_elemento_de_la_lista,parent,false);
        // Retornamos la clase Interna con el parametro View que hemos generado en la linea de arriba
        return new ElViewHolder(v);
    }

    /**
     * En este metodo Añadiremos un tiem con la informacion del Array y le añadiremos una Posicion
     * @param holder obtiene la informacion del View
     * @param position obtiene la informacion de la posicion
     */
    @Override
    public void onBindViewHolder(ElViewHolder holder, int position) {
        // Opcion 1 de que se inserte
        holder.tvTitulo.setText(alCiclosFlorida.get(position).getTitulo());
        // Opcion 2 de que se inserte
        holder.tvDescripcion.setText(alCiclosFlorida.get(position).getDescripcion());
    }

    /**
     * Este metodo devuelve la cantidad de elementos del RecyclerView
     * @return alCiclosFlorida.size()
     */
    @Override
    public int getItemCount() {
        return alCiclosFlorida.size();
    }

    /**
     * Clase Interna del Adaptador
     */
    public static  class ElViewHolder extends RecyclerView.ViewHolder{
        // Atributos de la clase Interna
        TextView tvTitulo, tvDescripcion;

        public ElViewHolder(View itemView) {
            super(itemView);
            tvTitulo = (TextView) itemView.findViewById(R.id.tvTitulo);
            tvDescripcion = (TextView) itemView.findViewById(R.id.tvDescripcion);
        }
    }
}
