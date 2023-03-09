package Tarea7;

public class Computadora {
    private String marca;
    private String modelo;
    private String sO;
    private String procesador;
    private String nombre;

    public Computadora() {
    }

    public Computadora(String marca, String modelo, String sO, String procesador, String nombre) {
        this.marca = marca;
        this.modelo = modelo;
        this.sO = sO;
        this.procesador = procesador;
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getsO() {
        return sO;
    }

    public void setsO(String sO) {
        this.sO = sO;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", sO='" + sO + '\'' +
                ", procesador='" + procesador + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    public void encender(){
        System.out.println("Iniciando SO " + sO);
        System.out.println("--------------------------");
        System.out.println("Bienvenido : " + nombre);
    }
}
