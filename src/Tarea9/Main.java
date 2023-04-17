package Tarea9;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("M450", Color.BLACK, "Gasolina");
        vehiculo.encender(true);
        vehiculo.avanzar(true);
        System.out.println(vehiculo);
        System.out.println("----------");
        Automovil auto = new Automovil("M450", Color.black, "Gasolina", "Audi A3", "Audi",
                "Carro", true);
        auto.encender(true);
        auto.aoCQc(true);
        auto.avanzar(true);
        System.out.println("--------");
        Taxi tax = new Taxi("M450", Color.black, "Gasolina", "Audi A3", "Audi",
                "Carro", true, false, true, "CDMX");
        tax.encender(true);
        tax.avanzar(true);
        tax.aoCQc(false);
        tax.inciarViaje(true);
        tax.costoViaje(0);
        tax.detener();
    }
}
