package com.iesam.bank.domain;

public class Employees {

    public String dni;
    public String nombre;
    public String apellidos;
    public String numSegSocial;

    public Employees(String dni, String nombre, String apellidos, String numSegSocial) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numSegSocial = numSegSocial;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNumSegSocial() {
        return numSegSocial;
    }

    public void setNumSegSocial(String numSegSocial) {
        this.numSegSocial = numSegSocial;
    }
}
