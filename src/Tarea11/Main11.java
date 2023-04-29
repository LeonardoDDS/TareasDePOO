package Tarea11;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main11 {
    public static void main(String[] args) {
        Caja<String> miCaja = new Caja<>(new String[10]);
        miCaja.add(0, "hola");
        miCaja.add(1, "adios");
        miCaja.add(2, "hi");
        System.out.println(miCaja);

        String temp = miCaja.get(0);

        System.out.println("----------");

        CajaSinGenericos cajaSin = new CajaSinGenericos(new Object[10]);
        cajaSin.add(0, "Hola");
        cajaSin.add(1, "adios");
        cajaSin.add(2, "Hi");
        System.out.println(cajaSin);

        String temp2 = (String) cajaSin.get(0);

        System.out.println("------ comida ------");

        Caja<Comida> cajaComida = new Caja<>(new Comida[10]);
        cajaComida.add(0, new Comida("Yogurt", true));
        System.out.println(cajaComida.get(0));

        System.out.println("--------");

        ArrayList<Comida> comidas = new ArrayList<>();
        comidas.add(new Comida("Uvas", false));
        comidas.add(new Comida("Uvas", false));
        comidas.add(new Comida("Uvas", false));
        comidas.add(new Comida("Uvas", false));
        comidas.add(new Comida("Uvas", false));
        comidas.add(new Comida("Uvas", false));
        comidas.add(new Comida("Uvas", false));
        comidas.add(new Comida("Uvas", false));
        comidas.add(new Comida("Uvas", false));
        comidas.add(new Comida("Uvas", false));
        comidas.add(new Comida("Uvas", false));
        comidas.add(new Comida("Uvas", false));
        comidas.add(new Comida("Uvas", false));
        comidas.add(new Comida("Uvas", false));
        comidas.add(new Comida("Fresa", false));
        System.out.println(comidas.size());
        System.out.println(comidas.get(14));

        System.out.println("-------------");

        ArrayList<Comida> comidas2 = new ArrayList<>();
        comidas2.add(new Comida("Fresa", false));
        comidas2.add(new Comida("Yogurt griego", true));
        comidas2.add(new Comida("Danet", true));
        comidas2.add(new Comida("Uva", false));
        comidas2.add(new Comida("Bisteck", false));

        System.out.println(comidas2.get(3));
        comidas2.set(3, new Comida("Platano", false));
        comidas2.add(3, new Comida("Naranja", false));
        System.out.println("---- Final ----");
        for (Comida comida : comidas2) {
            System.out.println(comida);
        }
    }
}
