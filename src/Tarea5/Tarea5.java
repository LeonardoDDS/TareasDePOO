package Tarea5;

import java.util.Scanner;
public class Tarea5 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //Introducir cadena
        System.out.println("Introduce la cadena (X, O, _): ");
        String cadena = teclado.nextLine();

        //validamos la cadena de 9 caracteres y que sean X0_
        if (cadena.length() != 9 || !cadena.matches("[XO_]{9}")) {
            System.out.println("No es de 9 caracteres o contiene algo mas aparte de XO_");
            return;
        }
        //Intento de validación
        /*for (char caracteres : cadena.toCharArray()){
            if (caracteres != 'X' && caracteres != 'O' && caracteres != '_'){
            }else{
                System.out.println("Solo puede tener X, O, _");
            }
            return;
        }*/

        //imprimo la cadena para corroborar
        System.out.println(cadena);

        //Creamos el gato
        String gato = "|" + cadena.charAt(0) + cadena.charAt(1) + cadena.charAt(2) + "|\n";
        gato += "|" + cadena.charAt(3) + cadena.charAt(4) + cadena.charAt(5) + "|\n";
        gato += "|" + cadena.charAt(6) + cadena.charAt(7) + cadena.charAt(8) + "|";
        System.out.println("_____");
        System.out.println(gato);
        System.out.print("-----");
        }
    }

