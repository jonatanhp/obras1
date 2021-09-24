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
import OBJETOS.cAmortizacionAdelantoMateriales;
import utilitarios.fechas;
import vconexion.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
224
public class dAmortizacionAdelantoMateriales {
 private final String nombreClase = "dAmortizacionAdelantoMateriales";
 public boolean crear(cAmortizacionAdelantoMateriales o) {
 String error = null;
 conexion dbm = new conexion();
 try {
 Connection con = dbm.getConnection();
 if (con == null) {
 throw new NullPointerException(dbm.getError());
 }
 String sql = "INSERT INTO
`amortizacion_adelanto_materiales`(`idfm`, `idval`, `idpsm`,
`nro_valorizacion`, `mes_anio`, `monto_metrado`, `coeficiente_incidencia`,
`indice_mes_base`, `indice_mes_adelanto`, `indice_mes_reajuste`, `mv_ci`,
`amortizacion_calculada`, `adelanto`, `amortizacion_real`,
`saldo_amortizar`, `mes_activo`) "
 + "VALUES (" + o.getIdfm() + "," + o.getIdval() + "," +
o.getIdpsm() + "," + o.getNroVal() + ",'" + o.getMesAnio() + "'," +
o.getMonMet() + "," + o.getCoeInc() + "," + o.getImo() + "," + o.getIma() +
"," + o.getImr() + "," + o.getMvCi() + "," + o.getAmoCal() + "," + o.getAde()
+ "," + o.getAmoReal() + "," + o.getSalAmor() + "," + o.getMes_activo() +
")";
 System.out.println("sql:" + sql);
 PreparedStatement st = con.prepareStatement(sql, 1005, 1007);
 if (st.execute()) {
 error = "No se puede actualizar datos de la empresa: ";
 }
 st.close();
 con.close();
 dbm = null;
 } catch (NullPointerException | SQLException e) {
 System.out.println("[" + nombreClase + "]{crear}\n" + "Error :"
+ e.getMessage());
 }
 return error == null;
 }
 public boolean modificar(cAmortizacionAdelantoMateriales o) {
 String error = null;
 conexion dbm = new conexion();
 try {
 Connection con = dbm.getConnection();
 if (con == null) {
 throw new NullPointerException(dbm.getError());
 }
 String sql = "UPDATE `amortizacion_adelanto_materiales` SET "
 + "`monto_metrado`=" + o.getMonMet() + ","
 + "`coeficiente_incidencia`=" + o.getCoeInc() + ","
 + "`indice_mes_base`=" + o.getImo() + ","
 + "`indice_mes_adelanto`=" + o.getIma() + ","
 + "`indice_mes_reajuste`=" + o.getImr() + ","
 + "`mv_ci`=" + o.getMvCi() + ","
 + "`amortizacion_calculada`=" + o.getAmoCal() + ","
225
 + "`adelanto`=" + o.getAde() + ","
 + "`amortizacion_real`=" + o.getAmoReal() + ","
 + "`saldo_amortizar`=" + o.getSalAmor() + ", "
 + "`mes_activo`=" + o.getMes_activo() + " "
 + "WHERE `idaam`=" + o.getIdaam();
 System.out.println("sql:" + sql);
 PreparedStatement st = con.prepareStatement(sql, 1005, 1007);
 if (st.execute()) {
 error = "No se puede actualizar datos de la empresa: ";
 }
 st.close();
 con.close();
 dbm = null;
 } catch (NullPointerException | SQLException e) {
 System.out.println("[" + nombreClase + "]{modificar}\n" + "Error
:" + e.getMessage());
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
 String sql = "DELETE FROM `amortizacion_adelanto_materiales`
WHERE `idaam`=" + id;
 System.out.println("sql:" + sql);
 PreparedStatement st = con.prepareStatement(sql, 1005, 1007);
 if (st.execute()) {
 error = "No se puede actualizar datos de la empresa: ";
 }
 st.close();
 con.close();
 dbm = null;
 } catch (NullPointerException | SQLException e) {
 System.out.println("[" + nombreClase + "]{eliminar}\n" + "Error
:" + e.getMessage());
 }
 return error == null;
 }
 public boolean eliminarIdova(int id) {
 String error = null;
 conexion dbm = new conexion();
 try {
 Connection con = dbm.getConnection();
 if (con == null) {
 throw new NullPointerException(dbm.getError());
 }
 String sql = "DELETE FROM `amortizacion_adelanto_materiales`
WHERE `idaam`=" + id;
 System.out.println("sql:" + sql);
226
 PreparedStatement st = con.prepareStatement(sql, 1005, 1007);
 if (st.execute()) {
 error = "No se puede actualizar datos de la empresa: ";
 }
 st.close();
 con.close();
 dbm = null;
 } catch (NullPointerException | SQLException e) {
 System.out.println("[" + nombreClase + "]{eliminarIdova}\n" +
"Error :" + e.getMessage());
 }
 return error == null;
 }
 public cAmortizacionAdelantoMateriales buscarId(String id) {
 cAmortizacionAdelantoMateriales p = null;
 try {
 conexion dbm = new conexion();
 Connection con = dbm.getConnection();
 if (con == null) {
 throw new NullPointerException(dbm.getError());
 }
 String sql = "SELECT * FROM `amortizacion_adelanto_materiales`
WHERE `idaam`=" + id;
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
 System.out.println("[" + nombreClase + "]{buscarId}\n" + "Error
:" + e.getMessage());
 }
 return p;
 }
 public cAmortizacionAdelantoMateriales buscarIdvalIdespIdvadNro(int
idval, int idfm, int idpsm, int nro) {
 cAmortizacionAdelantoMateriales p = null;
 try {
 conexion dbm = new conexion();
 Connection con = dbm.getConnection();
 if (con == null) {
 throw new NullPointerException(dbm.getError());
 }
 String sql = "SELECT FROM `amortizacion_adelanto_materiales` "
 + "WHERE idval=" + idval + " AND nro_valorizacion=" + nro
+ " AND idfm=" + idfm + " AND idpsm=" + idpsm;
 System.out.println("sql:" + sql);
 Statement st = con.createStatement();
 ResultSet rs = st.executeQuery(sql);
 if (rs.next()) {
227
 p = getResult(rs);
 }
 rs.close();
 st.close();
 con.close();
 dbm = null;
 } catch (NullPointerException | SQLException e) {
 System.out.println("[" + nombreClase +
"]{buscarIdvalIdespIdvadNro}\n" + "Error :" + e.getMessage());
 }
 return p;
 }
 public double montoAmortizadoAcumuladoIdVal(int idval) {
 double t = 0;
 try {
 conexion dbm = new conexion();
 Connection con = dbm.getConnection();
 if (con == null) {
 throw new NullPointerException(dbm.getError());
 }
 Statement st = con.createStatement();
 String sql = "SELECT SUM(amortizacion_real) suma FROM
`amortizacion_adelanto_materiales` "
 + "WHERE idval=" + idval;
 System.out.println("sql:" + sql);
 ResultSet rs = st.executeQuery(sql);
 if (rs.next()) {
 try {
 t = rs.getDouble("suma");
 } catch (NumberFormatException e) {
 t = 0.0;
 }
 }
 rs.close();
 st.close();
 con.close();
 dbm = null;
 } catch (NullPointerException | SQLException e) {
 System.out.println("[" + nombreClase +
"]{montoAmortizadoAcumuladoIdVal}\n" + "Error :" + e.getMessage());
 }
 return t;
 }
 public List<cAmortizacionAdelantoMateriales> listTodoIdObra(int idObra)
{
 List<cAmortizacionAdelantoMateriales> lista = new
ArrayList<cAmortizacionAdelantoMateriales>();
 try {
 conexion dbm = new conexion();
 Connection con = dbm.getConnection();
 if (con == null) {
 throw new NullPointerException(dbm.getError());
 }
228
 String sql = "select * from amortizacion_adelanto_materiales
where idova=" + idObra + " and estado=1";
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
 System.out.println("[" + nombreClase + "]{listTodoIdObra}\n" +
"Error :" + e.getMessage());
 }
 return lista;
 }
 public List<cAmortizacionAdelantoMateriales> listTodoIdvalIdespIdvad(int
idval, int idfm, int idpsm) {
 List<cAmortizacionAdelantoMateriales> lista = new
ArrayList<cAmortizacionAdelantoMateriales>();
 try {
 conexion dbm = new conexion();
 Connection con = dbm.getConnection();
 if (con == null) {
 throw new NullPointerException(dbm.getError());
 }
 Statement st = con.createStatement();
 String sql = "SELECT * FROM `amortizacion_adelanto_materiales` "
 + "WHERE idval=" + idval + " AND idfm=" + idfm + " AND idpsm=" + idpsm;
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
 System.out.println("[" + nombreClase +
"]{listTodoIdvalIdespIdvad}\n" + "Error :" + e.getMessage());
 }
 return lista;
 }
 public List<cAmortizacionAdelantoMateriales> listTodoIdvalIdvad(int
idval, int idpsm) {
 List<cAmortizacionAdelantoMateriales> lista = new
ArrayList<cAmortizacionAdelantoMateriales>();
 try {
 conexion dbm = new conexion();
 Connection con = dbm.getConnection();
 if (con == null) {

 throw new NullPointerException(dbm.getError());
 }
 Statement st = con.createStatement();
 String sql = "SELECT * FROM `amortizacion_adelanto_materiales` "
 + "WHERE idval=" + idval;
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
 System.out.println("[" + nombreClase + "]{listTodoIdvalIdvad}\n"
+ "Error :" + e.getMessage());
 }
 return lista;
 }
 private cAmortizacionAdelantoMateriales getResult(ResultSet rs) throws
SQLException {
 cAmortizacionAdelantoMateriales p = new
cAmortizacionAdelantoMateriales();
 p.setIdaam(rs.getInt("idaam"));
 p.setIdfm(rs.getInt("idfm"));
 p.setIdval(rs.getInt("idval"));
 p.setIdpsm(rs.getInt("idpsm"));
 p.setNroVal(rs.getInt("nro_valorizacion"));
 p.setMesAnio(rs.getString("mes_anio"));
 p.setMonMet(rs.getDouble("monto_metrado"));
 p.setCoeInc(rs.getDouble("coeficiente_incidencia"));
 p.setImo(rs.getDouble("indice_mes_base"));
 p.setIma(rs.getDouble("indice_mes_adelanto"));
 p.setImr(rs.getDouble("indice_mes_reajuste"));
 p.setMvCi(rs.getDouble("mv_ci"));
 p.setAmoCal(rs.getDouble("amortizacion_calculada"));
 p.setAde(rs.getDouble("adelanto"));
 p.setAmoReal(rs.getDouble("amortizacion_real"));
 p.setSalAmor(rs.getDouble("saldo_amortizar"));
 p.setMes_activo(rs.getInt("mes_activo"));
 return p;
 }
}
