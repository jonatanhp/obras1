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
public class C1_presupuestos 

{
 private int idps;
 private int idova;
 private int idfm;
 private String idpar;
 private String descripcion;
 private String unidad;
 private double metrado;
 private double pre_unit;
 private double presupuesto;
 private String idpardep;
 public C1_presupuestos() {
 }
 public C1_presupuestos(int idps, int idova, int idfm, String idpar, String
descripcion, String unidad, double metrado, double pre_unit, double
presupuesto, String idpardep) {
 this.idps = idps;
 this.idova = idova;
 this.idfm = idfm;
 this.idpar = idpar;
 this.descripcion = descripcion;
 this.unidad = unidad;
 this.metrado = metrado;
 this.pre_unit = pre_unit;
 this.presupuesto = presupuesto;
 this.idpardep = idpardep;
 }
 /**
 * @return the idps
 */
 public int getIdps() {
 return idps;
 }
 /**
 * @param idps the idps to set
 */
 public void setIdps(int idps) {
 this.idps = idps;
 }
 /**
 * @return the idova
 */
 public int getIdova() {
 return idova;
 }
 /**
 * @param idova the idova to set
 */
 public void setIdova(int idova) {
 this.idova = idova;
 }

 /**
 * @return the idfm
 */
 public int getIdfm() {
 return idfm;
 }
 /**
 * @param idfm the idfm to set
 */
 public void setIdfm(int idfm) {
 this.idfm = idfm;
 }
 /**
 * @return the idpar
 */
 public String getIdpar() {
 return idpar;
 }
 /**
 * @param idpar the idpar to set
 */
 public void setIdpar(String idpar) {
 this.idpar = idpar;
 }
 /**
 * @return the descripcion
 */
 public String getDescripcion() {
 return descripcion;
 }
 /**
 * @param descripcion the descripcion to set
 */
 public void setDescripcion(String descripcion) {
 this.descripcion = descripcion;
 }
 /**
 * @return the unidad
 */
 public String getUnidad() {
 return unidad;
 }
 /**
 * @param unidad the unidad to set
 */
 public void setUnidad(String unidad) {
 this.unidad = unidad;
 }
 /**
138
 * @return the metrado
 */
 public double getMetrado() {
 return metrado;
 }
 /**
 * @param metrado the metrado to set
 */
 public void setMetrado(double metrado) {
 this.metrado = metrado;
 }
 /**
 * @return the pre_unit
 */
 public double getPre_unit() {
 return pre_unit;
 }
 /**
 * @param pre_unit the pre_unit to set
 */
 public void setPre_unit(double pre_unit) {
 this.pre_unit = pre_unit;
 }
 /**
 * @return the presupuesto
 */
 public double getPresupuesto() {
 return presupuesto;
 }
 /**
 * @param presupuesto the presupuesto to set
 */
 public void setPresupuesto(double presupuesto) {
 this.presupuesto = presupuesto;
 }
 /**
 * @return the idpardep
 */
 public String getIdpardep() {
 return idpardep;
 }
 /**
 * @param idpardep the idpardep to set
 */
 public void setIdpardep(String idpardep) {
 this.idpardep = idpardep;
 }
}
