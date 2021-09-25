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
import OBJETOS.cValorizacionDatos;
import utilitarios.fechas;
import data.conexion;
import java.sql.SQLException;

public class valorizacionDatosData {

    private final String nombreClase = "valorizacionDatosData";

    public valorizacionDatosData() {
    }

    public boolean crear(cValorizacionDatos o) {
        String error = null;
        conexion dbm = new conexion();
        try {
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            //`idvd`,null,
            String sql = "INSERT INTO `valorizacion_datos`(`idval`,`idps`,`idfm`, `anterior_porcentaje`, `anterior_metrado`, `anterior_valorizado`, `presente_porcentaje`, `presente_metrado`, `presente_valorizado`, `actual_porcentaje`, `actual_metrado`, `actual_valorizado`, `saldo_porcentaje`, `saldo_metrado`,`saldo_valorizado`) "
                    + "VALUES (" + o.getIdval() + "," + o.getIdps() + ","
                    + o.getIdfm() + ","
                    + "" + o.getAnterior_porcentaje() + ","
                    + o.getAnterior_metrado() + "," + o.getAnterior_valorizado() + ","
                    + "" + o.getPresente_porcentaje() + ","
                    + o.getPresente_metrado() + "," + o.getPresente_valorizado() + ","
                    + "" + o.getActual_porcentaje() + ","
                    + o.getActual_metrado() + "," + o.getActual_valorizado() + ","
                    + "" + o.getSaldo_porcentaje() + ","
                    + o.getSaldo_metrado() + "," + o.getSaldo_valorizado() + ")";
            System.out.println("sql:" + sql);
            PreparedStatement st = con.prepareStatement(sql, 1005, 1007);
            if (st.execute()) {
                error = "No se puede actualizar datos de la empresa: ";
            }
            st.close();
            con.close();
            dbm = null;
        } catch (NullPointerException | SQLException e) {
            System.out.println("[" + nombreClase + "]{crear}\n" + error
                    + e.getMessage());
        }
        return error == null;
    }

    public boolean crearEspecial(List<cValorizacionDatos> lsvd) {
        String error = null;
        conexion dbm = new conexion();
        try {
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            //`idvd`,null,
            String sql = textoPlano(lsvd);
            System.out.println("sql:" + sql);
            PreparedStatement st = con.prepareStatement(sql, 1005, 1007);
            if (st.execute()) {
                error = "No se puede actualizar datos de la empresa: ";
            }
            st.close();
            con.close();
            dbm = null;
        } catch (NullPointerException | SQLException e) {
            System.out.println("[" + nombreClase + "]{crearEspecial}\n"
                    + error + e.getMessage());
        }
        return error == null;
    }

    public boolean modificar(cValorizacionDatos o) {
        String error = null;
        conexion dbm = new conexion();
        try {
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            String sql = "UPDATE `valorizacion_datos` SET "
                    + "`presente_porcentaje`=" + o.getPresente_porcentaje()
                    + ",`presente_metrado`=" + o.getPresente_metrado()
                    + ",`presente_valorizado`=" + o.getPresente_valorizado() + ","
                    + "`actual_porcentaje`=" + o.getActual_porcentaje()
                    + ",`actual_metrado`=" + o.getActual_metrado() + ",`actual_valorizado`="
                    + o.getActual_valorizado() + ","
                    + "`saldo_porcentaje`=" + o.getSaldo_porcentaje()
                    + ",`saldo_metrado`=" + o.getSaldo_metrado() + ",`saldo_valorizado`="
                    + o.getSaldo_valorizado() + " "
                    + "WHERE `idvd`=" + o.getIdvd();
            System.out.println("" + sql);
            PreparedStatement st = con.prepareStatement(sql, 1005, 1007);
            if (st.execute()) {
                error = "No se puede actualizar datos de la empresa: ";
            }
            st.close();
            con.close();
            dbm = null;
        } catch (NullPointerException | SQLException e) {
            System.out.println("[" + nombreClase + "]{modificar}\n" + error
                    + e.getMessage());
        }
        return error == null;
    }

