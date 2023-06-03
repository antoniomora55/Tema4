package Herencia;
import javax.swing.JOptionPane;

import javax.swing.*;
import javax.swing.text.AbstractDocument.BranchElement;

import Herencia.CuentaAhorros;
import Herencia.CuentaCorriente;
public class PruebaLibro {
    public static void main(String[] args) throws Exception {
        String menu = "Libro normal,Libro de texto,Libro del TECNM,Novela,Salir";
        menu(menu);
    }
    
    public static String boton(String menu) {
        String valores[]=menu.split(",");
        int n;
        n = JOptionPane.showOptionDialog(null," SELECCIONA UN LIBRO ", "Tienda de libros",
                JOptionPane.NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,null,
                valores,valores[0]);
        return ( valores[n]);
    }
    public static void menu(String menu)
    {
    
        String sel="";
        do {
            sel=boton(menu);
            switch(sel){
                case "Libro normal":
                String libr0 = "ELIBRO,ELOTROLIBRO, SALIR";
                menuCC(libr0);
                break;
                case "Libro de texto":
                String librotext = "Uso de vectores,Gramatica de la lengua española";
                menuCA(librotext);
                break;
                case "Libro del TECNM": 
                    String librote="Herencia y polimorfismo,Archivos";
                    menuCU(librote);
                    break;
                case "Novela":
                    String novel="tin tin,Los pitufos";
                    menuCE(novel);
                    break;
                case "Salir":  break;
            }
        }while(sel.equalsIgnoreCase("Salir"));
    }
    public static void menuCC(String menu)
    {          Libro libro=new Libro("ELIBRO", "JOSE. A", "IBERIA", 1000);
     Libro libro2=new Libro("ELOTROLIBRO", "Juan", "IBERIA", 1200);

        String sel="";
        do {
            sel=boton(menu);
            switch(sel){
                case "ELIBRO":
                    JOptionPane.showMessageDialog(null, libro.toString());
                break;
                case "ELOTROLIBRO":
                    JOptionPane.showMessageDialog(null, libro2.toString());
                break;

                case "Salir":  break;
            }
        }while(sel.equalsIgnoreCase("Salir"));
    }
    public static void menuCA(String menu)
    {         LibroDeTexto librotex=new LibroDeTexto("Uso de vectores", "JOSE. M", "Amate", 900,"informatica");
 LibroDeTexto librotex2=new LibroDeTexto("Gramatica de la lengua española", "Jose luis", "Amate", 800,"informatica");
        String sel="";
        do {
            sel=boton(menu);
            switch(sel){
                case "Uso de vectores":
                    JOptionPane.showMessageDialog(null, librotex.toString());
                break;
                case "Gramatica de la lengua española":
                    JOptionPane.showMessageDialog(null, librotex2.toString());
               break;
                case "Salir":;  
              
                break;
            }
        }while(sel.equalsIgnoreCase("Salir"));
    }
 public static void menuCU(String menu){
      Fecha fecha=new Fecha((byte)29,(byte)05,2023);
        LibroDelTECNM librotec=new LibroDelTECNM("Herencia y polimorfismo", "CESAR. C", "SEP", 950, "informatica","TECNM. ORIZABA", fecha);
      Fecha fecha2=new Fecha((byte)01,(byte)07,2023);
              LibroDelTECNM librotec2=new LibroDelTECNM("Archivos", "Gustavo. C", "SEP", 950, "informatica","TECNM. ORIZABA", fecha2);

        String sel="";
        do {
            sel=boton(menu);
            switch(sel){
                case "Herencia y polimorfismo":
                    JOptionPane.showMessageDialog(null, librotec.toString());
                break;
                case "Archivos":
                    JOptionPane.showMessageDialog(null, librotec2.toString());
               break;
                case "Salir":;  
               
                break;
            }
        }while(sel.equalsIgnoreCase("Salir"));
    }

 public static void menuCE(String menu){
       LibroNovela novela=new LibroNovela("tin tin","Georges Prosper Remi","Le Petit Vingtième", 700, "aventuras");
       LibroNovela novela2=new LibroNovela("Los pitufos","Pierre Culliford","Le Journal de Spirou", 700, "aventuras");

        String sel="";
        do {
            sel=boton(menu);
            switch(sel){
                case "tin tin":
                    JOptionPane.showMessageDialog(null, novela.toString());
                break;
                case "Los pitufos":
                    JOptionPane.showMessageDialog(null, novela2.toString());
               break;
                case "Salir":;  
               
                break;
            }
        }while(sel.equalsIgnoreCase("Salir"));
    }

}
