package Tarea6;

import java.awt.*;

public class EjecucionTarea6 {
    public static void main(String[] args) {
        Persona persona = new Persona(19, "leo", 1.70, 45.5, "Masculino");
        System.out.println(persona);
        Monitor mon = new Monitor(32.5, "Samsung", "MK8", "LED", 3000.50);
        System.out.println(mon);
        Automovil automovil1 = new Automovil("Dodge", "Atitud", (byte) 20, Color.cyan);
        System.out.println(automovil1);
        BotellaDeAgua botella1 = new BotellaDeAgua("TupperWare", 500, Color.CYAN,true);
        System.out.println(botella1);
    }
}
