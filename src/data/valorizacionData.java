/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author jonatan
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import entities.valorizacion;
import utilitarios.fechas;
import data.conexion;
import java.sql.SQLException;
public class valorizacionData {
 private String nombreClase = "valorizacionData";
 public int getUltimoIdVal() {
 String error = null;
 int id = 0;
 conexion dbm = new conexion();
 try {
 Connection con = dbm.getConnection();
 if (con == null) {
 throw new NullPointerException(dbm.getError());
 }
 String sql = "SELECT max(idval) id FROM `valorizacion`";
 System.out.println("sql:" + sql);

 Statement st = con.createStatement();
 ResultSet rs = st.executeQuery(sql);
 if (rs.next()) {
 try {
 id = rs.getInt("id");
 } catch (NumberFormatException e) {
 System.out.println("Error no hay id max");
 id = 0;
 }
 }
 rs.close();
 st.close();
 con.close();
 dbm = null;
 } catch (NullPointerException | SQLException e) {
 System.out.println("[" + nombreClase + "]{getUltimoIdVal}\n" +
"Error :" + e.getMessage());
 }
 return id;
 }
 public int getUltimoIdValIdobra(int idObra) {
 String error = null;
 int id = 0;
 conexion dbm = new conexion();
 try {
 Connection con = dbm.getConnection();
 if (con == null) {
 throw new NullPointerException(dbm.getError());
 }
 String sql = "SELECT max(idval) id FROM `valorizacion` WHERE idobra=" + idObra;
 System.out.println("sql:" + sql);
 Statement st = con.createStatement();
 ResultSet rs = st.executeQuery(sql);
 if (rs.next()) {
 try {
 id = rs.getInt("id");
 } catch (NumberFormatException e) {
 System.out.println("Error no hay id max");
 id = 0;
 }
 }
 rs.close();
 st.close();
 con.close();
 dbm = null;
 } catch (NullPointerException | SQLException e) {
 System.out.println("[" + nombreClase +
"]{getUltimoIdValIdobra}\n" + "Error :" + e.getMessage());
 id = 0;
 }
 return id;
 }
 public int getPrimerIdVal(int idobra) {

 String error = null;
 int id = 0;
 conexion dbm = new conexion();
 try {
 Connection con = dbm.getConnection();
 if (con == null) {
 throw new NullPointerException(dbm.getError());
 }
 String sql = "SELECT min(idval) id FROM `valorizacion` WHERE idobra=" + idobra + "";
 System.out.println("sql:" + sql);
 Statement st = con.createStatement();
 ResultSet rs = st.executeQuery(sql);
 if (rs.next()) {
 id = rs.getInt("id");
 }
 rs.close();
 st.close();
 con.close();
 dbm = null;
 } catch (NullPointerException | SQLException e) {
 System.out.println("[" + nombreClase + "]{getPrimerIdVal}\n" +
"Error :" + e.getMessage());
 }
 return id;
 }
 public int getTotalVal(int idobra) {
 String error = null;
 int id = 0;
 conexion dbm = new conexion();
 try {
 Connection con = dbm.getConnection();
 if (con == null) {
 throw new NullPointerException(dbm.getError());
 }
 String sql = "SELECT count(idval) nro FROM `valorizacion` WHERE idobra=" + idobra + "";
 System.out.println("sql:" + sql);
 Statement st = con.createStatement();
 ResultSet rs = st.executeQuery(sql);
 if (rs.next()) {
 try {
 id = rs.getInt("nro");
 } catch (NumberFormatException e) {
 System.out.println("Error no hay no hay nada");
 id = 0;
 }
 }
 rs.close();
 st.close();
 con.close();
 dbm = null;
 } catch (NullPointerException | SQLException e) {

 System.out.println("[" + nombreClase + "]{getTotalVal}\n" +
"Error :" + e.getMessage());
 }
 return id;
 }
 public boolean crear(valorizacion o) {
 String error = null;
 conexion dbm = new conexion();
 try {
 Connection con = dbm.getConnection();
 if (con == null) {
 throw new NullPointerException(dbm.getError());
 }
 String sql = "INSERT INTO `valorizacion`( `idobra`, `nro_valorizacion`, `mes_pertenece`, `fecha_registro`,`estado_proceso_1`,`estado_proceso_2`, `estado`) "
 + "VALUES (" + o.getIdobra() + "," +
o.getNroValorizacion() + ",'" + o.getMesPertenece() + "','" +
fechas.formatAMD(o.getFecReg()) + "'," + o.getEstado_proceso_1() + "," +
o.getEstado_proceso_2() + "," + o.getEstado() + ")";
 System.out.println("sql:" + sql);
 PreparedStatement st = con.prepareStatement(sql, 1005, 1007);
 if (st.execute()) {
 error = "No se puede actualizar datos de la empresa: ";
 }
 st.close();
 con.close();
 dbm = null;
 } catch (NullPointerException | SQLException e) {
 System.out.println("[" + nombreClase + "]{crear}\n" + error +
e.getMessage());
 }
 return error == null;
 }
 public boolean modifcarEstadoProceso1(int idval, int estado_proceso_1) {
 String error = null;
 conexion dbm = new conexion();
 try {
 Connection con = dbm.getConnection();
 if (con == null) {
 throw new NullPointerException(dbm.getError());
 }
 String sql = "UPDATE `valorizacion` SET "
 + "`estado_proceso_1`=" + estado_proceso_1 + " "
 + "WHERE `idval`=" + idval;
 System.out.println("sql:" + sql);
 PreparedStatement st = con.prepareStatement(sql, 1005, 1007);
 if (st.execute()) {
 error = "No se puede actualizar datos de la empresa: ";
 }
 st.close();
 con.close();
 dbm = null;

 } catch (NullPointerException | SQLException e) {
 System.out.println("[" + nombreClase +
"]{modifcarEstadoProceso1}\n" + error + e.getMessage());
 }
 return error == null;
 }
 public boolean eliminar(int id) {
 String error = null;
 conexion dbm = new conexion();
 try {
 Connection con = dbm.getConnection();
 if (con == null) {
 throw new NullPointerException(dbm.getError());
 }
 String sql = "DELETE FROM `valorizacion` WHERE `idval`=" + id;
 System.out.println("sql:" + sql);
 PreparedStatement st = con.prepareStatement(sql, 1005, 1007);
 if (st.execute()) {
 error = "No se puede actualizar datos de la empresa: ";
 }
 st.close();
 con.close();
 dbm = null;
 } catch (NullPointerException | SQLException e) {
 System.out.println("[" + nombreClase + "]{eliminar}\n" + error +
e.getMessage());
 }
 return error == null;
 }
 public boolean eliminarIdObra(int id) {
 String error = null;
 conexion dbm = new conexion();
 try {
 Connection con = dbm.getConnection();
 if (con == null) {
 throw new NullPointerException(dbm.getError());
 }
 String sql = "DELETE FROM `valorizacion` WHERE `idobra`=" + id;
 System.out.println("sql:" + sql);
 PreparedStatement st = con.prepareStatement(sql, 1005, 1007);
 if (st.execute()) {
 error = "No se puede actualizar datos de la empresa: ";
 }
 st.close();
 con.close();
 dbm = null;
 } catch (NullPointerException | SQLException e) {
 System.out.println("[" + nombreClase + "]{eliminarIdObra}\n" +
error + e.getMessage());
 }
 return error == null;
 }

