package Tarea10;

public class DriverVehiculo {
    public static void main(String[] args) {
        Camion camion = new Camion("Diesel", 3);
        System.out.println(camion);
        System.out.println(camion.encender());
        camion.avanzar();
        camion.detener();
        System.out.println(camion.apagar());
        System.out.println("----------- moto -----------");
        Motocicleta moto = new Motocicleta(150, "Italika");
        System.out.println(moto);
        moto.encender();
        moto.avanzar();
        moto.hacerCaballito();
        moto.detener();
        moto.apagar();
    }
}
