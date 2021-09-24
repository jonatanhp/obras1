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
import entities.C1_presupuestos;
import data.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class presupuestoData {
 private final String nombreClase = "presupuestoData";
 public int getIdVlpa() {
 String error = null;
 int id = 0;
 conexion dbm = new conexion();
 try {
 Connection con = dbm.getConnection();
 if (con == null) {
 throw new NullPointerException(dbm.getError());
 }
 String sql = "SELECT max(idps) id FROM `c1_presupuesto`";
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
 } catch (Exception e) {
 System.out.println("[" + nombreClase +
"]{dValorizacionListaPartidasActivas}\n" + "Error :" + e.getMessage());
 }

 return id;
 }
 public boolean crear(C1_presupuestos o) {
 String error = null;
 conexion dbm = new conexion();
 try {
 Connection con = dbm.getConnection();
 if (con == null) {
 throw new NullPointerException(dbm.getError());
 }
 //`idps`, null,
 String sql = "INSERT INTO `c1_presupuesto`(`idova`, `idfm`,`idpar`, `descripcion`, `unidad`, `metrado`, `pre_unit`, `presupuesto`,`idpardep`) "
 + "VALUES (" + o.getIdova() + "," + o.getIdfm() + ",'" +
o.getIdpar() + "',?,'" + o.getUnidad() + "'," + o.getMetrado() + "," +
o.getPre_unit() + "," + o.getPresupuesto() + ",'" + o.getIdpardep() + "')";
 System.out.println("" + sql);
 PreparedStatement st = con.prepareStatement(sql, 1005, 1007);
 st.setString(1, o.getDescripcion());
 if (st.execute()) {
 error = "No se puede actualizar datos de la empresa: ";
 }
 st.close();
 con.close();
 dbm = null;
 } catch (Exception e) {
 System.out.println("[" + nombreClase + "]{crear}\n" + error +
e.getMessage());
 }
 return error == null;
 }
 public boolean eliminarIdfm(int idfm) {
 String error = null;
 conexion dbm = new conexion();
 try {
 Connection con = dbm.getConnection();
 if (con == null) {
 throw new NullPointerException(dbm.getError());
 }
 String sql = "DELETE FROM `c1_presupuesto` WHERE idfm=" + idfm;
 System.out.println("" + sql);
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
 public List<C1_presupuestos> listTodoIdovaIdfm(int idova, int idfm) {
 List<C1_presupuestos> lista = new ArrayList<C1_presupuestos>();
 try {
 conexion dbm = new conexion();
 Connection con = dbm.getConnection();
 if (con == null) {
 throw new NullPointerException(dbm.getError());
 }
 String sql = "select * from c1_presupuesto where idova=" + idova
+ " and idfm=" + idfm;
 System.out.println("sql :" + sql);
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
 System.out.println("[" + nombreClase + "]{ListTodoIdovaIdfm}\n"
+ "Error :" + e.getMessage());
 lista = new ArrayList<C1_presupuestos>();
 }
 return lista;
 }
 public int contarIdObraIdFm(int idova, int idfm) {
 int n = 0;
 try {
 conexion dbm = new conexion();
 Connection con = dbm.getConnection();
 if (con == null) {
 throw new NullPointerException(dbm.getError());
 }
 String sql = "select count(idps) total from c1_presupuesto where idova=" + idova + " and idfm=" + idfm;
 System.out.println("query :" + sql);
 Statement st = con.createStatement();
 ResultSet rs = st.executeQuery(sql);
 if (rs.next()) {
 try {
 n = rs.getInt("total");
 } catch (NumberFormatException e) {
 n = 0;
 }
 }
 rs.close();
 st.close();
 con.close();
 dbm = null;
 } catch (NullPointerException | SQLException e) {

 System.out.println("[" + nombreClase + "]{contarIdObraIdFm}\n" +
"Error :" + e.getMessage());
 n = 0;
 }
 return n;
 }
 public double montoPresupuestoIdObraIdfm(int idova, int idfm) {
 double n = 0.0;
 try {
 conexion dbm = new conexion();
 Connection con = dbm.getConnection();
 if (con == null) {
 throw new NullPointerException(dbm.getError());
 }
 String sql = "SELECT SUM(presupuesto) presupuesto FROM`c1_presupuesto` "
 + "WHERE idova=" + idova + " AND idfm =" + idfm + " AND LENGTH(unidad)>0";// + " AND length(idpar)=2";
 System.out.println("query :" + sql);
 Statement st = con.createStatement();
 ResultSet rs = st.executeQuery(sql);
 if (rs.next()) {
 n = rs.getDouble("presupuesto");
 }
 rs.close();
 st.close();
 con.close();
 dbm = null;
 } catch (Exception e) {
 System.out.println("[" + nombreClase +
"]{montoPresupuestoIdObraIdEsp}\n" + "Error :" + e.getMessage());
 }
 return n;
 }
 public double montoAnteriorIdObraIdfm(int idobra, int idfm, int idVal) {
 double n = 0.0;
 try {
 conexion dbm = new conexion();
 Connection con = dbm.getConnection();
 if (con == null) {
 throw new NullPointerException(dbm.getError());
 }
 String sql = "SELECT SUM(v2.anterior_valorizado) anterior FROM`c1_presupuesto` v1 "
 + "INNER JOIN `valorizacion_datos` v2 ON v2.idps=v1.idps"
 + "WHERE v1.idova=" + idobra + " AND v1.idfm=" + idfm +
" and v2.idval=" + idVal + " and LENGTH(v1.unidad)>0";
 System.out.println("query :" + sql);
 Statement st = con.createStatement();
 ResultSet rs = st.executeQuery(sql);
 if (rs.next()) {
 n = rs.getDouble("anterior");
 }
 rs.close();

 st.close();
 con.close();
 dbm = null;
 } catch (Exception e) {
 System.out.println("[" + nombreClase +
"]{montoAnteriorIdObraIdEsp}\n" + "Error :" + e.getMessage());
 }
 return n;
 }
 public double montoPresenteIdObraIdfm(int idobra, int idfm, int idVal) {
 double n = 0.0;
 try {
 conexion dbm = new conexion();
 Connection con = dbm.getConnection();
 if (con == null) {
 throw new NullPointerException(dbm.getError());
 }
 String sql = "SELECT SUM(v2.presente_valorizado) presente FROM `c1_presupuesto` v1 "
 + "INNER JOIN `valorizacion_datos` v2 ON v2.idps=v1.idps"
 + "WHERE v1.idova=" + idobra + " AND v1.idfm=" + idfm +
" and v2.idval=" + idVal + " and LENGTH(v1.unidad)>0";
 System.out.println("query :" + sql);
 Statement st = con.createStatement();
 ResultSet rs = st.executeQuery(sql);
 if (rs.next()) {
 n = rs.getDouble("presente");
 }
 rs.close();
 st.close();
 con.close();
 dbm = null;
 } catch (Exception e) {
 System.out.println("[" + nombreClase +
"]{montoPresenteIdObraIdEsp}\n" + "Error :" + e.getMessage());
 }
 return n;
 }
 public double montoActualIdObraIdfm(int idobra, int idEsp, int idVal) {
 double n = 0.0;
 try {
 conexion dbm = new conexion();
 Connection con = dbm.getConnection();
 if (con == null) {
 throw new NullPointerException(dbm.getError());
 }
 String sql = "SELECT SUM(v2.actual_valorizado) actual FROM`c1_presupuesto` v1 "
         + "INNER JOIN `valorizacion_datos` v2 ON v2.idps=v1.idps"+ "WHERE v1.idova=" + idobra + " AND v1.idfm=" + idEsp +" and v2.idval=" + idVal + " and LENGTH(v1.unidad)>0";
 System.out.println("query :" + sql);
 Statement st = con.createStatement();

 ResultSet rs = st.executeQuery(sql);
 if (rs.next()) {
 n = rs.getDouble("actual");
 }
 rs.close();
 st.close();
 con.close();
 dbm = null;
 } catch (Exception e) {
 System.out.println("[" + nombreClase +
"]{montoActualIdObraIdEsp}\n" + "Error :" + e.getMessage());
 }
 return n;
 }
 public double montoSaldoIdObraIdfm(int idobra, int idfm, int idVal) {
 double n = 0.0;
 try {
 conexion dbm = new conexion();
 Connection con = dbm.getConnection();
 if (con == null) {
 throw new NullPointerException(dbm.getError());
 }
 String sql = "SELECT SUM(v2.saldo_valorizado) saldo FROM`c1_presupuesto` v1 "+ "INNER JOIN `valorizacion_datos` v2 ON v2.idps=v1.idps"
 + "WHERE v1.idova=" + idobra + " AND v1.idfm=" + idfm +
" and v2.idval=" + idVal + " and LENGTH(v1.unidad)>0";
 System.out.println("query :" + sql);
 Statement st = con.createStatement();
 ResultSet rs = st.executeQuery(sql);
 if (rs.next()) {
 n = rs.getDouble("saldo");
 }
 rs.close();
 st.close();
 con.close();
 dbm = null;
 } catch (Exception e) {
 System.out.println("[" + nombreClase +
"]{montoSaldoIdObraIdEsp}\n" + "Error :" + e.getMessage());
 }
 return n;
 }
//*/
 private C1_presupuestos getResult(ResultSet rs) throws SQLException {
 C1_presupuestos p = new C1_presupuestos();
 p.setIdps(rs.getInt("idps"));
 p.setIdova(rs.getInt("idova"));
 p.setIdfm(rs.getInt("idfm"));
 p.setIdpar(rs.getString("idpar"));
 p.setDescripcion(rs.getString("descripcion"));
 p.setUnidad(rs.getString("unidad"));
 p.setMetrado(rs.getDouble("metrado"));
 p.setPre_unit(rs.getDouble("pre_unit"));

 p.setPresupuesto(rs.getDouble("presupuesto"));
 p.setIdpardep(rs.getString("idpardep"));
 return p;
 }
}

