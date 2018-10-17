package com.example.cf17jesusatset.creacionylogindeusuario;

public class Usuario {

    private String Email;
    private String Contrasenya;

    public Usuario(String Email, String Contrasenya) {
        this.Email = Email;
        this.Contrasenya = Contrasenya;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getContrasenya() {
        return Contrasenya;
    }

    public void setContrasenya(String Contrasenya) {
        this.Contrasenya = Contrasenya;
    }
}


