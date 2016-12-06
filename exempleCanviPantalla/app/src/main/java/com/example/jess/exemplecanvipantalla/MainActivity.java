package com.example.jess.exemplecanvipantalla;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import static android.R.attr.button;


public class MainActivity extends AppCompatActivity {
    EditText txtNom;
    EditText txtCognoms;
    EditText txtEdat;
    CheckBox chckAccepta;
    Button btnCanvi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCanvi = (Button) findViewById(R.id.btnCanvi);
        txtNom = (EditText) findViewById(R.id.txtNom);
        txtCognoms = (EditText) findViewById(R.id.txtCognoms);
        txtEdat = (EditText) findViewById(R.id.txtEdat);
        chckAccepta = (CheckBox) findViewById(R.id.chckAccepta);

        btnCanvi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle b = new Bundle();
                if (chckAccepta.isChecked()) {
                    b.putString("Nom", txtNom.getText().toString());
                    b.putString("Cognom", txtCognoms.getText().toString());
                    b.putString("Edat", txtEdat.getText().toString());

                    Intent intencio = new Intent(MainActivity.this, SegonaActivitat.class);
                    intencio.putExtras(b);
                    startActivity(intencio);
                } else {

                    chckAccepta.setText("Has de marcar la casella per continuar");
                }
            }

        });
    }
}


