package com.iesam.bank.domain.Class;

public class Card extends BankingProduct  {

    private String fechaCaducidad;
    private String numTarjeta;

    public Card(Integer codigo, String nombre, String descripcion, String fechaCaducidad, String numTarjeta) {
        super(codigo, nombre, descripcion);
        this.fechaCaducidad = fechaCaducidad;
        this.numTarjeta = numTarjeta;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }
}
