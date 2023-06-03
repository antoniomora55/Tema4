package Herencia;


public class Usuario {
    protected int idUsuario;
    protected String nombre;
    protected String Apaterno;
    protected String Amaterno;
    protected byte edad;
    protected String departamento;

    public Usuario() {
    }

    public Usuario(int idUsuario, String nombre, String Apaterno, String Amaterno, byte edad, String departamento) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.Apaterno = Apaterno;
        this.Amaterno = Amaterno;
        this.edad = edad;
        this.departamento = departamento;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApaterno() {
        return Apaterno;
    }

    public void setApaterno(String Apaterno) {
        this.Apaterno = Apaterno;
    }

    public String getAmaterno() {
        return Amaterno;
    }

    public void setAmaterno(String Amaterno) {
        this.Amaterno = Amaterno;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String generarID(){
        String Apaterno1=  Apaterno.toUpperCase();
       String nombre1= nombre.toUpperCase();
        if(departamento.equalsIgnoreCase("sistemas")){
      
       return Apaterno1.substring(0, 3).concat(nombre1.substring(0, 2));
       
        
        }
        else if(departamento.equalsIgnoreCase("informatica")){
           
       return Apaterno1.substring(0, 3)+"_"+(nombre1.substring(0, 2));
        }
        else{
            System.out.println("Ingrese un departamento valido");
            return null;
        }
    }
    
    @Override
    public String toString() {
        return "idUsuario: " + idUsuario + "\nnombre: " + nombre + "\nApaterno: " + Apaterno + "\nAmaterno: " + Amaterno + "\nedad: " + edad + "\ndepartamento: " + departamento;
    }
    
    
}
//crear objeto de tipo docente y de tipo alumno en una unidad ejecutable y probarlo