package Tarea7;

public class Libro {
    private String autor;
    private String nomObra;
    private int numpaginas;
    public boolean consultar;
    public Libro() {
    }

    public Libro(String autor, String nomObra, int numpaginas, boolean consultar) {
        this.autor = autor;
        this.nomObra = nomObra;
        this.numpaginas = numpaginas;
        this.consultar = consultar;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNomObra() {
        return nomObra;
    }

    public void setNomObra(String nomObra) {
        this.nomObra = nomObra;
    }

    public int getNumpaginas() {
        return numpaginas;
    }

    public void setNumpaginas(int numpaginas) {
        this.numpaginas = numpaginas;
    }

    public boolean isConsultar() {
        return consultar;
    }

    public void setConsultar(boolean consultar) {
        this.consultar = consultar;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "autor='" + autor + '\'' +
                ", nomObra='" + nomObra + '\'' +
                ", numpaginas=" + numpaginas +
                ", consultar=" + consultar +
                '}';
    }

    public void consultarLibro(){
        if(consultar == true) {
            System.out.println("El autor es: " + autor + "\nEl nombre de la obrea es: "
            + nomObra + "\nNumero de paginas: " + numpaginas);
        }else {
            System.out.println("Consulta un libro");
        }
    }
}
