package com.vargas.guiafiiug;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import java.util.List;
import java.util.Map;

public class BloquesActivity extends AppCompatActivity {

    private LinearLayout bloquesContainer;
    private ImageButton btnVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        TextView titulo = findViewById(R.id.tituloLista);
        titulo.setText("Bloques del Campus");

        bloquesContainer = findViewById(R.id.listaContainer);
        btnVolver = findViewById(R.id.btnVolverLista);

        btnVolver.setOnClickListener(v -> finish());

        cargarBloques();
    }

    private void cargarBloques() {
        Map<String, List<LocationData.Ubicacion>> bloqueMap = LocationData.obtenerPorBloque();

        for (Map.Entry<String, List<LocationData.Ubicacion>> entry : bloqueMap.entrySet()) {
            String nombreBloque = entry.getKey();
            List<LocationData.Ubicacion> ubicaciones = entry.getValue();

            // Crear card para cada bloque
            CardView cardView = new CardView(this);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            );
            params.setMargins(0, 0, 0, 24);
            cardView.setLayoutParams(params);
            cardView.setCardElevation(8);
            cardView.setRadius(16);

            LinearLayout contentLayout = new LinearLayout(this);
            contentLayout.setOrientation(LinearLayout.VERTICAL);
            contentLayout.setPadding(32, 32, 32, 32);

            // Título del bloque
            TextView tituloBloque = new TextView(this);
            tituloBloque.setText("🏛️ " + nombreBloque);
            tituloBloque.setTextSize(20);
            tituloBloque.setTextColor(getResources().getColor(android.R.color.black));
            tituloBloque.setTypeface(null, android.graphics.Typeface.BOLD);
            contentLayout.addView(tituloBloque);

            // Cantidad de ubicaciones
            TextView cantidadText = new TextView(this);
            cantidadText.setText(ubicaciones.size() + " ubicaciones");
            cantidadText.setTextSize(14);
            cantidadText.setTextColor(getResources().getColor(android.R.color.darker_gray));
            LinearLayout.LayoutParams cantParams = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            );
            cantParams.setMargins(0, 8, 0, 16);
            cantidadText.setLayoutParams(cantParams);
            contentLayout.addView(cantidadText);

            // Listar algunas ubicaciones principales
            int count = 0;
            for (LocationData.Ubicacion ubicacion : ubicaciones) {
                if (count >= 3) break; // Mostrar solo las primeras 3

                TextView itemText = new TextView(this);
                itemText.setText("• " + ubicacion.nombre + " - " + ubicacion.piso);
                itemText.setTextSize(13);
                itemText.setTextColor(getResources().getColor(android.R.color.black));
                LinearLayout.LayoutParams itemParams = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.WRAP_CONTENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                );
                itemParams.setMargins(16, 4, 0, 4);
                itemText.setLayoutParams(itemParams);
                contentLayout.addView(itemText);
                count++;
            }

            if (ubicaciones.size() > 3) {
                TextView masText = new TextView(this);
                masText.setText("... y " + (ubicaciones.size() - 3) + " más");
                masText.setTextSize(12);
                masText.setTextColor(getResources().getColor(android.R.color.darker_gray));
                masText.setTypeface(null, android.graphics.Typeface.ITALIC);
                LinearLayout.LayoutParams masParams = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.WRAP_CONTENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                );
                masParams.setMargins(16, 8, 0, 0);
                masText.setLayoutParams(masParams);
                contentLayout.addView(masText);
            }

            cardView.addView(contentLayout);
            bloquesContainer.addView(cardView);
        }
    }
}