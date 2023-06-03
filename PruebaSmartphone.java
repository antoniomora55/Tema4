/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TDA;
import EntradaSalida.Tools;
import EntradaSalida.Tools;
import TDA.Smartphone;
/**
 *
 * @author CXO Dell
 */
public class PruebaSmartphone {
    public static void main(String[] args) {
        Smartphone calPedro=new Smartphone("JPRO",3400,"SAMSUNG","MicroUSB");
        Chip telcel=new Chip("telcel",45678978,"MICRO");
        Chip unefom=new Chip("unfon",45678996,"MICRO");
        Chip rap=new Chip("unfon",4136896,"MICRO");
        calPedro.agregarChip(telcel);
        calPedro.agregarChip(unefom);
       // calPedro.agregarChip(rad);
        Tools.imprimepantalla(""+calPedro.toString());
        
        
        
    }
}
