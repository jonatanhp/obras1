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
public class C1_formulas {
 private int idfm;
 private int idova;
 private int idesp;
 private boolean estadoPre;
 private boolean estadoK;
 private int pos;
 private cEspecialidad oe;
 public C1_formulas() {
 oe = new cEspecialidad();
 }
 public C1_formulas(int idfm, int idova, int idesp, boolean estadoPre,
boolean estadoK, int pos) {
 this.idfm = idfm;
 this.idova = idova;
 this.idesp = idesp;
 this.estadoPre = estadoPre;
 this.estadoK = estadoK;
 this.pos = pos;
 oe = new cEspecialidad();
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
 * @return the idesp
 */
 public int getIdesp() {
 return idesp;
 }
 /**
 * @param idesp the idesp to set
 */
 public void setIdesp(int idesp) {
 this.idesp = idesp;
 }

 /**
 * @return the estadoPre
 */
 public boolean isEstadoPre() {
 return estadoPre;
 }
 /**
 * @param estadoPre the estadoPre to set
 */
 public void setEstadoPre(boolean estadoPre) {
 this.estadoPre = estadoPre;
 }
 /**
 * @return the estadoK
 */
 public boolean isEstadoK() {
 return estadoK;
 }
 /**
 * @param estadoK the estadoK to set
 */
 public void setEstadoK(boolean estadoK) {
 this.estadoK = estadoK;
 }
 /**
 * @return the pos
 */
 public int getPos() {
 return pos;
 }
 /**
 * @param pos the pos to set
 */
 public void setPos(int pos) {
 this.pos = pos;
 }
 /**
 * @return the oe
 */
 public cEspecialidad getOe() {
 return oe;
 }
 /**
 * @param oe the oe to set
 */
 public void setOe(cEspecialidad oe) {
 this.oe = oe;
 }
 /**
141
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
}
