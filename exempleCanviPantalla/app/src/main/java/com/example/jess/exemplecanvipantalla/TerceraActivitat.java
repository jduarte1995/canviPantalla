package com.example.jess.exemplecanvipantalla;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TerceraActivitat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercera_activitat);

        TextView labelNom = (TextView)findViewById(R.id.labelNom);
        TextView labelCognom = (TextView)findViewById(R.id.labelCognom);
        TextView labelEdat = (TextView)findViewById(R.id.labelEdat);

        Bundle b = getIntent().getExtras();

        labelNom.setText(b.getString("Nom"));
        labelCognom.setText(b.getString("Cognom"));
        labelEdat.setText(b.getString("Edat"));

    }
}
