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
import entities.deduccion_adelanto_directo;
import utilitarios.fechas;
import data.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class deduccionAdelantoDirectoData {

    private final String nombreClase = "deduccionAdelantoDirectoData";

    public boolean crear(deduccion_adelanto_directo o) {
        String error = null;
        conexion dbm = new conexion();
        try {
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            String sql = "INSERT INTO `deduccion_adelanto_directo`(`idmcr`, `idval`, `nro_valorizacion`, `mes_anio`, `monto_metrado`, `adelanto`,"
                    + "`monto_contrato`, `kr`, `ka`, `deduccion`, `mes_anio_deducido`, `mes_activo`)"
                    + "VALUES (" + o.getIdmcr() + "," + o.getIdval() + ","
                    + o.getNroValorizacion() + ","
                    + "'" + o.getMesAnio() + "'," + o.getMonMet() + ","
                    + o.getAde() + "," + o.getMonCon() + ","
                    + "" + o.getKr() + "," + o.getKa() + "," + o.getDed()
                    + ",'" + o.getMesADed() + "'," + o.getMesActivo() + ")";
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

    public boolean modificar(deduccion_adelanto_directo o) {
        String error = null;
        conexion dbm = new conexion();
        try {
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            String sql = "UPDATE `deduccion_adelanto_directo` SET "
                    + "`monto_metrado`=" + o.getMonMet() + ","
                    + "`adelanto`=" + o.getAde() + ","
                    + "`monto_contrato`=" + o.getMonCon() + ","
                    + "`kr`=" + o.getKr() + ","
                    + "`ka`=" + o.getKa() + ","
                    + "`deduccion`=" + o.getDed() + ","
                    + "`mes_anio_deducido`='" + o.getMesADed() + "',"
                    + "`mes_activo`=" + o.getMesActivo() + " "
                    + "WHERE `iddad`=" + o.getIddad();
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
            String sql = "DELETE FROM `deduccion_adelanto_directo` WHERE `iddad`=" + id;
            PreparedStatement st = con.prepareStatement(sql, 1005, 1007);
            if (st.execute()) {
                error = "No se puede actualizar datos de la empresa: ";
            }
            st.close();
            con.close();
            dbm = null;
        } catch (NullPointerException | SQLException e) {
            System.out.println("[" + nombreClase + "]{eliminar}\n" + "Error :" + e.getMessage());
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
            String sql = "DELETE FROM `deduccion_adelanto_directo` WHERE `idova`=" + id;
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

    public deduccion_adelanto_directo buscarId(String id) {
        deduccion_adelanto_directo p = null;
        try {
            conexion dbm = new conexion();
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM `deduccion_adelanto_directo` WHERE `iddad`=" + id);
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

    public deduccion_adelanto_directo buscarIdvalIdfmNro(int idval, int idfm,
            int nro) {
        deduccion_adelanto_directo p = null;
        try {
            conexion dbm = new conexion();
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT v1.* FROM `deduccion_adelanto_directo` v1 "
                    + "INNER JOIN mes_coeficiente_reajuste v2 ON v2.idmcr=v1.idmcr "
                    + "WHERE v2.idval=" + idval + " AND v2.nro_valorizacion="
                    + nro + " AND v2.idfm=" + idfm);
            if (rs.next()) {
                p = getResult(rs);
            }
            rs.close();
            st.close();
            con.close();
            dbm = null;
        } catch (NullPointerException | SQLException e) {

            System.out.println("[" + nombreClase + "]{buscarIdvalIdfmNro}\n"
                    + "Error :" + e.getMessage());
        }
        return p;
    }

    public double montoDeduccionAcumuladoIdVal(int idval) {
        double t = 0;
        try {
            conexion dbm = new conexion();
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            Statement st = con.createStatement();
            String sql = "SELECT SUM(v1.deduccion) sum_deduccion FROM `deduccion_adelanto_directo` v1 "
                    + "INNER JOIN `mes_coeficiente_reajuste` v2 ON v2.idmcr=v1.idmcr "
                    + "WHERE v2.idval=" + idval;
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                t = rs.getDouble("sum_deduccion");
            }
            rs.close();
            st.close();
            con.close();
            dbm = null;
        } catch (NullPointerException | SQLException e) {
            System.out.println("[" + nombreClase
                    + "]{montoDeduccionAcumuladoIdVal}\n" + "Error :" + e.getMessage());
        }
        return t;
    }

    public List<deduccion_adelanto_directo> listTodoIdObra(int idObra) {
        List<deduccion_adelanto_directo> lista = new ArrayList<deduccion_adelanto_directo>();
        try {
            conexion dbm = new conexion();
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from deduccion_adelanto_directo where idova=" + idObra + " and estado=1");
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

    public List<deduccion_adelanto_directo> listTodoIdvalIdfm(int idval, int idfm) {
        List<deduccion_adelanto_directo> lista = new ArrayList<deduccion_adelanto_directo>();
        try {
            conexion dbm = new conexion();
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            String sql = "SELECT v1.* FROM `deduccion_adelanto_directo` v1 "
                    + "INNER JOIN `mes_coeficiente_reajuste` v2 ON v2.idmcr=v1.idmcr "
                    + "WHERE v2.idval=" + idval + " AND v2.idfm=" + idfm + " order by v2.nro_valorizacion asc";
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
            System.out.println("[" + nombreClase + "]{listTodoIdvalIdfm}\n"
                    + "Error :" + e.getMessage());
        }
        return lista;
    }

    private deduccion_adelanto_directo getResult(ResultSet rs) throws
            SQLException {
        deduccion_adelanto_directo p = new deduccion_adelanto_directo();
        p.setIddad(rs.getInt("iddad"));
        p.setIdmcr(rs.getInt("idmcr"));
        p.setIdval(rs.getInt("idval"));
        p.setNroValorizacion(rs.getInt("nro_valorizacion"));
        p.setMesAnio(rs.getString("mes_anio"));
        p.setMonMet(rs.getDouble("monto_metrado"));
        p.setAde(rs.getDouble("adelanto"));
        p.setMonCon(rs.getDouble("monto_contrato"));
        p.setKr(rs.getDouble("kr"));
        p.setKa(rs.getDouble("ka"));
        p.setDed(rs.getDouble("deduccion"));
        p.setMesADed(rs.getString("mes_anio_deducido"));
        p.setMesActivo(rs.getInt("mes_activo"));
        return p;
    }

    public deduccion_adelanto_directo _mInicializarClase() {

        return new deduccion_adelanto_directo(0, 0, 0, 0, "", 0.0, 0.0, 0.0,
                0.0, 0.0, 0.0, "", 0);
    }
}
