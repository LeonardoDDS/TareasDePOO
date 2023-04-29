package Tarea10;

public class Motocicleta implements Vehiculo {
    private int centimmetrosCubicos;
    private String marca;

    public Motocicleta() {
    }

    public Motocicleta(int centimmetrosCubicos, String marca) {
        this.centimmetrosCubicos = centimmetrosCubicos;
        this.marca = marca;
    }

    public int getCentimmetrosCubicos() {
        return centimmetrosCubicos;
    }

    public void setCentimmetrosCubicos(int centimmetrosCubicos) {
        this.centimmetrosCubicos = centimmetrosCubicos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "centimmetrosCubicos=" + centimmetrosCubicos +
                ", marca='" + marca + '\'' +
                '}';
    }
    public void hacerCaballito(){
        System.out.println("Haciendo caballito para romperme un hueso");
    }

    @Override
    public boolean encender() {
        System.out.println("Encendiendo la motocicleta " + this.marca);
        return true;
    }

    @Override
    public boolean apagar() {
        System.out.println("Apagando la motocicleta " + this.marca);
        return true;
    }

    @Override
    public void avanzar() {
        System.out.println("Avanzando con la motocicleta de " + this.centimmetrosCubicos + " C.C.");
    }

    @Override
    public void detener() {
        System.out.println("Frenando con la motocicleta de " + this.centimmetrosCubicos + " C.C.");
    }
}
