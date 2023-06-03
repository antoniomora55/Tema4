package Herencia;

import javax.swing.JOptionPane;

public class CuentaCorriente extends CuentaBancaria{
    private float sobregiro=0;

    public CuentaCorriente() {
        super();
    }

 
    public CuentaCorriente(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        
    }
    
    public void retirar(float cantidad){
        if(saldo<0 || saldo<cantidad){
            sobregiro+=(cantidad-saldo);
        }
      else{
                sobregiro=sobregiro;
            }
               
        retiros++;
    }
    public void consignar(float cantidad){
            
             super.consignar(cantidad);
            if(0<cantidad){
                sobregiro=(sobregiro-cantidad); 
                if(sobregiro<0){
                    sobregiro=0;
                }
            }
            else{
                sobregiro=sobregiro;
            }
               

            
                 
          
                  

consignaciones++;
        
    }
    public void extractoMensual(){
        super.extractoMensual();
    }


    
    public void imprimir(){
     JOptionPane.showMessageDialog(null, "Numero de retiros: "+retiros+"\nNumero de depositos: "+consignaciones+"\ntransacciones: "+(consignaciones+retiros)+"\nComision mensual: "+comisionMensual+"\ntasa mensual: "+tasaMensual+"\nsaldo: "+saldo+"\nsobregiro: " + sobregiro);
    }
    //Traer un menu que permita crear cuenta, cuenta corriente y cuenta ahorro, se debe creear objetos
    
    
}
