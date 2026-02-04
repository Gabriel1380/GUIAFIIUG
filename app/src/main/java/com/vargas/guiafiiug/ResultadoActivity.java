package com.vargas.guiafiiug;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ResultadoActivity extends AppCompatActivity {

    private TextView tituloResultado, noResultadosText;
    private LinearLayout resultadosContainer;
    private ImageButton btnVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        tituloResultado = findViewById(R.id.tituloResultado);
        resultadosContainer = findViewById(R.id.resultadosContainer);
        noResultadosText = findViewById(R.id.noResultadosText);
        btnVolver = findViewById(R.id.btnVolver);

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        String busqueda = getIntent().getStringExtra("busqueda");
        if (busqueda == null) busqueda = "";

        tituloResultado.setText("Resultados para: " + busqueda);

        java.util.List<LocationData.Ubicacion> resultados = LocationData.buscarUbicacion(busqueda);
        mostrarResultados(resultados);
    }

    private void mostrarResultados(java.util.List<LocationData.Ubicacion> resultados) {
        resultadosContainer.removeAllViews();

        if (resultados.isEmpty()) {
            noResultadosText.setVisibility(View.VISIBLE);
            return;
        }

        noResultadosText.setVisibility(View.GONE);

        for (final LocationData.Ubicacion ubicacion : resultados) {
            View itemView = getLayoutInflater().inflate(R.layout.item_ubicacion, resultadosContainer, false);

            TextView nombreText = itemView.findViewById(R.id.nombreUbicacion);
            TextView bloqueText = itemView.findViewById(R.id.bloqueUbicacion);
            TextView pisoText = itemView.findViewById(R.id.pisoUbicacion);
            TextView descripcionText = itemView.findViewById(R.id.descripcionUbicacion);
            TextView tipoIcon = itemView.findViewById(R.id.tipoIcon);

            nombreText.setText(ubicacion.nombre);
            bloqueText.setText("📍 " + ubicacion.bloque);
            pisoText.setText("🏢 " + ubicacion.piso);
            descripcionText.setText(ubicacion.descripcion);

            // Ícono según tipo
            switch (ubicacion.tipo) {
                case "aula":
                    tipoIcon.setText("📚");
                    break;
                case "departamento":
                    tipoIcon.setText("🏢");
                    break;
                case "servicio":
                    tipoIcon.setText("🔧");
                    break;
                default:
                    tipoIcon.setText("📍");
                    break;
            }

            // Click para ver detalles
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(ResultadoActivity.this, DetalleActivity.class);
                    intent.putExtra("nombre", ubicacion.nombre);
                    intent.putExtra("bloque", ubicacion.bloque);
                    intent.putExtra("piso", ubicacion.piso);
                    intent.putExtra("descripcion", ubicacion.descripcion);
                    intent.putExtra("instrucciones", ubicacion.instrucciones);
                    intent.putExtra("tipo", ubicacion.tipo);
                    startActivity(intent);
                }
            });

            resultadosContainer.addView(itemView);
        }
    }
}