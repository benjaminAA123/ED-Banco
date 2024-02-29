package com.iesam.bank.domain.Class;

public class Mortgages  extends BankingProduct{

    private String fechaInicioPrest;
    private String interes;
    private String fechaFinPrest;
    private String importepPrest;



    public Mortgages(Integer codigo, String nombre, String descripcion, String fechaInicioPrest, String interes, String fechaFinPrest, String importepPrest) {
        super(codigo, nombre, descripcion);
        this.fechaInicioPrest = fechaInicioPrest;
        this.interes = interes;
        this.fechaFinPrest = fechaFinPrest;
        this.importepPrest = importepPrest;
    }

    public String getFechaInicioPrest() {
        return fechaInicioPrest;
    }

    public void setFechaInicioPrest(String fechaInicioPrest) {
        this.fechaInicioPrest = fechaInicioPrest;
    }

    public String getInteres() {
        return interes;
    }

    public void setInteres(String interes) {
        this.interes = interes;
    }

    public String getFechaFinPrest() {
        return fechaFinPrest;
    }

    public void setFechaFinPrest(String fechaFinPrest) {
        this.fechaFinPrest = fechaFinPrest;
    }

    public String getImportepPrest() {
        return importepPrest;
    }

    public void setImportepPrest(String importepPrest) {
        this.importepPrest = importepPrest;
    }
}
