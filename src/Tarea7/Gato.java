package Tarea7;

import java.awt.*;

public class Gato {
    private String raza;
    private double peso;
    private Color colorcuerpo;
    private Color ojos;
    public Gato() {
    }
    public Gato(String raza, double peso, Color colorcuerpo, Color ojos) {
        this.raza = raza;
        this.peso = peso;
        this.colorcuerpo = colorcuerpo;
        this.ojos = ojos;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Color getColor() {
        return colorcuerpo;
    }

    public void setColor(Color colorcuerpo) {
        this.colorcuerpo = colorcuerpo;
    }

    public Color getOjos() {
        return ojos;
    }

    public void setOjos(Color ojos) {
        this.ojos = ojos;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "raza='" + raza + '\'' +
                ", peso=" + peso +
                ", color=" + colorcuerpo +
                ", ojos=" + ojos +
                '}';
    }
}
