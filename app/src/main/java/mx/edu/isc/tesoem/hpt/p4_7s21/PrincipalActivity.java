package mx.edu.isc.tesoem.hpt.p4_7s21;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import DatosParce.DatosParce;

public class PrincipalActivity extends AppCompatActivity {

    Button btnab,btnap,btnar,btnres;
    EditText txtnombre,txtcorreo,txtedad;

    ActivityResultLauncher<Intent> activityResult = registerForActivityResult(new ActivityResultContract<Intent, Object>());
    @Override
    public void onActivityResult(ActivityResult result){
        if (result.getResultCode() == RESULT_OK){
            Toast.makeText(this, "regreso con exito", Toast.LENGTH_SHORT).show();

        } else if (result.getResultCode() ==RESULT_CANCELED) {
            
        }
    });
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        txtnombre = findViewById(R.id.p1txtnombre);
        txtcorreo = findViewById(R.id.p1txtcorreo);
        txtedad = findViewById(R.id.p1txtedad);
        //aqui enlazamos los botones
        btnab = findViewById(R.id.p1btnab);
        btnab = findViewById(R.id.p1btnape);
        btnar = findViewById(R.id.p1btnres);
        //aqui activamos la escucha del click
        btnab.setOnClickListener(onNewIntent(new View.OnClickListener())
        public void onclick()
                lanza.putExtra(name:"nombre",txtnombre.getText().toString());
        startActivities(lanza);

        btnap.setOnClickListener(new onCreateView().onClickListener));{
            @Override
                    public void onClick(new View);
            DatosParce datosParce = new DatosParce (txtnombre.getText().toString(),txtcorreo.getText().toString(),integer.parseInt(txtedad))
            Intent lanza = new Intent();
            lanza.putExtra("datosparcelables",datosParce);
            startActivity(lanza);

            btnar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent lanza = new Intent(PrincipalActivity.this,)
                }
            });
        }
    }

}