package com.example.holaaaa;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdaptador extends RecyclerView.Adapter<RecyclerViewAdaptador.ViewHolder>  {

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView cantante,nacinalidad;
        ImageView imagenCantante;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cantante = (TextView)itemView.findViewById(R.id.tvCantante);
            nacinalidad = (TextView)itemView.findViewById(R.id.tvNacionalidad);
            imagenCantante = (ImageView)itemView.findViewById(R.id.ima);
        }
    }

    public List<modeloCantante> cantantelista;

    public RecyclerViewAdaptador(List<modeloCantante> cantantelista) {
        this.cantantelista = cantantelista;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_imagenes,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdaptador.ViewHolder holder, int position) {
        holder.cantante.setText(cantantelista.get(position).getCantante());
        holder.nacinalidad.setText(cantantelista.get(position).getNacionalidad());
        holder.imagenCantante.setImageResource(cantantelista.get(position).getImgCantante());
    }

    @Override
    public int getItemCount() {
        return cantantelista.size();
    }
}
