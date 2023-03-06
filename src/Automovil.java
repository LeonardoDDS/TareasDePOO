import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Automovil {
    private String marca;
    private String submarca;
    private byte modelo;
    private Color color;

    public Automovil() {
    }

    public Automovil(String marca, String submarca, byte modelo, Color color) {
        this.marca = marca;
        this.submarca = submarca;
        this.modelo = modelo;
        this.color = color;
    }

    public String getMarca(String m) {
        ArrayList<String> marcas = new ArrayList<>();
        marcas.add("DODGE");
        marcas.add("AUDI");
        marcas.add("NISSAN");
        marcas.add("VMW");
        if (marcas.contains(m.toUpperCase())) {
            this.marca = m;
        }else{
            System.out.println("Esa marca no existe");
        }
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSubmarca() {
        return submarca;
    }

    public void setSubmarca(String submarca) {
        this.submarca = submarca;
    }

    public byte getModelo() {
        return modelo;
    }

    public void setModelo(byte modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "marca='" + marca + '\'' +
                ", submarca='" + submarca + '\'' +
                ", modelo=" + modelo +
                ", color=" + color +
                '}';
    }
}
