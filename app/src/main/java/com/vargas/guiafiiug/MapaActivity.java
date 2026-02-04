package com.vargas.guiafiiug;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.github.chrisbanes.photoview.PhotoView;

public class MapaActivity extends AppCompatActivity {

    private ImageButton btnVolver;
    private PhotoView photoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);

        TextView titulo = findViewById(R.id.tituloMapa);
        titulo.setText("Mapa del Campus Mapasingue");

        btnVolver = findViewById(R.id.btnVolverMapa);
        btnVolver.setOnClickListener(v -> finish());

        // Configurar PhotoView para zoom
        photoView = findViewById(R.id.mapaPhotoView);
        photoView.setImageResource(R.drawable.mapa_satelital); // Aquí va tu imagen satelital
    }
}