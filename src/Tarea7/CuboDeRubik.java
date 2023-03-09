package Tarea7;

public class CuboDeRubik {
    private String dimensiones;
    private String marca;
    private String modelo;
    private String forma;

    public CuboDeRubik() {
    }

    public CuboDeRubik(String dimensiones, String marca, String modelo, String forma) {
        this.dimensiones = dimensiones;
        this.marca = marca;
        this.modelo = modelo;
        this.forma = forma;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    @Override
    public String toString() {
        return "CuboDeRubik{" +
                "dimensiones='" + dimensiones + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", forma='" + forma + '\'' +
                '}';
    }
}
