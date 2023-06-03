package Herencia;


public class Docente extends Usuario {
  
    private byte antiguedad;
    private String gradoAcademico;

    public Docente() {
        super();
    }

    public Docente(int idUsuario, String nombre, String Apaterno, String Amaterno, byte edad, String departamento,byte antiguedad, String gradoAcademico) {
        super(idUsuario, nombre, Apaterno, Amaterno, edad, departamento);
        this.antiguedad = antiguedad;
        this.gradoAcademico = gradoAcademico;
    }

    public byte getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(byte antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getGradoAcademico() {
        return gradoAcademico;
    }

    public void setGradoAcademico(String gradoAcademico) {
        this.gradoAcademico = gradoAcademico;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nantiguedad: " + antiguedad + "\ngrado academico: " + gradoAcademico;
    }
    
    
}
