package com.example.jess.exemplecanvipantalla;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SegonaActivitat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segona_activitat);

        TextView labelHola = (TextView)findViewById(R.id.labelNom);
        TextView labelCognom = (TextView)findViewById(R.id.labelCognom);
        TextView labelEdat = (TextView)findViewById(R.id.labelEdat);

        Bundle b = getIntent().getExtras();

        labelHola.setText(b.getString("Nom"));
        labelCognom.setText(b.getString("Cognom"));
        labelEdat.setText(b.getString("Edat"));

    }
}
