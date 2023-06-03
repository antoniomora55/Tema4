/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TDA;

/**
 *
 * @author ITO
 */
public class Bateria {
    int miniAmperios;
    String marca;
    String tipoConector;
//Mircro USA y USB
    public Bateria() {
    }

    public Bateria(int miniAmperios, String marca, String tipoConector) {
        this.miniAmperios = miniAmperios;
        this.marca = marca;
        this.tipoConector = tipoConector;
    }

    public int getMiniAmperios() {
        return miniAmperios;
    }

    public void setMiniAmperios(int miniAmperios) {
        this.miniAmperios = miniAmperios;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoConector() {
        return tipoConector;
    }

    public void setTipoConector(String tipoConector) {
        this.tipoConector = tipoConector;
    }

    @Override
    public String toString() {
        return "Bateria{" + "miniAmperios=" + miniAmperios + ", marca=" + marca + ", tipoConector=" + tipoConector + '}';
    }
    
}
