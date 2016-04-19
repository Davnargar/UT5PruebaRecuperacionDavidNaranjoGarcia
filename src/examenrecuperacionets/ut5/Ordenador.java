/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenrecuperacionets.ut5;

/**
 *
 * @author 1-DAM-T (2)
 */
public class Ordenador {
    private String cpu;
    private String ram;
    private String resolucionPantalla;

    /**
     * @return the procesador
     */
    public String getCpu() {
        return cpu;
    }

    /**
     * @param cpu the procesador to set
     */
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    /**
     * @return the memoria
     */
    public String getRam() {
        return ram;
    }

    /**
     * @param ram the memoria to set
     */
    public void setRam(String ram) {
        this.ram = ram;
    }

    /**
     * @return the resolucionPantalla
     */
    public String getResolucionPantalla() {
        return resolucionPantalla;
    }

    /**
     * @param resolucionPantalla the resolucionPantalla to set
     */
    public void setResolucionPantalla(String resolucionPantalla) {
        this.resolucionPantalla = resolucionPantalla;
    }
}
