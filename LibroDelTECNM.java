package Herencia;

public class LibroDelTECNM extends LibroDeTexto{
    private String campus;
    Fecha fecha;

    public LibroDelTECNM() {
        super();
    }

    public LibroDelTECNM(String titulo, String autor, String editorial, float precio, String asignatura,String campus, Fecha fecha) {
        super(titulo, autor, editorial, precio, asignatura);
        this.campus = campus;
        this.fecha = fecha;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return super.toString()+"\ncampus: " + campus + "\nfecha: " + fecha;
    }
    
}
