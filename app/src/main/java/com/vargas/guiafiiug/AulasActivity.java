package com.vargas.guiafiiug;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class AulasActivity extends AppCompatActivity {

    private LinearLayout aulasContainer;
    private ImageButton btnVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        TextView titulo = findViewById(R.id.tituloLista);
        titulo.setText("Aulas");

        aulasContainer = findViewById(R.id.listaContainer);
        btnVolver = findViewById(R.id.btnVolverLista);

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        cargarAulas();
    }

    private void cargarAulas() {
        java.util.List<LocationData.Ubicacion> aulas = LocationData.obtenerPorTipo("aula");

        for (final LocationData.Ubicacion aula : aulas) {
            View itemView = getLayoutInflater().inflate(R.layout.item_ubicacion, aulasContainer, false);

            TextView nombreText = itemView.findViewById(R.id.nombreUbicacion);
            TextView bloqueText = itemView.findViewById(R.id.bloqueUbicacion);
            TextView pisoText = itemView.findViewById(R.id.pisoUbicacion);
            TextView descripcionText = itemView.findViewById(R.id.descripcionUbicacion);
            TextView tipoIcon = itemView.findViewById(R.id.tipoIcon);

            nombreText.setText(aula.nombre);
            bloqueText.setText("📍 " + aula.bloque);
            pisoText.setText("🏢 " + aula.piso);
            descripcionText.setText(aula.descripcion);
            tipoIcon.setText("📚");

            // Click para ver detalles
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(AulasActivity.this, DetalleActivity.class);
                    intent.putExtra("nombre", aula.nombre);
                    intent.putExtra("bloque", aula.bloque);
                    intent.putExtra("piso", aula.piso);
                    intent.putExtra("descripcion", aula.descripcion);
                    intent.putExtra("instrucciones", aula.instrucciones);
                    intent.putExtra("tipo", aula.tipo);
                    startActivity(intent);
                }
            });

            aulasContainer.addView(itemView);
        }
    }
}
