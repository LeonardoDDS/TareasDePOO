package Tarea7;

public class Giroscopio {
    private String orientacion;
    private String modelo;
    private String modeloTel;
    private boolean celular;

    public Giroscopio() {
    }

    public Giroscopio(String orientacion, String modelo, String modeloTel, boolean celular) {
        this.orientacion = orientacion;
        this.modelo = modelo;
        this.modeloTel = modeloTel;
        this.celular = celular;
    }

    public String getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(String orientacion) {
        this.orientacion = orientacion;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModeloTel() {
        return modeloTel;
    }

    public void setModeloTel(String modeloTel) {
        this.modeloTel = modeloTel;
    }

    public boolean isCelular() {
        return celular;
    }

    public void setCelular(boolean celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Giroscopio{" +
                "orientacion='" + orientacion + '\'' +
                ", modelo='" + modelo + '\'' +
                ", modeloTel='" + modeloTel + '\'' +
                ", celular=" + celular +
                '}';
    }

    public void onOff(){
        if (celular == true){
            System.out.println("Tu orientacion es: " + orientacion + "\nTu telefono es: "
                    + modeloTel);
        }else {
            System.out.println("Adios");
        }
    }
}
