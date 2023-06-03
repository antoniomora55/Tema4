/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntradaSalida;
import javax.swing.JOptionPane;
/**
 *
 * @author CXO Dell
 */
public class Tools {
    public static int leerEntero(String msje)
    {
        return (Integer.parseInt(JOptionPane.showInputDialog(null,msje,"lectura int: ",JOptionPane.INFORMATION_MESSAGE)));
    }
    
    public static void imprimepantalla(String msje)
    {
       JOptionPane.showMessageDialog(null,msje,"salida",JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static byte leerByte (String msje)
    {
       return (Byte.parseByte(JOptionPane.showInputDialog(null,msje,"lectura byte: ",JOptionPane.INFORMATION_MESSAGE)));
    }
        
    public static void imprimeSalida(String msje)
    {
        JOptionPane.showMessageDialog(null,msje,"Salida de datos",JOptionPane.QUESTION_MESSAGE);
    }
    public static void salidaError(String msje)
    {
        JOptionPane.showMessageDialog(null,msje,"",JOptionPane.ERROR_MESSAGE);
    }
    
    public static short leerShort(String msje)
    {
        return (Short.parseShort(JOptionPane.showInputDialog(null,msje,"Dato de entrada",JOptionPane.INFORMATION_MESSAGE)));
    }
    
    public static int leerInt(String msje)
    {
        return (Integer.parseInt(JOptionPane.showInputDialog(null,msje,"Dato de entrada",JOptionPane.INFORMATION_MESSAGE)));
    }
    
    public static double leerdouble(String msje)
    {
        return (Double.parseDouble(JOptionPane.showInputDialog(null,msje,"Dato de entrada",JOptionPane.INFORMATION_MESSAGE)));
    }
    
    public static long leerLong(String msje)
    {
        return (Long.parseLong(JOptionPane.showInputDialog(null,msje,"Dato de entrada",JOptionPane.INFORMATION_MESSAGE)));
    }
    
     public static float leerFloat(String msje)
    {
        return (Float.parseFloat(JOptionPane.showInputDialog(null,msje,"Dato de entrada",JOptionPane.INFORMATION_MESSAGE)));
    }
     
      public static char leerChar(String msje)
    {
        return (JOptionPane.showInputDialog(null,msje,"Dato de entrada",JOptionPane.INFORMATION_MESSAGE).charAt(0));
    }
      
       public static String leerString(String msje)
    {
        return (JOptionPane.showInputDialog(null,msje,"Dato de entrada",JOptionPane.INFORMATION_MESSAGE));
    }
       
        public static int seguirSino(){
       
            return JOptionPane.showConfirmDialog(null,"¿Estas seguro?","continuar",JOptionPane.YES_NO_OPTION);
    }
    
        public static String ImprimeFrecuencia (byte n){
            
            String cad ="";
            for (int i = 1; i < n; i++) {
                cad+="*";
            }
            return cad;
        }
}
