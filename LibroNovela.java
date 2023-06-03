package Herencia;


public class LibroNovela extends Libro{
   private String tipoNovela;
    public LibroNovela() {
        super();
    }

   
    public LibroNovela(String titulo, String autor, String editorial, float precio, String tipoNovela) {
        super(titulo, autor, editorial, precio);
        this.tipoNovela = tipoNovela;
    }

    public String getTipoNovela() {
        return tipoNovela;
    }

    public void setTipoNovela(String tipoNovela) {
        this.tipoNovela = tipoNovela;
    }

    @Override
    public String toString() {
        return super.toString()+"\ntipo de novela: " + tipoNovela ;
    }
   
}
