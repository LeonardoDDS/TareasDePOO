package Tarea7;

import java.awt.*;

public class Balon {
    private double tamano;
    private String marca;
    private Color color;

    public Balon() {
    }

    public Balon(double tamano, String marca, Color color) {
        this.tamano = tamano;
        this.marca = marca;
        this.color = color;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Balon{" +
                "tamano=" + tamano +
                ", marca='" + marca + '\'' +
                ", color=" + color +
                '}';
    }
}
