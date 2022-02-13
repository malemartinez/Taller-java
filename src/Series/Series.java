package Series;

public class Series implements Entregable {

    private String titulo = "";
    private  int temporadas = 3;
    private boolean entregado = false;
    private String genero = "";
    private String creador = "";

    public Series(String titulo, int temporadas, String genero, String creador) {
        this.titulo = titulo;
        this.temporadas = temporadas;
        this.genero = genero;
        this.creador = creador;
    }

    public Series(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }
    public Series(){

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Series{" +
                "titulo='" + titulo + '\'' +
                ", temporadas=" + temporadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                '}';
    }

    @Override
    public boolean entregar() {
        return this.entregado = true;
    }

    @Override
    public boolean devolver() {
        return this.entregado = false;
    }

    @Override
    public boolean isEntregable() {
        return  this.entregado;
    }

    @Override
    public boolean compareTo(Object a) {
        return false;
    }
}
