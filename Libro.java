package Herencia;

public class Libro {
    protected String titulo;
    protected String autor;
    protected String editorial;
    protected float precio;

    public Libro() {
        super();
    }

    public Libro(String titulo, String autor, String editorial, float precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "titulo: " + titulo + "\nautor: " + autor + "\neditorial: " + editorial + "\nprecio: " + precio;
    }


   
}
