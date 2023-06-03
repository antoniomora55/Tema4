/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

import javax.swing.JOptionPane;

/**
 *
 * @author CXO Dell
 */
public class CuentaAhorros extends CuentaBancaria{
    private boolean estaActiva;

    public CuentaAhorros() {
        super();
    }

    public CuentaAhorros(float saldo,float tasaAnual){
        super(saldo,tasaAnual);
    }
    public void consignar(float cantidad){
 estaActiva=(saldo<10000)?false:true;
        if(estaActiva)
            super.consignar(cantidad);
    }
   public void retirar(float cantidad){
               estaActiva=(saldo<10000)?false:true;

        if(estaActiva)
            super.retirar(cantidad);
    }
    public void extractoMensual(){
        if(retiros>4)
            comisionMensual+=(retiros-4)*30;
        super.extractoMensual();
        
        if(saldo<10000)estaActiva=false;
    }

   
    
    public void imprimir(){
        JOptionPane.showMessageDialog(null, "saldo: " + saldo + "\nconsignaciones: " + consignaciones + "\nretiros: " + retiros + "\ntransacciones: "+(consignaciones+retiros)+"\ntasaAnual: " + tasaAnual + "\ncomisionMensual: " + comisionMensual + "\nestaActiva: " + estaActiva);


    }
}
