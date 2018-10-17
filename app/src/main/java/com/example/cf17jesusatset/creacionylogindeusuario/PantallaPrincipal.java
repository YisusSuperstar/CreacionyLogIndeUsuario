package com.example.cf17jesusatset.creacionylogindeusuario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PantallaPrincipal extends AppCompatActivity {

    Button LogIn;
    Button SignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_principal);

        SignUp = (Button)findViewById(R.id.SignUP);
        SignUp.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent SignUp = new Intent(PantallaPrincipal.this, CreacionUsuario.class);
                startActivity(SignUp);
            }
        });

        LogIn = (Button)findViewById(R.id.LogIN);
        LogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent LogIn = new Intent(PantallaPrincipal.this, LogIn.class);
                startActivity(LogIn);
            }
        });
    }
}