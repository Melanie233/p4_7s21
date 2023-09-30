package mx.edu.isc.tesoem.hpt.p4_7s21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ContestaActivity extends AppCompatActivity {
    TextView lblrecibe;
    Button p2btnregresa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contesta);


        lblrecibe =  findViewById(R.id.lblrecibe);
        p2btnregresa = findViewById(R.id.btnp2regresa);

        Bundle parametros = getIntent().getExtras();
        lblrecibe.setText(parametros.getString("nombre"));


        p2btnregresa.setOnClickListener(new View.OnClickListener();
        @Override
            public void onClick(View view) {
                intent lanza = new Intent(BasicaActivity.this, PrincipalActivity.class);
                startActivity(lanza);
                finish();
            }
        });
    }
}