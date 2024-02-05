package com.iesam.bank.domain;

public class FixedTerm extends BankingProduct {

    public String duracion_m_plazos;
    public  String plazoAplicado;


    public FixedTerm(Integer codigo, String nombre, String descripcion, String duracion_m_plazos, String plazoAplicado) {
        super(codigo, nombre, descripcion);
        this.duracion_m_plazos = duracion_m_plazos;
        this.plazoAplicado = plazoAplicado;
    }
}
