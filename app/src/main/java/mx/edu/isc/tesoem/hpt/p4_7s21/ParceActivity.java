package mx.edu.isc.tesoem.hpt.p4_7s21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import DatosParce.DatosParce;

public class ParceActivity extends AppCompatActivity {


    TextView lblnombre, lblcorreo, lbledad;
    Button btnregresa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parce);
        lblnombre = findViewById(R.id.p3lblnombre);
        lbledad = findViewById(R.id.lbledad);
        lblcorreo = findViewById(R.id.p3lblcorreo);
        btnregresa = findViewById(R.id.p3btnregresa);

        DatosParce datosParce = getIntent().getParcelableExtra("datosparcelables");
        lblnombre.setText(datosParce.getNombre());
        lbledad.setText(String.valueOf(datosParce.getEdad()));
        lblcorreo.setText(datosParce.getCorreo());


        btnregresa.setOnClickListener(new onCreateView().OnClickListener);
        @Override
                public void onClick (View view){
           Intent lanza = new Intent(ParceActivity.this,PrincipalActivity.class);
    }
}