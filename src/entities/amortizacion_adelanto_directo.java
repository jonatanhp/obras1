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
public class amortizacion_adelanto_directo {
 private int idaad;
 private int idfm;
 private int idval;
 private int nro_valorizacion;
 private String mes_anio;
 private double monto_metrado;
 private double amortizacion;
 private double amortizacion_acumulada;
 private double saldo_amortizar;
 private double amortizacion_real;
 private double amortizacion_acumulada_real;
 private int mes_activo ;
 public amortizacion_adelanto_directo() {
 }
 public amortizacion_adelanto_directo(int idaad, int idfm, int idval, int
nro_valorizacion, String mes_anio, double monto_metrado, double amortizacion,
double amortizacion_acumulada, double saldo_amortizar, double
amortizacion_real, double amortizacion_acumulada_real, int mes_activo) {
 this.idaad = idaad;
 this.idfm = idfm;

 this.idval = idval;
 this.nro_valorizacion = nro_valorizacion;
 this.mes_anio = mes_anio;
 this.monto_metrado = monto_metrado;
 this.amortizacion = amortizacion;
 this.amortizacion_acumulada = amortizacion_acumulada;
 this.saldo_amortizar = saldo_amortizar;
 this.amortizacion_real = amortizacion_real;
 this.amortizacion_acumulada_real = amortizacion_acumulada_real;
 this.mes_activo = mes_activo;
 }
 /**
 * @return the idaad
 */
 public int getIdaad() {
 return idaad;
 }
 /**
 * @param idaad the idaad to set
 */
 public void setIdaad(int idaad) {
 this.idaad = idaad;
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
 * @return the nro_valorizacion
158
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
 * @return the amortizacion
 */
 public double getAmor() {
 return amortizacion;
 }
 /**
 * @param amortizacion the amortizacion to set
 */
 public void setAmor(double amortizacion) {
 this.amortizacion = amortizacion;
 }
 /**
 * @return the amortizacion_acumulada
 */

 public double getAmorAcu() {
 return amortizacion_acumulada;
 }
 /**
 * @param amortizacion_acumulada the amortizacion_acumulada to set
 */
 public void setAmorAcu(double amortizacion_acumulada) {
 this.amortizacion_acumulada = amortizacion_acumulada;
 }
 /**
 * @return the saldo_amortizar
 */
 public double getSalAmo() {
 return saldo_amortizar;
 }
 /**
 * @param saldo_amortizar the saldo_amortizar to set
 */
 public void setSalAmor(double saldo_amortizar) {
 this.saldo_amortizar = saldo_amortizar;
 }
 /**
 * @return the amortizacion_real
 */
 public double getAmorReal() {
 return amortizacion_real;
 }
 /**
 * @param amortizacion_real the amortizacion_real to set
 */
 public void setAmorReal(double amortizacion_real) {
 this.amortizacion_real = amortizacion_real;
 }
 /**
 * @return the amortizacion_acumulada_real
 */
 public double getAmorAcuReal() {
 return amortizacion_acumulada_real;
 }
 /**
 * @param amortizacion_acumulada_real the amortizacion_acumulada_real to
set
 */
 public void setAmorAcuReal(double amortizacion_acumulada_real) {
 this.amortizacion_acumulada_real = amortizacion_acumulada_real;
 }
 public String mostrar() {
 return "" + this.idaad + "\t"
 + this.idfm + "\t"

 + this.idval + "\t"
 + this.nro_valorizacion + "\t"
 + this.mes_anio + "\t"
 + this.monto_metrado + "\t"
 + this.amortizacion + "\t"
 + this.amortizacion_acumulada + "\t"
 + this.saldo_amortizar + "\t"
 + this.amortizacion_real + "\t"
 + this.amortizacion_acumulada_real;
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
