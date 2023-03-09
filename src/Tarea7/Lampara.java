package Tarea7;

import java.awt.*;

public class Lampara {
    private String modelo;
    private String marca;
    private Color color;
    private double voltaje;
    private boolean estado;

    public Lampara() {
    }

    public Lampara(String modelo, String marca, Color color, double voltaje, boolean estado) {
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.voltaje = voltaje;
        this.estado = estado;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
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

    public double getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(double voltaje) {
        this.voltaje = voltaje;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Lampara{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", color=" + color +
                ", voltaje=" + voltaje +
                ", estado=" + estado +
                '}';
    }

    public void onOff(){
        if(estado == true){
            System.out.println("Encendiendo lampara " + modelo);
        }else {
            System.out.println("Apagando lampara " + modelo);
        }
    }
}
