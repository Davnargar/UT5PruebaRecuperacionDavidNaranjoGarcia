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
    private String memoria;
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
    public String getMemoria() {
        return memoria;
    }

    /**
     * @param memoria the memoria to set
     */
    public void setMemoria(String memoria) {
        this.memoria = memoria;
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
