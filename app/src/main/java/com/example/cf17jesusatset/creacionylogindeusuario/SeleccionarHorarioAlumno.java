package com.example.cf17jesusatset.creacionylogindeusuario;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.DragAndDropPermissions;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class SeleccionarHorarioAlumno extends AppCompatActivity {

    private Button Seleccionar;
    private Spinner DiaSemana;
    private Spinner Alumno;
    public String Dia;
    public String Alumn;
    public static final String EXTRA_MESSAGE = "Etiqueta_dia.MESSAGE";
    public static final String EXTRA_MESSAGE2 = "Etiqueta_alumno.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccionar_horario_alumno);

        DiaSemana = findViewById(R.id.spinnerDia);
        Seleccionar = findViewById(R.id.Selec);
        Alumno = findViewById(R.id.spinnerAlumno);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.DiasSemana,android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,R.array.Alumnos,android.R.layout.simple_spinner_item);

        DiaSemana.setAdapter(adapter);
        Alumno.setAdapter(adapter2);

        Alumno.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Alumn = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        DiaSemana.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Dia = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        Seleccionar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent SignUp = new Intent(SeleccionarHorarioAlumno.this, HorarioDiaAlumno.class);
                SignUp.putExtra(EXTRA_MESSAGE2,Alumn);
                SignUp.putExtra(EXTRA_MESSAGE,Dia);
                startActivity(SignUp);
            }
        });

    }

}


