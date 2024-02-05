package com.iesam.bank.domain;

public class BankAccount {
    public Integer idCuenta;
    public String titular;
    public String transacciones;
    public String productosContratados;
    public String saldo;

    public BankAccount(Integer idCuenta, String titular, String transacciones, String productosContratados, String saldo) {
        this.idCuenta = idCuenta;
        this.titular = titular;
        this.transacciones = transacciones;
        this.productosContratados = productosContratados;
        this.saldo = saldo;
    }

    public Integer getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(Integer idCuenta) {
        this.idCuenta = idCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(String transacciones) {
        this.transacciones = transacciones;
    }

    public String getProductosContratados() {
        return productosContratados;
    }

    public void setProductosContratados(String productosContratados) {
        this.productosContratados = productosContratados;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }
}
