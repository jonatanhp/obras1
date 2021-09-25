/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author jonatan
 */
import java.util.Date;

public class valorizacion {

    private int idval;
    private int idobra;
    private int nro_valorizacion;
    private String mes_pertenece;
    private Date fecha_registro;
    private int estado_proceso_1;
    private int estado_proceso_2;
    private boolean estado;

    public valorizacion() {
    }

    public valorizacion(int idval, int idobra, int nro_valorizacion, String mes_pertenece, Date fecha_registro, int estado_proceso_1, int estado_proceso_2, boolean estado) {
        this.idval = idval;

        this.idobra = idobra;
        this.nro_valorizacion = nro_valorizacion;
        this.mes_pertenece = mes_pertenece;
        this.fecha_registro = fecha_registro;
        this.estado_proceso_1 = estado_proceso_1;
        this.estado_proceso_2 = estado_proceso_2;
        this.estado = estado;
    }

    public String getNroValAlterado() {
        return (nro_valorizacion < 10 ? "0" + nro_valorizacion : ""
                + nro_valorizacion);
    }

    /**
     * @return the idval
     */
    public int getIdval() {
        return idval;
    }

    /**
     * @param idval the idval to set
     */
    public void setIdval(int idval) {
        this.idval = idval;
    }

    /**
     * @return the idobra
     */
    public int getIdobra() {
        return idobra;
    }

    /**
     * @param idobra the idobra to set
     */
    public void setIdobra(int idobra) {
        this.idobra = idobra;
    }

    /**
     * @return the nro_valorizacion
     */
    public int getNroValorizacion() {
        return nro_valorizacion;
    }

    /**
     * @param nro_valorizacion the nro_valorizacion to set
     */
    public void setNroValorizacion(int nro_valorizacion) {
        this.nro_valorizacion = nro_valorizacion;
    }

    /**
     * 145
     *
     * @return the mes_pertenece
     */
    public String getMesPertenece() {
        return mes_pertenece;
    }

    /**
     * @param mes_pertenece the mes_pertenece to set
     */
    public void setMesPertenece(String mes_pertenece) {
        this.mes_pertenece = mes_pertenece;
    }

    /**
     * @return the estado
     */
    public boolean getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "VALORIZACIÓN Nº " + (getNroValorizacion() < 10 ? "0"
                + getNroValorizacion() : getNroValorizacion()) + " [" + getMesPertenece()
                + "]"; //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the fecha_registro
     */
    public Date getFecReg() {
        return fecha_registro;
    }

    /**
     * @param fecha_registro the fecha_registro to set
     */
    public void setFecReg(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    /**
     * @return the estado_proceso_1
     */
    public int getEstado_proceso_1() {
        return estado_proceso_1;
    }

    /**
     * @param estado_proceso_1 the estado_proceso_1 to set 146
     */
    public void setEstado_proceso_1(int estado_proceso_1) {
        this.estado_proceso_1 = estado_proceso_1;
    }

    /**
     * @return the estado_proceso_2
     */
    public int getEstado_proceso_2() {
        return estado_proceso_2;
    }

    /**
     * @param estado_proceso_2 the estado_proceso_2 to set
     */
    public void setEstado_proceso_2(int estado_proceso_2) {
        this.estado_proceso_2 = estado_proceso_2;
    }
}
