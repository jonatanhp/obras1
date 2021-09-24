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
public class deduccion_adelanto_directo {
 private int iddad;
 private int idmcr;
 private int idval;
 private int nro_valorizacion;
 private String mes_anio;
 private double monto_metrado;
 private double adelanto;
 private double monto_contrato;
 private double kr;
 private double ka;
 private double deduccion;
 private String mes_anio_deducido;
 private int mes_activo;
 public deduccion_adelanto_directo() {
 }
 public deduccion_adelanto_directo(int iddad, int idmcr, int idval, int
nro_valorizacion, String mes_anio, double monto_metrado, double adelanto,
double monto_contrato, double kr, double ka, double deduccion, String
mes_anio_deducido, int mes_activo) {
 this.iddad = iddad;
 this.idmcr = idmcr;
 this.idval = idval;
 this.nro_valorizacion = nro_valorizacion;
 this.mes_anio = mes_anio;
 this.monto_metrado = monto_metrado;
 this.adelanto = adelanto;
 this.monto_contrato = monto_contrato;

 this.kr = kr;
 this.ka = ka;
 this.deduccion = deduccion;
 this.mes_anio_deducido = mes_anio_deducido;
 this.mes_activo = mes_activo;
 }

 /**
 * @return the idvd
 */
 public int getIddad() {
 return iddad;
 }
 /**
 * @param idvd the idvd to set
 */
 public void setIddad(int idvd) {
 this.iddad = idvd;
 }
 /**
 * @return the idmia
 */
 public int getIdmcr() {
 return idmcr;
 }
 /**
 * @param idmia the idvlp to set
 */
 public void setIdmcr(int idmia) {
 this.idmcr = idmia;
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
 * @return the monto_contrato
 */
 public double getMonCon() {
 return monto_contrato;
 }
 /**
149
 * @param monto_contrato the monto_contrato to set
 */
 public void setMonCon(double monto_contrato) {
 this.monto_contrato = monto_contrato;
 }
 /**
 * @return the kr
 */
 public double getKr() {
 return kr;
 }
 /**
 * @param kr the kr to set
 */
 public void setKr(double kr) {
 this.kr = kr;
 }
 /**
 * @return the ka
 */
 public double getKa() {
 return ka;
 }
 /**
 * @param ka the ka to set
 */
 public void setKa(double ka) {
 this.ka = ka;
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
 * @return the mes_anio_deducido
 */
 public String getMesADed() {
 return mes_anio_deducido;
 }
 /**
 * @param mes_anio_deducido the mes_anio_deducido to set
150
 */
 public void setMesADed(String mes_anio_deducido) {
 this.mes_anio_deducido = mes_anio_deducido;
 }
 public String mostrarDatos() {
 return "" + this.iddad + "\t"
 + this.idmcr + "\t"
 + this.idval + "\t"
 + this.nro_valorizacion + "\t"
 + this.mes_anio + "\t"
 + this.monto_metrado + "\t"
 + this.adelanto + "\t"
 + this.monto_contrato + "\t"
 + this.kr + "\t"
 + this.ka + "\t"
 + this.deduccion + "\t"
 + this.mes_anio_deducido;
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
