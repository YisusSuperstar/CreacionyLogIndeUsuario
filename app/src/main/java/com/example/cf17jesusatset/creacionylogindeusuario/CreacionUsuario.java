package com.example.cf17jesusatset.creacionylogindeusuario;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CreacionUsuario extends AppCompatActivity {

    List<Usuario> ListadeUsuarios = new ArrayList<>();

    private EditText Nom;
    private EditText Email;
    private EditText Contrasenya;
    private EditText repeteixContrasenya;
    private TextView contraNoCoincide;
    private Button SignUp;
    private TextView EmailIncorrecto;

    String ValidadorEmail = Email.getText().toString().trim();

    String emailPatron = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

    public void ValidarEmail(EditText Email) {
        if (ValidadorEmail.matches(emailPatron)) {
            EmailIncorrecto.setVisibility(View.INVISIBLE);
        } else {
            EmailIncorrecto.setVisibility(View.VISIBLE);
        }
    }

    public void ContraCoincidente(EditText repeteixContrasenya, EditText Contrasenya) {
        if(repeteixContrasenya.getText().toString().equals(Contrasenya.getText().toString())) {
            contraNoCoincide.setVisibility(View.INVISIBLE);
        } else {
            contraNoCoincide.setVisibility(View.VISIBLE);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_creacion_usuario);

        Nom = findViewById(R.id.NyA);
        Email = findViewById(R.id.Em);
        Contrasenya = findViewById(R.id.Contra);
        repeteixContrasenya = findViewById(R.id.ContraRep);
        contraNoCoincide = findViewById(R.id.ContraNoCon);
        SignUp = findViewById(R.id.SignUPB);
        EmailIncorrecto = findViewById(R.id.EMIN);

        EmailIncorrecto.setVisibility(View.INVISIBLE);
        contraNoCoincide.setVisibility(View.INVISIBLE);

        SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ContraCoincidente(repeteixContrasenya, Contrasenya);
                ValidarEmail(Email);
            }
        });


    }

}
