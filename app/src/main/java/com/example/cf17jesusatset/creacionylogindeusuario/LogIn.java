package com.example.cf17jesusatset.creacionylogindeusuario;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LogIn extends AppCompatActivity {

    private EditText Email;
    private EditText Contrasenya;
    private Button LogIn;
    private TextView ContrayEmail;

    public void ComprovarUsuario(EditText Email, EditText Contrasenya) {
        if (Email.getText().toString().equals("admin@admin.com") && Contrasenya.getText().toString().equals("admin")) {
            ContrayEmail.setVisibility(View.VISIBLE);
            ContrayEmail.setText("Redireccionando");
            Intent intent = new Intent(LogIn.this, SeleccionarHorarioAlumno.class);
            startActivity(intent);
        } else {
            ContrayEmail.setVisibility(View.VISIBLE);
            ContrayEmail.setText("Usuario no existente");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_log_in);

        Email = (EditText)findViewById(R.id.EMA);
        Contrasenya = findViewById(R.id.CON);
        LogIn = findViewById(R.id.LOG);
        ContrayEmail = findViewById(R.id.ContraEm);

        ContrayEmail.setVisibility(View.INVISIBLE);

        LogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ComprovarUsuario(Email, Contrasenya);

            }
        });


    }
}
