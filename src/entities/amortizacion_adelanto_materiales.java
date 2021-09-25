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
public class amortizacion_adelanto_materiales {

    private int idaam;
    private int idfm;
    private int idval;
    private int idpsm;
    private int nro_valorizacion;
    private String mes_anio;
    private double monto_metrado;
    private double coeficiente_incidencia;
    private double indice_mes_base;
    private double indice_mes_adelanto;
    private double indice_mes_reajuste;
    private double mv_ci;
    private double amortizacion_calculada;
    private double adelanto;
    private double amortizacion_real;
    private double saldo_amortizar;
    private int mes_activo;

    public amortizacion_adelanto_materiales() {
    }

    public amortizacion_adelanto_materiales(int idaam, int idfm, int idval,
            int idpsm, int nro_valorizacion, String mes_anio, double monto_metrado,
            double coeficiente_incidencia, double indice_mes_base, double indice_mes_adelanto, double indice_mes_reajuste, double mv_ci, double amortizacion_calculada, double adelanto, double amortizacion_real, double saldo_amortizar, int mes_activo) {
        this.idaam = idaam;
        this.idfm = idfm;
        this.idval = idval;
        this.idpsm = idpsm;
        this.nro_valorizacion = nro_valorizacion;
        this.mes_anio = mes_anio;
        this.monto_metrado = monto_metrado;
        this.coeficiente_incidencia = coeficiente_incidencia;
        this.indice_mes_base = indice_mes_base;
        this.indice_mes_adelanto = indice_mes_adelanto;
        this.indice_mes_reajuste = indice_mes_reajuste;
        this.mv_ci = mv_ci;
        this.amortizacion_calculada = amortizacion_calculada;
        this.adelanto = adelanto;
        this.amortizacion_real = amortizacion_real;
        this.saldo_amortizar = saldo_amortizar;
        this.mes_activo = mes_activo;
    }

    /**
     * @return the idaam
     */
    public int getIdaam() {
        return idaam;
    }

    /**
     * @param idaam the idaam to set
     */
    public void setIdaam(int idaam) {
        this.idaam = idaam;
    }

    /**
     * @return the idfm
     */
    public int getIdfm() {
        return idfm;
    }

    /**
     * @param idfm the idvlp to set
     */
    public void setIdfm(int idfm) {
        this.idfm = idfm;
    }

    /**
     * @return the idval 162
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
     * @return the idpsm
     */
    public int getIdpsm() {
        return idpsm;
    }

    /**
     * @param idpsm the idvad to set
     */
    public void setIdpsm(int idpsm) {
        this.idpsm = idpsm;
    }

    /**
     * @return the nro_valorizacion
     */
    public int getNroVal() {
        return nro_valorizacion;
    }

    /**
     * @param nro_valorizacion the nro_valorizacion to set
     */
    public void setNroVal(int nro_valorizacion) {
        this.nro_valorizacion = nro_valorizacion;
    }

    /**
     * @return the mes_anio
     */
    public String getMesAnio() {
        return mes_anio;
    }

    /**
     * @param mes_anio the mes_anio to set
     */
    public void setMesAnio(String mes_anio) {
        this.mes_anio = mes_anio;
    }

    /**
     * @return the monto_metrado
     */

    public double getMonMet() {
        return monto_metrado;
    }

    /**
     * @param monto_metrado the monto_metrado to set
     */
    public void setMonMet(double monto_metrado) {
        this.monto_metrado = monto_metrado;
    }

    /**
     * @return the coeficiente_incidencia
     */
    public double getCoeInc() {
        return coeficiente_incidencia;
    }

    /**
     * @param coeficiente_incidencia the coeficiente_incidencia to set
     */
    public void setCoeInc(double coeficiente_incidencia) {
        this.coeficiente_incidencia = coeficiente_incidencia;
    }

    /**
     * @return the indice_mes_base
     */
    public double getImo() {
        return indice_mes_base;
    }

    /**
     * @param indice_mes_base the indice_mes_base to set
     */
    public void setImo(double indice_mes_base) {
        this.indice_mes_base = indice_mes_base;
    }

    /**
     * @return the indice_mes_adelanto
     */
    public double getIma() {
        return indice_mes_adelanto;
    }

    /**
     * @param indice_mes_adelanto the indice_mes_adelanto to set
     */
    public void setIma(double indice_mes_adelanto) {
        this.indice_mes_adelanto = indice_mes_adelanto;
    }

    /**
     * @return the indice_mes_reajuste
     */
    public double getImr() {

        return indice_mes_reajuste;
    }

    /**
     * @param indice_mes_reajuste the indice_mes_reajuste to set
     */
    public void setImr(double indice_mes_reajuste) {
        this.indice_mes_reajuste = indice_mes_reajuste;
    }

    /**
     * @return the mv_ci
     */
    public double getMvCi() {
        return mv_ci;
    }

    /**
     * @param mv_ci the mv_ci to set
     */
    public void setMvCi(double mv_ci) {
        this.mv_ci = mv_ci;
    }

    /**
     * @return the amortizacion_calculada
     */
    public double getAmoCal() {
        return amortizacion_calculada;
    }

    /**
     * @param amortizacion_calculada the amortizacion_calculada to set
     */
    public void setAmoCal(double amortizacion_calculada) {
        this.amortizacion_calculada = amortizacion_calculada;
    }

    /**
     * @return the adelanto
     */
    public double getAde() {
        return adelanto;
    }

    /**
     * @param adelanto the adelanto to set
     */
    public void setAde(double adelanto) {
        this.adelanto = adelanto;
    }

    /**
     * @return the amortizacion_real
     */
    public double getAmoReal() {
        return amortizacion_real;

    }

    /**
     * @param amortizacion_real the amortizacion_real to set
     */
    public void setAmoReal(double amortizacion_real) {
        this.amortizacion_real = amortizacion_real;
    }

    /**
     * @return the saldo_amortizar
     */
    public double getSalAmor() {
        return saldo_amortizar;
    }

    /**
     * @param saldo_amortizar the saldo_amortizar to set
     */
    public void setSalAmor(double saldo_amortizar) {
        this.saldo_amortizar = saldo_amortizar;
    }

    public String mostrar() {
        return "" + this.idaam + "\t"
                + this.idfm + "\t"
                + this.idval + "\t"
                + this.idpsm + "\t"
                + this.nro_valorizacion + "\t"
                + this.mes_anio + "\t"
                + this.monto_metrado + "\t"
                + this.coeficiente_incidencia + "\t"
                + this.indice_mes_base + "\t"
                + this.indice_mes_adelanto + "\t"
                + this.indice_mes_reajuste + "\t"
                + this.mv_ci + "\t"
                + this.amortizacion_calculada + "\t"
                + this.adelanto + "\t"
                + this.amortizacion_real + "\t"
                + this.saldo_amortizar;
    }

    /**
     * @return the mes_activo
     */
    public int getMes_activo() {
        return mes_activo;
    }

    /**
     * @param mes_activo the mes_activo to set
     */
    public void setMes_activo(int mes_activo) {
        this.mes_activo = mes_activo;
    }
}