 public valorizacion BuscarId(int idval) {
 valorizacion p = null;
 try {
 conexion dbm = new conexion();
 Connection con = dbm.getConnection();
 if (con == null) {
 throw new NullPointerException(dbm.getError());
 }
 String sql = "select * from valorizacion where idval=" + idval;
 System.out.println("sql:" + sql);
 Statement st = con.createStatement();
 ResultSet rs = st.executeQuery(sql);
 if (rs.next()) {
 p = getResult(rs);
 }
 rs.close();
 st.close();
 con.close();
 dbm = null;
 } catch (NullPointerException | SQLException e) {
 System.out.println("[" + nombreClase + "]{BuscarId}\n" + "Error :" + e.getMessage());
 }
 return p;
 }
 public valorizacion BuscarIdovaNro(int idova, int nro) {
 valorizacion p = null;
 try {
 conexion dbm = new conexion();
 Connection con = dbm.getConnection();
 if (con == null) {
 throw new NullPointerException(dbm.getError());
 }
 String sql = "select * from valorizacion where idobra=" + idova
+ " and nro_valorizacion=" + nro;
 System.out.println("sql:" + sql);
 Statement st = con.createStatement();
 ResultSet rs = st.executeQuery(sql);
 if (rs.next()) {
 p = getResult(rs);
 }
 rs.close();
 st.close();
 con.close();
 dbm = null;
 } catch (NullPointerException | SQLException e) {
 System.out.println("[" + nombreClase + "]{BuscarId}\n" + "Error :" + e.getMessage());
 p = null;
 }
 return p;
 }
 public List<valorizacion> ListTodoIdobraASC(int idobra) {
 List<valorizacion> lista = new ArrayList<valorizacion>();
 try {

 conexion dbm = new conexion();
 Connection con = dbm.getConnection();
 if (con == null) {
 throw new NullPointerException(dbm.getError());
 }
 Statement st = con.createStatement();
 String sql = "select * from valorizacion where idobra=" + idobra
+ " order by idval asc";
 System.out.println("sql:" + sql);
 ResultSet rs = st.executeQuery(sql);
 while (rs.next()) {
 lista.add(getResult(rs));
 }
 rs.close();
 st.close();
 con.close();
 dbm = null;
 } catch (NullPointerException | SQLException e) {
 System.out.println("[" + nombreClase + "]{ListTodo}\n" + "Error :" + e.getMessage());
 }
 return lista;
 }
 public List<valorizacion> ListTodoHastaIdvalDeIdobraASC(int idobra, int
idval) {
 List<valorizacion> lista = new ArrayList<valorizacion>();
 try {
 conexion dbm = new conexion();
 Connection con = dbm.getConnection();
 if (con == null) {
 throw new NullPointerException(dbm.getError());
 }
 Statement st = con.createStatement();
 String sql = "select * from valorizacion where idobra=" + idobra
+ " and idval<=" + idval + " order by idval asc";
 System.out.println("sql:" + sql);
 ResultSet rs = st.executeQuery(sql);
 while (rs.next()) {
 lista.add(getResult(rs));
 }
 rs.close();
 st.close();
 con.close();
 dbm = null;
 } catch (NullPointerException | SQLException e) {
 System.out.println("[" + nombreClase + "]{ListTodo}\n" + "Error :" + e.getMessage());
 }
 return lista;
 }
 public valorizacion buscarIdobraASCmenorIdvalLimit(int idobra, int
idval) {//buscar val anterior
 valorizacion p = null;
 try {
 conexion dbm = new conexion();

 Connection con = dbm.getConnection();
 if (con == null) {
 throw new NullPointerException(dbm.getError());
 }
 String sql = "select * from valorizacion where idobra=" + idobra
+ " and idval<" + idval + " order by idval desc limit 1";
 System.out.println("sql:" + sql);
 Statement st = con.createStatement();
 ResultSet rs = st.executeQuery(sql);
 if (rs.next()) {
 p = getResult(rs);
 }
 rs.close();
 st.close();
 con.close();
 dbm = null;
 } catch (NullPointerException | SQLException e) {
 System.out.println("[" + nombreClase +
"]{buscarIdobraASCmenorIdvalLimit}\n" + "Error :" + e.getMessage());
 }
 return p;
 }
 public List<valorizacion> ListTodo(int idobra, int idesp) {//=
 List<valorizacion> lista = new ArrayList<valorizacion>();
 try {
 conexion dbm = new conexion();
 Connection con = dbm.getConnection();
 if (con == null) {
 throw new NullPointerException(dbm.getError());
 }
 String sql = "SELECT v.* FROM `valorizacion` v "
 + "INNER JOIN `valorizacion_lista_partida_tipo` vlpt on vlpt.`idval`=v.`idval` "
 + "WHERE v.`idobra`=" + idobra + " and vlpt.`idesp`=" +
idesp + " order by v.idval desc";
 System.out.println("sql:" + sql);
 Statement st = con.createStatement();
 ResultSet rs = st.executeQuery(sql);
 while (rs.next()) {
 lista.add(getResult(rs));
 }
 rs.close();
 st.close();
 con.close();
 dbm = null;
 } catch (NullPointerException | SQLException e) {
 System.out.println("[" + nombreClase + "]{ListTodo}\n" + "Error:" + e.getMessage());
 }
 return lista;
 }
 private valorizacion getResult(ResultSet rs) throws SQLException {
 valorizacion p = new valorizacion();
 p.setIdval(rs.getInt("idval"));
 p.setIdobra(rs.getInt("idobra"));

 p.setNroValorizacion(rs.getInt("nro_valorizacion"));
 p.setMesPertenece(rs.getString("mes_pertenece"));
 p.setFecReg(rs.getDate("fecha_registro"));
 p.setEstado_proceso_1(rs.getInt("estado_proceso_1"));
 p.setEstado_proceso_2(rs.getInt("estado_proceso_2"));
 p.setEstado(rs.getBoolean("estado"));
 return p;
 }
}

