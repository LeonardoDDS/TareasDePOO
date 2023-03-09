package Tarea7;

public class Pais {
    private String nombreP;
    private int numhabitantes;
    private String continente;

    public Pais() {
    }

    public Pais(String nombreP, int numhabitantes, String continente) {
        this.nombreP = nombreP;
        this.numhabitantes = numhabitantes;
        this.continente = continente;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public int getNumhabitantes() {
        return numhabitantes;
    }

    public void setNumhabitantes(int numhabitantes) {
        this.numhabitantes = numhabitantes;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nombreP='" + nombreP + '\'' +
                ", numhabitantes=" + numhabitantes +
                ", continente='" + continente + '\'' +
                '}';
    }
    public void mostrar(boolean consultar){
        if(consultar == true){
            System.out.println("Nombre del pais: " + nombreP + "\nSu numero de habitantes: "
            + numhabitantes + "\nSu continente es: " + continente);
        }else {
            System.out.println("Consulta algun pais");
            return;
        }
    }
}
