package Tarea9;

import java.awt.*;

public class Vehiculo {
    protected String motor;
    protected Color color;
    protected String combustible;

    public Vehiculo() {
    }

    public Vehiculo(String motor, Color color, String combustible) {
        this.motor = motor;
        this.color = color;
        this.combustible = combustible;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "motor='" + motor + '\'' +
                ", color=" + color +
                ", combustible='" + combustible + '\'' +
                '}';
    }
    public boolean encender(boolean encender){
        if(encender == true){
            System.out.println("Encendiendo...");
        }
        return encender;
    }
    public boolean avanzar(boolean avanzando){
        if(avanzando == true){
            System.out.println("Avanzando...");
        }
        return avanzando;
    }
}
