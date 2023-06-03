package Herencia;


public class LibroDeTexto extends Libro{
    private String asignatura;

    public LibroDeTexto() {
        super();
    }

   
    public LibroDeTexto(String titulo, String autor, String editorial, float precio,String asignatura) {
        super(titulo, autor, editorial, precio);
        this.asignatura = asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nasignatura: " + asignatura;
    }
    
}
