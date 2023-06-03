/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TDA;

import EntradaSalida.Tools;

/**
 *
 * @author ITO
 */
public class Smartphone {
    private String modelo;
    private int i; //puede que tenga 2 chips
    private Chip chips[ ]; //relación de agregación
    private Bateria bateria;
    
    public Smartphone() {
    }

    public Smartphone(String modelo,int miniAmperios, String marca, String tipoConector) {
        this.modelo=modelo;
        this.bateria=new Bateria(miniAmperios, marca, tipoConector);
        this.chips=new Chip[2];
        this.i=0;
    }



    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

  

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
    
    public void agregarChip(Chip telcel){
       if(i<chips.length-1){
           chips[i]=telcel;
           i++;
       }else{
       Tools.imprimepantalla("Este samrtphone solo admite 2 chips");
       }
    }
    public void agregarBateria(Bateria bateria){
        
    }

    @Override
    public String toString() {
        return "Smartphone{" + "modelo=" + modelo + ", i=" + i + ", chips=" + chips + ", bateria=" + bateria + '}';
    }

    
    
}
