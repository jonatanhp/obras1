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
import OBJETOS.cReajustes;
import utilitarios.fechas;
import data.conexion;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;

public class reajusteData {

    private final String nombreClase = "reajusteData";

    public boolean crear(cReajustes o) {
        String error = null;
        conexion dbm = new conexion();
        try {
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            String sql = "INSERT INTO `reajustes`(`idmrv`, `idval`, `nro`,"
                    + "`mes`, `apm`, `apa`, `aem`, `aea`, `coe_reajuste`, `k_1`, `rpm`, `rpa`, `rem`,"
                    + "`rea`, `estado_obra`, `rrm`, `rra`, `valorizacion_neta`,`mes_activo`) "
                    + "VALUES (" + o.getIdmrv() + "," + o.getIdval() + ","
                    + o.getNro() + ",'" + o.getMes() + "',"
                    + "" + o.getApm() + "," + o.getApa() + "," + o.getAem()
                    + "," + o.getAea() + "," + o.getCoeRea() + ","
                    + "" + o.getK_1() + "," + o.getRpm() + "," + o.getRpa()
                    + "," + o.getRem() + "," + o.getRea() + ","
                    + "'" + o.getEstObra() + "'," + o.getRrm() + ","
                    + o.getRra() + "," + o.getValNeta() + "," + o.getMesActivo() + ")";
            System.out.println("sql:" + sql);
            PreparedStatement st = con.prepareStatement(sql, 1005, 1007);
            if (st.execute()) {
                error = "No se puede actualizar datos de la empresa: ";
            }
            st.close();
            con.close();
            dbm = null;
        } catch (Exception e) {
            System.out.println("[" + nombreClase + "]{crear}\n" + error
                    + e.getMessage());
        }
        return error == null;
    }

    public boolean modificar(cReajustes o) {
        String error = null;
        conexion dbm = new conexion();
        try {
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            String sql = "UPDATE `reajustes` SET `nro`=" + o.getNro()
                    + ",`mes`='" + o.getMes() + "',`apm`=" + o.getApm() + ","
                    + "`apa`=" + o.getApa() + ",`aem`=" + o.getAem()
                    + ",`aea`=" + o.getAea() + ",`coe_reajuste`=" + o.getCoeRea() + ","
                    + "`k_1`=" + o.getK_1() + ",`rpm`=" + o.getRpm()
                    + ",`rpa`=" + o.getRpa() + ",`rem`=" + o.getRem() + ","
                    + "`rea`=" + o.getRea() + ",`estado_obra`='"
                    + o.getEstObra() + "',`rrm`=" + o.getRrm() + ","
                    + "`rra`=" + o.getRra() + ",`valorizacion_neta`="
                    + o.getValNeta() + ",`mes_activo`=" + o.getMesActivo() + " WHERE `idrea`="
                    + o.getIdrea();
            System.out.println("sql:" + sql);
            PreparedStatement st = con.prepareStatement(sql, 1005, 1007);
            if (st.execute()) {
                error = "No se puede actualizar datos de la empresa: ";
            }
            st.close();
            con.close();
            dbm = null;
        } catch (Exception e) {
            System.out.println("[" + nombreClase + "]{modificar}\n" + error
                    + e.getMessage());
        }
        return error == null;
    }

    public boolean modificarApmApa(int idrea, double apm, double apa) {
        String error = null;
        conexion dbm = new conexion();
        try {
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            String sql = "UPDATE `reajustes` SET `apm`=" + apm + ",`apa`="
                    + apa + " WHERE `idrea`=" + idrea;
            System.out.println("sql:" + sql);
            PreparedStatement st = con.prepareStatement(sql, 1005, 1007);
            if (st.execute()) {
                error = "No se puede actualizar datos de la empresa: ";
            }
            st.close();
            con.close();
            dbm = null;
        } catch (Exception e) {
            System.out.println("[" + nombreClase + "]{modificarApmApa}\n"
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
            String sql = "DELETE FROM `reajustes` WHERE `idrea`=" + id;
            PreparedStatement st = con.prepareStatement(sql, 1005, 1007);
            if (st.execute()) {
                error = "No se puede actualizar datos de la empresa: ";
            }
            st.close();
            con.close();
            dbm = null;
        } catch (Exception e) {
            System.out.println("[" + nombreClase + "]{eliminar}\n" + error
                    + e.getMessage());
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
            String sql = "DELETE FROM `reajustes` WHERE `idova`=" + id;
            PreparedStatement st = con.prepareStatement(sql, 1005, 1007);
            if (st.execute()) {
                error = "No se puede actualizar datos de la empresa: ";
            }
            st.close();
            con.close();
            dbm = null;
        } catch (NullPointerException | SQLException e) {
            System.out.println("[" + nombreClase + "]{eliminarIdova}\n"
                    + error + e.getMessage());
        }
        return error == null;
    }

    public cReajustes buscarId(String id) {
        cReajustes p = null;
        try {
            conexion dbm = new conexion();
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from reajustes where idrea=" + id);
            if (rs.next()) {
                p = getResult(rs);
            }
            rs.close();
            st.close();

            con.close();
            dbm = null;
        } catch (NullPointerException | SQLException e) {
            System.out.println("[" + nombreClase + "]{buscarId}\nError :"
                    + e.getMessage());
        }
        return p;
    }

    public cReajustes buscarIdvalOrigenNro(int idfm, int idval_origen, int nro_valorizacion) {
        cReajustes p = null;
        try {
            conexion dbm = new conexion();
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            Statement st = con.createStatement();
            String sql = "select * from reajustes v1 "
                    + "inner join mes_reajuste_valorizado v2 on v2.idmrv=v1.idmrv "
                    + "where v2.idfm=" + idfm + " and v1.idval="
                    + idval_origen + " and v1.nro=" + nro_valorizacion;
            System.out.println("sql:" + sql);
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                p = getResult(rs);
            }
            rs.close();
            st.close();
            con.close();
            dbm = null;
        } catch (NullPointerException | SQLException e) {
            System.out.println("[" + nombreClase + "]{buscarId}\nError :"
                    + e.getMessage());
        }
        return p;
    }

