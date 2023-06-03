package Herencia;
import javax.swing.JOptionPane;
public class CuentaBancaria {
    protected float saldo;
    protected byte consignaciones=0;
    protected byte retiros=0;
    protected float tasaAnual;
    protected float comisionMensual=0;

    public CuentaBancaria() {
        super();
    }

    public CuentaBancaria(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setTasaAnual(float tasaAnual) {
        this.tasaAnual = tasaAnual;
    }

    public float getSaldo() {
        return saldo;
    }

    public byte getConsignaciones() {
        return consignaciones;
    }

    public byte getRetiros() {
        return retiros;
    }

    public float getTasaAnual() {
        return tasaAnual;
    }

    public float getComisionMensual() {
        return comisionMensual;
    }
    
    public void consignar(float cantidad){
        saldo+=cantidad;
        consignaciones++;
    }
    public void retirar(float cantidad){
        if(cantidad<saldo){
        saldo-=cantidad;  
        retiros++;

        }
      else {
            System.out.println("La cantidad a retirar debe ser menor que el saldo");
        }
    }
    float tasaMensual;
    public void calcularInteresMensual(){
       tasaMensual=tasaAnual/12;
     saldo+=saldo*tasaMensual;//Actualiza el saldo aplicando el interes mensual
    }
    public void extractoMensual(){
        saldo-=comisionMensual;
        calcularInteresMensual();
    }




    public void imprimir(){
        JOptionPane.showMessageDialog(null, "saldo: " + saldo + "\nconsignaciones: " + consignaciones + "\nretiros: " + retiros + "\ntasaAnual: " + tasaAnual + "\ncomisionMensual: " +tasaMensual);
    }
    
}
