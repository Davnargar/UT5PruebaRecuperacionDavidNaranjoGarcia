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
    /** parametro privado procesador */
    private String procesador;
    /** parametro privado memoria */
    private String memoria;
    /** parametro privado resolucionPantalla*/
    private String resolucionPantalla;

    /**
     * @return the procesador
     */
    public String getProcesador() {
        return procesador;
    }

    /**
     * @param procesador the procesador to set
     */
    public void setProcesador(String procesador) {
        this.procesador = procesador;
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
