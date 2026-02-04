package com.vargas.guiafiiug;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DepartamentosActivity extends AppCompatActivity {

    private LinearLayout departamentosContainer;
    private ImageButton btnVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        TextView titulo = findViewById(R.id.tituloLista);
        titulo.setText("Departamentos y Servicios");

        departamentosContainer = findViewById(R.id.listaContainer);
        btnVolver = findViewById(R.id.btnVolverLista);

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        cargarDepartamentos();
    }

    private void cargarDepartamentos() {
        java.util.List<LocationData.Ubicacion> departamentos = LocationData.obtenerPorTipo("departamento");
        java.util.List<LocationData.Ubicacion> servicios = LocationData.obtenerPorTipo("servicio");

        // Agregar departamentos
        for (LocationData.Ubicacion depto : departamentos) {
            agregarItem(depto, "🏢");
        }

        // Agregar servicios
        for (LocationData.Ubicacion servicio : servicios) {
            agregarItem(servicio, "🔧");
        }
    }

    private void agregarItem(final LocationData.Ubicacion ubicacion, String icono) {
        View itemView = getLayoutInflater().inflate(R.layout.item_ubicacion, departamentosContainer, false);

        TextView nombreText = itemView.findViewById(R.id.nombreUbicacion);
        TextView bloqueText = itemView.findViewById(R.id.bloqueUbicacion);
        TextView pisoText = itemView.findViewById(R.id.pisoUbicacion);
        TextView descripcionText = itemView.findViewById(R.id.descripcionUbicacion);
        TextView tipoIcon = itemView.findViewById(R.id.tipoIcon);

        nombreText.setText(ubicacion.nombre);
        bloqueText.setText("📍 " + ubicacion.bloque);
        pisoText.setText("🏢 " + ubicacion.piso);
        descripcionText.setText(ubicacion.descripcion);
        tipoIcon.setText(icono);

        // Click para ver detalles
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DepartamentosActivity.this, DetalleActivity.class);
                intent.putExtra("nombre", ubicacion.nombre);
                intent.putExtra("bloque", ubicacion.bloque);
                intent.putExtra("piso", ubicacion.piso);
                intent.putExtra("descripcion", ubicacion.descripcion);
                intent.putExtra("instrucciones", ubicacion.instrucciones);
                intent.putExtra("tipo", ubicacion.tipo);
                startActivity(intent);
            }
        });

        departamentosContainer.addView(itemView);
    }
}