    public boolean modificarCampos(String tipoCampoQuery, String idvd) {
        String error = null;
        conexion dbm = new conexion();
        try {
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            String sql = "update valorizacion_datos set " + tipoCampoQuery
                    + " where idvd=" + idvd + "";
            System.out.println("sql:" + sql);
            PreparedStatement st = con.prepareStatement(sql, 1005, 1007);
            if (st.execute()) {
                error = "No se puede actualizar datos de la empresa: ";
            }
            st.close();
            con.close();
            dbm = null;
        } catch (NullPointerException | SQLException e) {
            System.out.println("[" + nombreClase + "]{modificarCampos}\n"
                    + error + e.getMessage());
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
            String sql = "DELETE FROM `valorizacion_datos` WHERE `idvd`="
                    + id;
            System.out.println("sql:" + sql);
            PreparedStatement st = con.prepareStatement(sql, 1005, 1007);
            if (st.execute()) {
                error = "No se puede actualizar datos de la empresa: ";
            }
            st.close();
            con.close();
            dbm = null;
        } catch (NullPointerException | SQLException e) {
            System.out.println("[" + nombreClase + "]{eliminar}\n" + error
                    + e.getMessage());
        }
        return error == null;
    }

    public boolean eliminarIdVal(int id) {
        String error = null;
        conexion dbm = new conexion();
        try {
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            String sql = "DELETE FROM `valorizacion_datos` WHERE `idval`="
                    + id;
            System.out.println("sql:" + sql);
            PreparedStatement st = con.prepareStatement(sql, 1005, 1007);
            if (st.execute()) {
                error = "No se puede actualizar datos de la empresa: ";
            }
            st.close();
            con.close();
            dbm = null;
        } catch (NullPointerException | SQLException e) {
            System.out.println("[" + nombreClase + "]{eliminarIdVal}\n"
                    + error + e.getMessage());
        }
        return error == null;
    }

    public boolean eliminarIdObraDesdeValorizacion(int id) {
        String error = null;
        conexion dbm = new conexion();
        try {
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            String sql = "DELETE FROM valorizacion_datos vd INNER JOIN valorizacion v ON v.idval=vd.idval WHERE v.idobra=" + id;

            System.out.println("" + sql);
            PreparedStatement st = con.prepareStatement(sql, 1005, 1007);
            if (st.execute()) {
                error = "No se puede actualizar datos de la empresa: ";
            }
            st.close();
            con.close();
            dbm = null;
        } catch (NullPointerException | SQLException e) {
            System.out.println("[" + nombreClase
                    + "]{eliminarIdObraDesdeValorizacion}\n" + error + e.getMessage());
        }
        return error == null;
    }

    public boolean eliminarIdObraDesdeValorizacionListaPartidasActivas(int id) {
        String error = null;
        conexion dbm = new conexion();
        try {
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            String sql = "DELETE FROM valorizacion_datos vd INNER JOIN valorizacion_lista_partidas_activas vlpa ON vlpa.idps=vd.idps WHERE vlpa.idobra=" + id;
// System.out.println("" + sql);
            PreparedStatement st = con.prepareStatement(sql, 1005, 1007);
            if (st.execute()) {
                error = "No se puede actualizar datos de la empresa: ";
            }
            st.close();
            con.close();
            dbm = null;
        } catch (NullPointerException | SQLException e) {
            System.out.println("[" + nombreClase
                    + "]{eliminarIdObraDesdeValorizacionListaPartidasActivas}\n" + error
                    + e.getMessage());
        }
        return error == null;
    }

    public cValorizacionDatos buscarId(int id) {
        cValorizacionDatos p = null;
        try {
            conexion dbm = new conexion();
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            String sql = "select * from valorizacion_datos where idvd=" + id;
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
            p = null;
        }
        return p;
    }

    public cValorizacionDatos buscarIdps(int idps) {
        cValorizacionDatos p = null;
        try {
            conexion dbm = new conexion();
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            String sql = "select * from valorizacion_datos where idps="
                    + idps;
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
            System.out.println("[" + nombreClase + "]{BuscarIdps}\n" + "Error :" + e.getMessage());
            p = null;
        }
        return p;
    }

