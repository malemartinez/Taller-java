package Series;

public class VideoJuegos implements Entregable {

    private String titulo = "";
    private  int horas = 10;
    private boolean entregado = false;
    private String genero = "";
    private String compania = "";

    public VideoJuegos(String titulo, int horas, String genero, String compañia) {
        this.titulo = titulo;
        this.horas = horas;
        this.genero = genero;
        this.compania = compañia;
    }

    public VideoJuegos(String titulo, int horas) {
        this.titulo = titulo;
        this.horas = horas;
    }
    public VideoJuegos(){

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public String toString() {
        return "VideoJuegos{" +
                "titulo='" + titulo + '\'' +
                ", horas=" + horas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", compania='" + compania + '\'' +
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
        return this.entregado;
    }

    @Override
    public boolean compareTo(Object a) {
        VideoJuegos b = (VideoJuegos) a;
        boolean equal = false;
        if (this.horas > b.getHoras()) {
            equal = true;
        }
        return equal;
    }
}
