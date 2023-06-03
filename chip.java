/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TDA;

/**
 *
 * @author ITO
 */
public class Chip {
    private String empresaChip;
    private int numChip;
    private String tipoChip;

    public Chip() {
    }

    public Chip(String empresaChip, int numChip, String tipoChip) {
        this.empresaChip = empresaChip;
        this.numChip = numChip;
        this.tipoChip = tipoChip;
    }

    public String getEmpresaChip() {
        return empresaChip;
    }

    public void setEmpresaChip(String empresaChip) {
        this.empresaChip = empresaChip;
    }

    public int getNumChip() {
        return numChip;
    }

    public void setNumChip(int numChip) {
        this.numChip = numChip;
    }

    public String getTipoChip() {
        return tipoChip;
    }

    public void setTipoChip(String tipoChip) {
        this.tipoChip = tipoChip;
    }

    @Override
    public String toString() {
        return "Chip{" + "empresaChip=" + empresaChip + ", numChip=" + numChip + ", tipoChip=" + tipoChip + '}';
    }
    
    
}