    public cValorizacionDatos buscarIdvalIdpsIdfm(int idval, int idps, int idfm) {
        cValorizacionDatos p = null;
        try {
            conexion dbm = new conexion();
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            String sql = "select * from valorizacion_datos where idval="
                    + idval + " and idps=" + idps + " and idfm=" + idfm;
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
                    + "]{buscarIdvalIdpsIdfm}\n" + "Error :" + e.getMessage());
            p = null;
        }
        return p;
    }

    public int conteoIdvalIdobra(int idval, int idobra) {
        int conteo = 0;
        try {
            conexion dbm = new conexion();
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            Statement st = con.createStatement();
            String sql = "select COUNT(vd.idvd) conteo from valorizacion_datos vd "
                    + "inner join c1_presupuesto vlpa on vlpa.idps=vd.idps "
                    + "where vd.idval=" + idval + " and vlpa.`idova`="
                    + idobra;
            System.out.println("sql:" + sql);
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                try {
                    conteo = rs.getInt("conteo");
                } catch (NumberFormatException e) {
                    conteo = 0;
                }
            }
            rs.close();
            st.close();
            con.close();
            dbm = null;
        } catch (NullPointerException | SQLException e) {
            System.out.println("[" + nombreClase + "]{conteoIdvalIdobra}\n"
                    + "Error :" + e.getMessage());
        }
        return conteo;
    }

    public List<cValorizacionDatos> ListTodoIdvalIdovaIdfm(int idval, int idova, int idfm) {
        List<cValorizacionDatos> lista = new ArrayList<cValorizacionDatos>();
        try {
            conexion dbm = new conexion();
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());

            }
            String sql = "select vd.* from valorizacion_datos vd "
                    + "inner join c1_presupuesto ps on ps.idps=vd.idps "
                    + "where vd.idval=" + idval + " and ps.`idova`=" + idova
                    + " and ps.`idfm`=" + idfm + " order by vd.idvd asc";
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
            System.out.println("[" + nombreClase + "]{ListTodo}\n" + "Error :" + e.getMessage());
            lista = new ArrayList<cValorizacionDatos>();
        }
        return lista;
    }

    public double sumaTotalValorizacionMensual(int idval, int idfm) {
        String error = null;
        double id = 0;
        conexion dbm = new conexion();
        try {
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            String sql = "SELECT SUM(vd.presente_valorizado) suma FROM c1_presupuesto v1 "
                    + "INNER JOIN valorizacion_datos vd ON vd.idps=v1.idps "
                    + "WHERE vd.idval=" + idval + " and v1.idfm=" + idfm + " AND vd.presente_metrado>0";
            System.out.println("sql:" + sql);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                try {
                    id = rs.getDouble("suma");
                } catch (NumberFormatException e) {
                    System.out.println("Error con el presente_valorizado");
                    id = 0.0;
                }
            }
            rs.close();
            st.close();
            con.close();
            dbm = null;
        } catch (NullPointerException | SQLException e) {
            System.out.println("[" + nombreClase
                    + "]{sumaTotalValorizacionMensual}\n" + "Error :" + e.getMessage());
        }
        return id;

    }

    private cValorizacionDatos getResult(ResultSet rs) throws SQLException {
        cValorizacionDatos p = new cValorizacionDatos();
        p.setIdvd(rs.getInt("idvd"));
        p.setIdval(rs.getInt("idval"));
        p.setIdps(rs.getInt("idps"));
        p.setIdfm(rs.getInt("idfm"));
        p.setAnterior_porcentaje(rs.getDouble("anterior_porcentaje"));
        p.setAnterior_metrado(rs.getDouble("anterior_metrado"));
        p.setAnterior_valorizado(rs.getDouble("anterior_valorizado"));
        p.setPresente_porcentaje(rs.getDouble("presente_porcentaje"));
        p.setPresente_metrado(rs.getDouble("presente_metrado"));
        p.setPresente_valorizado(rs.getDouble("presente_valorizado"));
        p.setActual_porcentaje(rs.getDouble("actual_porcentaje"));
        p.setActual_metrado(rs.getDouble("actual_metrado"));
        p.setActual_valorizado(rs.getDouble("actual_valorizado"));
        p.setSaldo_porcentaje(rs.getDouble("saldo_porcentaje"));
        p.setSaldo_metrado(rs.getDouble("saldo_metrado"));
        p.setSaldo_valorizado(rs.getDouble("saldo_valorizado"));
        return p;
    }

    public String textoPlano(List<cValorizacionDatos> ls) {
        String sql = "INSERT INTO `valorizacion_datos`(`idval`,`idps`,`idfm`, `anterior_porcentaje`, `anterior_metrado`, `anterior_valorizado`, `presente_porcentaje`, `presente_metrado`, `presente_valorizado`, `actual_porcentaje`, `actual_metrado`, `actual_valorizado`, `saldo_porcentaje`, `saldo_metrado`, `saldo_valorizado`) ";
        sql += "VALUES ";
        int i = 0;
        for (cValorizacionDatos ovd : ls) {
            if (i < ls.size() - 1) {
                sql += ovd.getTextoPlano();
            } else {
                sql += ovd.getTextoPlano() + ",";
            }
            i++;
        }
        sql += ";";
        return sql;
    }
}
