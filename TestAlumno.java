
package Herencia;
import javax.swing.JOptionPane;

public class TestAlumno {
    public static void main(String[] args) {
                Alumno alu1=new Alumno((int)22222, "jose", "arteaga", "mora", (byte)18, "sistemas",22, 89.00);
        System.out.println(alu1.toString());
        System.out.println(alu1.generarID());
    }

}
