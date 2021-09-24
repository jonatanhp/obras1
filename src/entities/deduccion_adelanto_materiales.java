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
public class deduccion_adelanto_materiales {
 private int iddam;
 private int idmim;
 private int idval;
 private int idpsm;
 private int nro_valorizacion;
 private String mes_anio;
 private double monto_metrado;
 private double coeficiente_incidencia;
 private double indice_mes_base;
 private double indice_mes_adelanto;

 private double indice_mes_reajuste;
 private double adelanto;
 private double monto_maximo_utilizado;
 private double adelanto_deducible;
 private double saldo_adelanto;
 private double deduccion;
 private String mes_anio_pago;
 private int mes_activo;
 public deduccion_adelanto_materiales() {
 }
 public deduccion_adelanto_materiales(int iddam, int idmim, int idval, int
idpsm, int nro_valorizacion, String mes_anio, double monto_metrado, double
coeficiente_incidencia, double indice_mes_base, double indice_mes_adelanto,
double indice_mes_reajuste, double adelanto, double monto_maximo_utilizado,
double adelanto_deducible, double saldo_adelanto, double deduccion, String
mes_anio_pago, int mes_activo) {
 this.iddam = iddam;
 this.idmim = idmim;
 this.idval = idval;
 this.idpsm = idpsm;
 this.nro_valorizacion = nro_valorizacion;
 this.mes_anio = mes_anio;
 this.monto_metrado = monto_metrado;
 this.coeficiente_incidencia = coeficiente_incidencia;
 this.indice_mes_base = indice_mes_base;
 this.indice_mes_adelanto = indice_mes_adelanto;
 this.indice_mes_reajuste = indice_mes_reajuste;
 this.adelanto = adelanto;
 this.monto_maximo_utilizado = monto_maximo_utilizado;
 this.adelanto_deducible = adelanto_deducible;
 this.saldo_adelanto = saldo_adelanto;
 this.deduccion = deduccion;
 this.mes_anio_pago = mes_anio_pago;
 this.mes_activo = mes_activo;
 }
 /**
 * @return the iddam
 */
 public int getIddam() {
 return iddam;
 }
 /**
 * @param iddam the iddam to set
 */
 public void setIddam(int iddam) {
 this.iddam = iddam;
 }
 /**
 * @return the idmim
 */
 public int getIdmim() {
 return idmim;

 }
 /**
 * @param idmim the idvlp to set
 */
 public void setIdmim(int idmim) {
 this.idmim = idmim;
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
 * @return the adelanto
 */
 public double getA() {
 return adelanto;
 }
 /**
 * @param adelanto the adelanto to set
 */
 public void setA(double adelanto) {
 this.adelanto = adelanto;
 }
 /**
 * @return the monto_maximo_utilizado
 */
 public double getMmu() {
 return monto_maximo_utilizado;
 }
 /**
 * @param monto_maximo_utilizado the monto_maximo_utilizado to set
 */
 public void setMmu(double monto_maximo_utilizado) {
 this.monto_maximo_utilizado = monto_maximo_utilizado;
 }
 /**
 * @return the adelanto_deducible
 */
 public double getAdeDed() {
 return adelanto_deducible;
 }
 /**
155
 * @param adelanto_deducible the adelanto_deducible to set
 */
 public void setAdeDed(double adelanto_deducible) {
 this.adelanto_deducible = adelanto_deducible;
 }
 /**
 * @return the saldo_adelanto
 */
 public double getSalAde() {
 return saldo_adelanto;
 }
 /**
 * @param saldo_adelanto the saldo_adelanto to set
 */
 public void setSalAde(double saldo_adelanto) {
 this.saldo_adelanto = saldo_adelanto;
 }
 /**
 * @return the deduccion
 */
 public double getDed() {
 return deduccion;
 }
 /**
 * @param deduccion the deduccion to set
 */
 public void setDed(double deduccion) {
 this.deduccion = deduccion;
 }
 /**
 * @return the mes_anio_pago
 */
 public String getMesPag() {
 return mes_anio_pago;
 }
 /**
 * @param mes_anio_pago the mes_anio_pago to set
 */
 public void setMesPag(String mes_anio_pago) {
 this.mes_anio_pago = mes_anio_pago;
 }
 public String mostrar() {
 return "" + this.iddam + "\t"
 + this.idmim + "\t"
 + this.idval + "\t"
 + this.idpsm + "\t"
 + this.nro_valorizacion + "\t"
 + this.mes_anio + "\t"
 + this.monto_metrado + "\t"
 + this.coeficiente_incidencia + "\t"

 + this.indice_mes_base + "\t"
 + this.indice_mes_adelanto + "\t"
 + this.indice_mes_reajuste + "\t"
 + this.adelanto + "\t"
 + this.monto_maximo_utilizado + "\t"
 + this.adelanto_deducible + "\t"
 + this.saldo_adelanto + "\t"
 + this.deduccion + "\t"
 + this.mes_anio_pago;
 }
 /**
 * @return the mes_activo
 */
 public int getMesActivo() {
 return mes_activo;
 }
 /**
 * @param mes_activo the mes_activo to set
 */
 public void setMesActivo(int mes_activo) {
 this.mes_activo = mes_activo;
 }
}

