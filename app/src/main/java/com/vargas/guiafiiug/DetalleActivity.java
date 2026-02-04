package com.vargas.guiafiiug;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetalleActivity extends AppCompatActivity {

    private ImageButton btnVolver;
    private TextView nombreText, bloqueText, pisoText, descripcionText, instruccionesText, tipoIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        // Inicializar vistas
        btnVolver = findViewById(R.id.btnVolverDetalle);
        nombreText = findViewById(R.id.nombreDetalle);
        bloqueText = findViewById(R.id.bloqueDetalle);
        pisoText = findViewById(R.id.pisoDetalle);
        descripcionText = findViewById(R.id.descripcionDetalle);
        instruccionesText = findViewById(R.id.instruccionesDetalle);
        tipoIcon = findViewById(R.id.tipoIconDetalle);

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        // Obtener datos del intent
        String nombre = getIntent().getStringExtra("nombre");
        String bloque = getIntent().getStringExtra("bloque");
        String piso = getIntent().getStringExtra("piso");
        String descripcion = getIntent().getStringExtra("descripcion");
        String instrucciones = getIntent().getStringExtra("instrucciones");
        String tipo = getIntent().getStringExtra("tipo");

        if (nombre == null) nombre = "";
        if (bloque == null) bloque = "";
        if (piso == null) piso = "";
        if (descripcion == null) descripcion = "";
        if (instrucciones == null) instrucciones = "";
        if (tipo == null) tipo = "";

        // Mostrar datos
        nombreText.setText(nombre);
        bloqueText.setText("📍 " + bloque);
        pisoText.setText("🏢 " + piso);
        descripcionText.setText(descripcion);
        instruccionesText.setText(instrucciones);

        // Ícono según tipo
        switch (tipo) {
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
    }
}