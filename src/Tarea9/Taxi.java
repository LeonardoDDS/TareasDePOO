package Tarea9;

import java.awt.*;
import java.util.Scanner;

public class Taxi extends Automovil{
    private boolean aplicacion;
    //la revista es un documento que necesitan los taxis
    private boolean revista;
    //con pintura pues esta es distinta dependiendo del estado
    private String tipoPintura;

    public Taxi() {
    }

    public Taxi(String motor, Color color, String combustible, String modelo, String marca, String tipo, boolean quemacocos, boolean aplicacion, boolean revista, String tipoPintura) {
        super(motor, color, combustible, modelo, marca, tipo, quemacocos);
        this.aplicacion = aplicacion;
        this.revista = revista;
        this.tipoPintura = tipoPintura;
    }

    public boolean isAplicacion() {
        return aplicacion;
    }

    public void setAplicacion(boolean aplicacion) {
        this.aplicacion = aplicacion;
    }

    public boolean isRevista() {
        return revista;
    }

    public void setRevista(boolean revista) {
        this.revista = revista;
    }

    public String getTipoPintura() {
        return tipoPintura;
    }

    public void setTipoPintura(String tipoPintura) {
        this.tipoPintura = tipoPintura;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "aplicacion=" + aplicacion +
                ", revista=" + revista +
                ", tipoPintura='" + tipoPintura + '\'' +
                '}';
    }
    public boolean inciarViaje(boolean viaje){
        if (viaje == true) {
            System.out.println("Iniciando viaje");
        } else{
            System.out.println("Sin viaje");
        }
        return viaje;
    }
    public int costoViaje(int porPagar){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el costo del viaje");
        porPagar = teclado.nextInt();
        System.out.println("El costo es " + porPagar);
        return porPagar;
    }
}