    public cReajustes buscarIdfmIdvaIdvalOrigenlNro(int idfm, int idval, int idval_origen, int nro_valorizacion) {
        cReajustes p = null;
        try {
            conexion dbm = new conexion();
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            Statement st = con.createStatement();
            String sql = "select v1.* from reajustes v1 "
                    + "inner join mes_reajuste_valorizado v2 on v2.idmrv=v1.idmrv "
                    + "where v2.idfm=" + idfm + " and v2.idval=" + idval + " and v2.idval_origen=" + idval_origen + " and v2.nro_valorizacion=" + nro_valorizacion;

            System.out.println("sql:" + sql);
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                p = getResult(rs);
            }
            rs.close();
            st.close();
            con.close();
            dbm = null;
        } catch (NullPointerException | SQLException e) {
            System.out.println("[" + nombreClase + "]{buscarId}\nError :"
                    + e.getMessage());
        }
        return p;
    }

    public int totalEstadoAtrasado(int idval, int idfm) {
        int t = 0;
        try {
            conexion dbm = new conexion();
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            Statement st = con.createStatement();
            String sql = "SELECT COUNT(r.idrea) t FROM `reajustes` r "
                    + "INNER JOIN mes_reajuste_valorizado v1 ON v1.idmrv=r.idmrv "
                    + "WHERE v1.idfm=" + idfm + " AND r.idval<" + idval + " AND r.`estado_obra`='ATRASADA' ";
            System.out.println("sql:" + sql);
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                try {
                    t = rs.getInt("t");
                } catch (NumberFormatException e) {
                    System.out.println("NO HAY ATRAZADOS" + e.getMessage());
                    t = 0;
                }
            }
            rs.close();
            st.close();
            con.close();
            dbm = null;
        } catch (NullPointerException | SQLException e) {
            System.out.println("[" + nombreClase
                    + "]{totalEstadoAtrasado}\nError :" + e.getMessage());
        }
        return t;
    }

    public double sumaRemAnteriores(int idval, int idfm) {
        double t = 0.0;
        try {
            conexion dbm = new conexion();

            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            Statement st = con.createStatement();
            String sql = "SELECT SUM(r.rem) t FROM `reajustes` r "
                    + "INNER JOIN mes_reajuste_valorizado v1 ON v1.idmrv=r.idmrv "
                    + "WHERE v1.idfm=" + idfm + " AND r.idval<=" + idval;
            System.out.println("sql:" + sql);
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                try {
                    t = rs.getDouble("t");
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
                    + "]{sumaRemAnteriores}\nError:" + e.getMessage());
        }
        return t;
    }

    public double montoRRMIdValNro(int idval, int nro) {
        double t = 0;
        try {
            conexion dbm = new conexion();
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            Statement st = con.createStatement();
            String sql = "SELECT SUM(v1.rrm) rrm FROM `reajustes` v1 "
                    + "INNER JOIN `mes_reajuste_valorizado` v2 ON v2.idmrv=v1.idmrv "
                    + "WHERE v2.idval=" + idval + " AND v1.nro=" + nro;
            System.out.println("sql:" + sql);
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                t = rs.getDouble("rrm");
            }
            rs.close();
            st.close();
            con.close();
            dbm = null;
        } catch (Exception e) {
            System.out.println("[" + nombreClase
                    + "]{montoRRMIdValNro}\nError :" + e.getMessage());
        }
        return t;

    }

    public double montoRRAIdValNro(int idval, int nro) {
        double t = 0;
        try {
            conexion dbm = new conexion();
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            Statement st = con.createStatement();
            String sql = "SELECT SUM(v1.rra) rra FROM `reajustes` v1 "
                    + "INNER JOIN `mes_reajuste_valorizado` v2 ON v2.idmrv=v1.idmrv "
                    + "WHERE v2.idval=" + idval + " AND v1.nro=" + nro;
            System.out.println("sql:" + sql);
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                t = rs.getDouble("rra");
            }
            rs.close();
            st.close();
            con.close();
            dbm = null;
        } catch (Exception e) {
            System.out.println("[" + nombreClase
                    + "]{montoRRAIdValNro}\nError :" + e.getMessage());
        }
        return t;
    }

    public List<cReajustes> listarIdValIdfmNro(int idval, int idesp, int nro) {
        List<cReajustes> lista = new ArrayList<cReajustes>();
        try {
            conexion dbm = new conexion();
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM `reajustes` v1 "
                    + "INNER JOIN `mes_reajuste_valorizado` v2 ON v2.idmrv=v1.idmrv "
                    + "WHERE v2.idval=" + idval + " AND v2.idesp=" + idesp
                    + " AND v1.nro=" + nro);
            while (rs.next()) {
                lista.add(getResult(rs));
            }
            rs.close();
            st.close();
            con.close();
            dbm = null;
        } catch (Exception e) {
            System.out.println("[" + nombreClase
                    + "]{buscarIdValIdEspNro}\nError :" + e.getMessage());
        }

        return lista;
    }

    public List<cReajustes> listTodoIdValIdfm(int idval, int idfm) {
        List<cReajustes> lista = new ArrayList<cReajustes>();
        try {
            conexion dbm = new conexion();
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            Statement st = con.createStatement();
            String sql = "SELECT v1.* FROM `reajustes` v1 "
                    + "INNER JOIN `mes_reajuste_valorizado` v2 ON v2.idmrv=v1.idmrv "
                    + "WHERE v2.idval=" + idval + " AND v2.idfm=" + idfm + " "
                    + "order by v1.nro asc";
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
                    + "]{listTodoIdValIdfm}\nError :" + e.getMessage());
            lista = new ArrayList<cReajustes>();
        }
        return lista;
    }

    public List<cReajustes> sumaApmAemPorIdval(int idval) {
        List<cReajustes> lista = new ArrayList<cReajustes>();
        try {
            conexion dbm = new conexion();
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT r.nro,sum(r.apm)montoapm,sum(r.aem) montoaem FROM `reajustes` r "
                    + "INNER JOIN `mes_reajuste_valorizado` v ON v.idmrv=r.idmrv "
                    + "WHERE v.idval=" + idval + " GROUP BY r.nro ORDER BY r.nro ASC");
            while (rs.next()) {
                cReajustes p = new cReajustes();
                p.setNro(rs.getInt("nro"));
                p.setApm(rs.getDouble("montoapm"));
                p.setAem(rs.getDouble("montoaem"));
                lista.add(p);
            }

            rs.close();
            st.close();
            con.close();
            dbm = null;
        } catch (NullPointerException | SQLException e) {
            System.out.println("[" + nombreClase
                    + "]{sumaApmAemPorIdval}\nError :" + e.getMessage());
        }
        return lista;
    }

    private cReajustes getResult(ResultSet rs) throws SQLException {
        cReajustes p = new cReajustes();
        p.setIdrea(rs.getInt("idrea"));
        p.setIdmrv(rs.getInt("idmrv"));
        p.setIdval(rs.getInt("idval"));
        p.setNro(rs.getInt("nro"));
        p.setMes(rs.getString("mes"));
        p.setApm(rs.getDouble("apm"));
        p.setApa(rs.getDouble("apa"));
        p.setAem(rs.getDouble("aem"));
        p.setAea(rs.getDouble("aea"));
        p.setCoeRea(rs.getDouble("coe_reajuste"));
        p.setK_1(rs.getDouble("k_1"));
        p.setRpm(rs.getDouble("rpm"));
        p.setRpa(rs.getDouble("rpa"));
        p.setRem(rs.getDouble("rem"));
        p.setRea(rs.getDouble("rea"));
        p.setEstObra(rs.getString("estado_obra"));
        p.setRrm(rs.getDouble("rrm"));
        p.setRra(rs.getDouble("rra"));
        p.setValNeta(rs.getDouble("valorizacion_neta"));
        p.setMesActivo(rs.getInt("mes_activo"));
        return p;
    }
}
