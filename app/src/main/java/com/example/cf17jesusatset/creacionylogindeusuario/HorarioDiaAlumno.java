package com.example.cf17jesusatset.creacionylogindeusuario;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class HorarioDiaAlumno extends AppCompatActivity {

    public TextView DiaSeleccionado;
    public TextView AlumnoSeleccionado;
    public TextView PrimeraHora;
    public TextView SegundaHora;
    public TextView QuartaHora;
    public TextView QuintaHora;
    public TextView ÚtlimaHora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_horario_dia_alumno);

        DiaSeleccionado = findViewById(R.id.Dia);
        AlumnoSeleccionado = findViewById(R.id.Alumno);
        PrimeraHora = findViewById(R.id.PrHora);
        SegundaHora = findViewById(R.id.SnHora);
        QuartaHora = findViewById(R.id.QtHora);
        QuintaHora = findViewById(R.id.QitHora);
        ÚtlimaHora = findViewById(R.id.StHora);

        Intent intent = getIntent();
        String Dia = intent.getStringExtra(SeleccionarHorarioAlumno.EXTRA_MESSAGE);
        String Alumn = intent.getStringExtra(SeleccionarHorarioAlumno.EXTRA_MESSAGE2);

        DiaSeleccionado.setText(Dia);
        AlumnoSeleccionado.setText(Alumn);

        //  variable  mostrar_modulos_dia( id_alumno , int dia)
        // actualizar_horario_dia( variable retornada en metodo anterior)
        if(Alumn.equals("Bartolo") && Dia.equals("Lunes")) {
            PrimeraHora.setText("M3");
            SegundaHora.setText("M3");
            QuartaHora.setText("M6");
            QuintaHora.setText("M6");
            ÚtlimaHora.setText("FOL");
        }

        if(Alumn.equals("Cristina") && Dia.equals("Lunes")) {
            PrimeraHora.setText("M10");
            SegundaHora.setText("M10");
            QuartaHora.setText("M1");
            QuintaHora.setText("M5");
            ÚtlimaHora.setText("M7");
        }

    }

}
