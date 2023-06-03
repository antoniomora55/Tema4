package Herencia;


public class Alumno extends Usuario{
    private int semestre;
    private double promedio;

    public Alumno() {
        super();
    }



    public Alumno(int idUsuario, String nombre, String Apaterno, String Amaterno, byte edad, String departamento,int semestre, double promedio) {
        super(idUsuario, nombre, Apaterno, Amaterno, edad, departamento);
        this.semestre = semestre;
        this.promedio = promedio;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return super.toString()+"\nsemestre: " + semestre + "\npromedio: " + promedio;
    }
    
    
}
