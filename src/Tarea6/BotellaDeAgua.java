package Tarea6;

import java.awt.*;

public class BotellaDeAgua {
    private String marca;
    private int capacidad;
    private Color color;
    private Boolean rosca;

    public BotellaDeAgua() {
    }

    public BotellaDeAgua(String marca, int capacidad, Color color, Boolean rosca) {
        this.marca = marca;
        this.capacidad = capacidad;
        this.color = color;
        this.rosca = rosca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(byte capacidad) {
        this.capacidad = capacidad;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Boolean getRosca() {
        return rosca;
    }

    public void setRosca(Boolean rosca) {
        this.rosca = rosca;
    }
    @Override
    public String toString() {
        return "Tarea5.Tarea5.BotellaDeAgua{" +
                "marca='" + marca + '\'' +
                ", capacidad=" + capacidad +
                ", color=" + color +
                ", rosca=" + rosca +
                '}';
    }
}
