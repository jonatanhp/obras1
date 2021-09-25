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
import entities.amortizacion_adelanto_materiales;
import utilitarios.fechas;
import data.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class amortizacionAdelantoMaterialesData {

    private final String nombreClase = "amortizacionAdelantoMaterialesData";

    public boolean crear(amortizacion_adelanto_materiales o) {
        String error = null;
        conexion dbm = new conexion();
        try {
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            String sql = "INSERT INTO `amortizacion_adelanto_materiales`(`idfm`, `idval`, `idpsm`,"
                    + "`nro_valorizacion`, `mes_anio`, `monto_metrado`, `coeficiente_incidencia`,"
                    + "`indice_mes_base`, `indice_mes_adelanto`, `indice_mes_reajuste`, `mv_ci`,"
                    + "`amortizacion_calculada`, `adelanto`, `amortizacion_real`,"
                    + "`saldo_amortizar`, `mes_activo`) "
                    + "VALUES (" + o.getIdfm() + "," + o.getIdval() + ","
                    + o.getIdpsm() + "," + o.getNroVal() + ",'" + o.getMesAnio() + "',"
                    + o.getMonMet() + "," + o.getCoeInc() + "," + o.getImo() + "," + o.getIma()
                    + "," + o.getImr() + "," + o.getMvCi() + "," + o.getAmoCal() + "," + o.getAde()
                    + "," + o.getAmoReal() + "," + o.getSalAmor() + "," + o.getMes_activo()
                    + ")";
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

    public boolean modificar(amortizacion_adelanto_materiales o) {
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
            System.out.println("[" + nombreClase + "]{modificar}\n" + "Error :" + e.getMessage());
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
            String sql = "DELETE FROM `amortizacion_adelanto_materiales` WHERE `idaam`=" + id;
            System.out.println("sql:" + sql);
            PreparedStatement st = con.prepareStatement(sql, 1005, 1007);
            if (st.execute()) {
                error = "No se puede actualizar datos de la empresa: ";
            }
            st.close();
            con.close();
            dbm = null;
        } catch (NullPointerException | SQLException e) {
            System.out.println("[" + nombreClase + "]{eliminar}\n" + "Error:" + e.getMessage());
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
            String sql = "DELETE FROM `amortizacion_adelanto_materiales` WHERE `idaam`=" + id;
            System.out.println("sql:" + sql);

            PreparedStatement st = con.prepareStatement(sql, 1005, 1007);
            if (st.execute()) {
                error = "No se puede actualizar datos de la empresa: ";
            }
            st.close();
            con.close();
            dbm = null;
        } catch (NullPointerException | SQLException e) {
            System.out.println("[" + nombreClase + "]{eliminarIdova}\n"
                    + "Error :" + e.getMessage());
        }
        return error == null;
    }

    public amortizacion_adelanto_materiales buscarId(String id) {
        amortizacion_adelanto_materiales p = null;
        try {
            conexion dbm = new conexion();
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            String sql = "SELECT * FROM `amortizacion_adelanto_materiales` WHERE `idaam`=" + id;
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
            System.out.println("[" + nombreClase + "]{buscarId}\n" + "Error :" + e.getMessage());
        }
        return p;
    }

    public amortizacion_adelanto_materiales buscarIdvalIdespIdvadNro(int idval, int idfm, int idpsm, int nro) {
        amortizacion_adelanto_materiales p = null;
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

                p = getResult(rs);
            }
            rs.close();
            st.close();
            con.close();
            dbm = null;
        } catch (NullPointerException | SQLException e) {
            System.out.println("[" + nombreClase
                    + "]{buscarIdvalIdespIdvadNro}\n" + "Error :" + e.getMessage());
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
            String sql = "SELECT SUM(amortizacion_real) suma FROM `amortizacion_adelanto_materiales` "
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
            System.out.println("[" + nombreClase
                    + "]{montoAmortizadoAcumuladoIdVal}\n" + "Error :" + e.getMessage());
        }
        return t;
    }

    public List<amortizacion_adelanto_materiales> listTodoIdObra(int idObra) {
        List<amortizacion_adelanto_materiales> lista = new ArrayList<amortizacion_adelanto_materiales>();
        try {
            conexion dbm = new conexion();
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }

            String sql = "select * from amortizacion_adelanto_materiales where idova=" + idObra + " and estado=1";
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
            System.out.println("[" + nombreClase + "]{listTodoIdObra}\n"
                    + "Error :" + e.getMessage());
        }
        return lista;
    }

    public List<amortizacion_adelanto_materiales> listTodoIdvalIdespIdvad(int idval, int idfm, int idpsm) {
        List<amortizacion_adelanto_materiales> lista = new ArrayList<amortizacion_adelanto_materiales>();
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
            System.out.println("[" + nombreClase
                    + "]{listTodoIdvalIdespIdvad}\n" + "Error :" + e.getMessage());
        }
        return lista;
    }

    public List<amortizacion_adelanto_materiales> listTodoIdvalIdvad(int idval, int idpsm) {
        List<amortizacion_adelanto_materiales> lista = new ArrayList<amortizacion_adelanto_materiales>();
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

    private amortizacion_adelanto_materiales getResult(ResultSet rs) throws
            SQLException {
        amortizacion_adelanto_materiales p = new amortizacion_adelanto_materiales();
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
