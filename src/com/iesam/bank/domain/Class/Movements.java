package com.iesam.bank.domain.Class;

public class Movements {

    public Integer idMovimiento;
    public  String descripcionM;
    public String importeM;
    public String ingresos;
    public String pagos;

    public Movements(Integer idMovimiento, String descripcionM, String importeM, String ingresos, String pagos) {
        this.idMovimiento = idMovimiento;
        this.descripcionM = descripcionM;
        this.importeM = importeM;
        this.ingresos = ingresos;
        this.pagos = pagos;
    }

    public Integer getIdMovimiento() {
        return idMovimiento;
    }

    public void setIdMovimiento(Integer idMovimiento) {
        this.idMovimiento = idMovimiento;
    }

    public String getDescripcionM() {
        return descripcionM;
    }

    public void setDescripcionM(String descripcionM) {
        this.descripcionM = descripcionM;
    }

    public String getImporteM() {
        return importeM;
    }

    public void setImporteM(String importeM) {
        this.importeM = importeM;
    }

    public String getIngresos() {
        return ingresos;
    }

    public void setIngresos(String ingresos) {
        this.ingresos = ingresos;
    }

    public String getPagos() {
        return pagos;
    }

    public void setPagos(String pagos) {
        this.pagos = pagos;
    }
}
