package Tarea7;

import java.awt.*;

public class EjecucionTarea7 {
    public static void main(String[] args) {
        //pruebo la clase balon
        Balon bal1 = new Balon(12.5, "Nike", Color.CYAN);
        System.out.println(bal1);
        //clase computadora
        Computadora compu1 = new Computadora("Lenovo", "IdeaPad 3", "Windows","Core i5", "Leonardo");
        System.out.println("----------------");
        System.out.println(compu1);
        System.out.println("----------------");
        compu1.encender();
        System.out.println("----------------");
        //clase cubo rubik
        CuboDeRubik cubo1 = new CuboDeRubik("3x3", "GAN", "Cube s 365R", "Cuadrada");
        System.out.println(cubo1);
        System.out.println("---------------");
        //clase Gato
        Gato cat1 = new Gato("Siames", 10.67, Color.GRAY, Color.BLUE);
        System.out.println(cat1);
        System.out.println("----------------");
        //clase giroscopio
        Giroscopio gir1 = new Giroscopio("Norte", "mpu6050", "Samsung S20", true);
        System.out.println(gir1);
        System.out.println("----------------");
        gir1.onOff();
        System.out.println("----------------");
        //cuando el celular es falso
        Giroscopio gir2 = new Giroscopio("Norte", "mpu6050", "Samsung S20", false);
        gir2.onOff();
        System.out.println("----------");
        //clase lampara
        Lampara lamp1 = new Lampara("AntorchaMinecraft", "N/A", Color.green, 10.5, true);
        lamp1.onOff();
        System.out.println(lamp1);
        System.out.println("----------");
        //estado flase
        Lampara lamp2 = new Lampara("AntorchaMinecraft", "N/A", Color.green, 10.5, false);
        lamp2.onOff();
        System.out.println(lamp2);
        System.out.println("----------");
        //clase libro
        Libro book1 = new Libro("Paul Auster", "La musica del azar", 318, true);
        book1.consultarLibro();
        System.out.println(book1);
        System.out.println("----------");
        //cuando la consulta es false
        Libro book2 = new Libro("Paul Auster", "La musica del azar", 318, false);
        book2.consultarLibro();
        System.out.println(book2);
        System.out.println("----------");
        //clase pais
        Pais mex = new Pais("Mexico", 12000000, "America");
        mex.mostrar(true);
        System.out.println(mex);
        System.out.println("----------");
        //consultar false
        Pais mex1 = new Pais();
        mex1.mostrar(false);
        System.out.println(mex1);
    }

}
