package Tarea9;

import java.awt.*;

public class Automovil extends Vehiculo{
    private String modelo;
    private String marca;
    //en tipo me refiero a carro, moto,trailer, etc.
    private String tipo;
    private boolean quemacocos;
    public Automovil() {
    }
    public Automovil(String motor, Color color, String combustible, String modelo, String marca, String tipo, boolean quemacocos) {
        super(motor, color, combustible);
        this.modelo = modelo;
        this.marca = marca;
        this.tipo = tipo;
        this.quemacocos = quemacocos;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isQuemacocos() {
        return quemacocos;
    }

    public void setQuemacocos(boolean quemacocos) {
        this.quemacocos = quemacocos;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", tipo='" + tipo + '\'' +
                ", quemacocos=" + quemacocos +
                '}';
    }
    //Abrir o cerrar quemacocos
    public boolean aoCQc(boolean openClose){
        if(openClose == true){
            System.out.println("Abriendo quemacocos...");
        } else {
            System.out.println("Cerrando quemacocos...");
        }
        return openClose;
    }
    public void detener(){
        System.out.println("Deteniendo...");
    }
}
