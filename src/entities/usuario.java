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
public class usuario {
 private int idu;
 private String nombre_completo;
 private String nick;
 private String clave;
 private int tipo;
 private int estado;
 private int estado2;
 public usuario() {
 }
 public usuario(int idu, String nombre_completo, String nick, String
clave, int tipo, int estado, int estado2) {
 this.idu = idu;
 this.nombre_completo = nombre_completo;
 this.nick = nick;
 this.clave = clave;
 this.tipo = tipo;
 this.estado = estado;
 this.estado2 = estado2;
 }
 /**
 * @return the idu
 */
 public int getIdu() {
 return idu;
 }
 /**
 * @param idu the idu to set
 */
 public void setIdu(int idu) {
 this.idu = idu;
 }

 /**
 * @return the nombre_completo
 */
 public String getNombre_completo() {
 return nombre_completo;
 }
 /**
 * @param nombre_completo the nombre_completo to set
 */
 public void setNombre_completo(String nombre_completo) {
 this.nombre_completo = nombre_completo;
 }
 /**
 * @return the nick
 */
 public String getNick() {
 return nick;
 }
 /**
 * @param nick the nick to set
 */
 public void setNick(String nick) {
 this.nick = nick;
 }
 /**
 * @return the clave
 */
 public String getClave() {
 return clave;
 }
 /**
 * @param clave the clave to set
 */
 public void setClave(String clave) {
 this.clave = clave;
 }
 /**
 * @return the tipo
 */
 public int getTipo() {
 return tipo;
 }
 /**
 * @param tipo the tipo to set
 */
 public void setTipo(int tipo) {
 this.tipo = tipo;
 }
 /**
143
 * @return the estado
 */
 public int getEstado() {
 return estado;
 }
 /**
 * @param estado the estado to set
 */
 public void setEstado(int estado) {
 this.estado = estado;
 }
 /**
 * @return the estado2
 */
 public int getEstado2() {
 return estado2;
 }
 /**
 * @param estado2 the estado2 to set
 */
 public void setEstado2(int estado2) {
 this.estado2 = estado2;
 }


}
