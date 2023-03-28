package Tarea8;

import java.util.Scanner;

public class MaquinaCafe {
    //definimos variables
    private int cantidadAgua = 5000;
    private int cantidadCafe = 1000;
    private int cantidadCrema = 1500;
    private int cantidadVasosTermicos = 50;
    //constructor, setters, getters y toString
    public MaquinaCafe() {
    }

    public MaquinaCafe(int cantidadAgua, int cantidadCafe, int cantidadCrema, int cantidadVasosTermicos) {
        this.cantidadAgua = cantidadAgua;
        this.cantidadCafe = cantidadCafe;
        this.cantidadCrema = cantidadCrema;
        this.cantidadVasosTermicos = cantidadVasosTermicos;
    }

    public int getCantidadAgua() {
        return cantidadAgua;
    }

    public void setCantidadAgua(int cantidadAgua) {
        this.cantidadAgua = cantidadAgua;
    }

    public int getCantidadCafe() {
        return cantidadCafe;
    }

    public void setCantidadCafe(int cantidadCafe) {
        this.cantidadCafe = cantidadCafe;
    }

    public int getCantidadCrema() {
        return cantidadCrema;
    }

    public void setCantidadCrema(int cantidadCrema ) {
        this.cantidadCrema = cantidadCrema;
    }

    public int getCantidadVasosTermicos() {
        return cantidadVasosTermicos;
    }

    public void setCantidadVasosTermicos(int cantidadVasosTermicos) {
        this.cantidadVasosTermicos = cantidadVasosTermicos;
    }

    @Override
    public String toString() {
        return "MaquinaCafe\n" +
                "CantidadAgua= " + cantidadAgua + " ml\n" +
                "CantidadCafe= " + cantidadCafe + " g\n" +
                "CantidadCrema= " + cantidadCrema + " ml\n" +
                "CantidadVasosTermicos=" + cantidadVasosTermicos;
    }
    //Da el menu y los casos
    public void pedirCafe() {
        Scanner teclado = new Scanner(System.in);
        int soP;
        do {
            System.out.println("Aqui esta el menu de cafe: \n" + "1. Americano\n" +
                    "2. Expresso\n" + "3. Capuchino");
            int tipo = teclado.nextInt();
            if (tipo >= 1 && tipo <= 3) {
                switch (tipo) {
                    case 1:
                        Americano();
                        break;
                    case 2:
                        Expresso();
                        break;
                    case 3:
                        Capuchino();
                        break;
                }
                System.out.println(toString());
            }
            System.out.println("Si quieres otro café elije la opción 1");
            System.out.println("Si no quieres otro café elije la opción 2");
            soP = teclado.nextInt();
        }while (! (soP != 1)); {
        }
    }
    //Tipo Americano
    public void Americano(){
        if(cantidadAgua <= 5000 && cantidadCafe <= 1000 &&
                cantidadVasosTermicos <= 50){
            this.cantidadAgua -= 180;
            this.cantidadCafe -= 15;
            this.cantidadVasosTermicos --;
            System.out.println("Preparando Americano");
        }else {
            System.out.println("Faltan ingredientes");
        }
    }
    //Tipo Expresso
    public void Expresso(){
        if(cantidadAgua <= 5000 && cantidadCafe <= 1000 &&
                cantidadVasosTermicos <= 50){
            this.cantidadAgua -= 120;
            this.cantidadCafe -= 20;
            this.cantidadVasosTermicos --;
            System.out.println("Preparando Expreso");
        }else {
            System.out.println("Faltan ingredientes");
        }
    }
    //Tipo Capuchino
    public void Capuchino(){
        if(cantidadAgua <= 5000 && cantidadCafe <= 1000 &&
                cantidadVasosTermicos <= 50 && cantidadCrema <= 1500){
            this.cantidadAgua -= 100;
            this.cantidadCafe -= 14;
            this.cantidadCrema -= 70;
            this.cantidadVasosTermicos --;
            System.out.println("Preparando Capuchino");
        }else {
            System.out.println("Faltan ingredientes");
        }
    }
}
