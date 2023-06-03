
package Herencia;
import EntradaSalida.Tools;

public class TestDocente {

    public static void main(String[] args) {
        Docente doc1=new Docente((int)2233, "cesar", "cisneros", "cruz", (byte)37, "informatica",(byte)12, "profesional");
        System.out.println(doc1.toString());
        System.out.println(doc1.generarID());
    }
   

}
