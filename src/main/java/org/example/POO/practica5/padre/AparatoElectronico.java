package org.example.POO.practica5.padre;

public class AparatoElectronico {

    private String marca;
    private double precio;
    private int consumoElectrico;
    private int añosGarantia;

    public AparatoElectronico(String marca, double precio, int consumoElectrico, int añosGarantia) {
        this.marca = marca;
        this.precio = precio;
        this.consumoElectrico = consumoElectrico;
        this.añosGarantia = añosGarantia;
    }

    public AparatoElectronico(String marca, int añosGarantia, double precio) {
        this.marca = marca;
        this.añosGarantia = añosGarantia;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getConsumoElectrico() {
        return consumoElectrico;
    }

    public void setConsumoElectrico(int consumoElectrico) {
        this.consumoElectrico = consumoElectrico;
    }

    public int getAñosGarantia() {
        return añosGarantia;
    }

    public void setAñosGarantia(int añosGarantia) {
        this.añosGarantia = añosGarantia;
    }
}
