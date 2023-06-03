package Herencia;

import javax.swing.JOptionPane;

public class MenuLibro {
      public static void main(String[] args) {
    
        Libro libro=new Libro("ELIBRO", "JOSE. A", "IBERIA", 1000);
        LibroDeTexto librotex=new LibroDeTexto("uso devectores", "JOSE. M", "Amate", 900,"informatica");
     Fecha fecha=new Fecha((byte)29,(byte)05,2023);
        LibroDelTECNM librotec=new LibroDelTECNM("herencia y polimorfismo", "CESAR. C", "SEP", 950, "informatica","TECNM. ORIZABA", fecha);
       LibroNovela novela=new LibroNovela("tin tin","Georges Prosper Remi","Le Petit Vingtième", 700, "aventuras");
        byte opcion = 0;
        byte eleccion = 0;
         do {
            opcion = Byte.parseByte(JOptionPane.showInputDialog("Que libro deseas comprar\n"
                    + "1. Libro normal\n"
                    + "2. Libro de texto\n"
                    + "3. Libro del TECNM\n"
                    + "4. Novela\n"
            +"5. Salir\n"));
        
        switch (opcion) {
            
            case 1:
JOptionPane.showMessageDialog(null, libro.toString());      
break;
            case 2:
                JOptionPane.showMessageDialog(null, librotex.toString());
                break;
            case 3:
                 JOptionPane.showMessageDialog(null, librotec.toString());
                break;
            case 4:
                JOptionPane.showMessageDialog(null, novela.toString());
                break;
            case 5:
                System.exit(0);
                break;
        } 
         } while (eleccion<5);
}}

