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
import OBJETOS.cAdelantoDirecto;
import utilitarios.fechas;
import data.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import entities.deduccion_adelanto_materiales;

public class deduccionAdelantoMaterialesData {

    private final String nombreClase = "deduccionAdelantoMaterialesData";

    public boolean crear(deduccion_adelanto_materiales o) {
        String error = null;
        conexion dbm = new conexion();
        try {
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            String sql = "INSERT INTO `deduccion_adelanto_materiales`(`idmim`, `idval`, `idpsm`,"
                    + "`nro_valorizacion`, `mes_anio`, `monto_metrado`, `coeficiente_incidencia`,"
                    + "`indice_mes_base`, `indice_mes_adelanto`, `indice_mes_reajuste`, `adelanto`,"
                    + "`monto_maximo_utilizado`, `adelanto_deducible`, `saldo_adelanto`,"
                    + "`deduccion`, `mes_anio_pago`, `mes_activo`) "
                    + "VALUES (" + o.getIdmim() + "," + o.getIdval() + ","
                    + o.getIdpsm() + "," + o.getNroVal() + ",'" + o.getMesAnio() + "',"
                    + o.getMonMet() + "," + o.getCoeInc() + "," + o.getImo()
                    + "," + o.getIma() + "," + o.getImr() + ","
                    + o.getA() + "," + o.getMmu() + "," + o.getAdeDed() + ","
                    + o.getSalAde() + "," + o.getDed() + ",'" + o.getMesPag() + "',"
                    + o.getMesActivo() + ")";
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

    public boolean modificar(deduccion_adelanto_materiales o) {
        String error = null;
        conexion dbm = new conexion();
        try {
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            String sql = "UPDATE `deduccion_adelanto_materiales` SET "
                    + "`monto_metrado`=" + o.getMonMet() + ","
                    + "`coeficiente_incidencia`=" + o.getCoeInc() + ","
                    + "`indice_mes_base`=" + o.getImo() + ","
                    + "`indice_mes_adelanto`=" + o.getIma() + ","
                    + "`indice_mes_reajuste`=" + o.getImr() + ","
                    + "`adelanto`=" + o.getA() + ","
                    + "`monto_maximo_utilizado`=" + o.getMmu() + ","
                    + "`adelanto_deducible`=" + o.getAdeDed() + ","
                    + "`saldo_adelanto`=" + o.getSalAde() + ","
                    + "`deduccion`=" + o.getDed() + ","
                    + "`mes_anio_pago`='" + o.getMesPag() + "',"
                    + "`mes_activo`=" + o.getMesActivo() + " "
                    + "WHERE `iddam`=" + o.getIddam();
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
            String sql = "DELETE FROM `deduccion_adelanto_materiales` WHERE `iddam`=" + id;
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

    public boolean eliminarIdObra(int idObra) {
        String error = null;
        conexion dbm = new conexion();
        try {
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            String sql = "DELETE FROM deduccion_adelanto_materiales "
                    + "WHERE idk IN(SELECT vk.idk FROM valor_k vk INNER JOIN valor_especialidad ve ON ve.idvesp=vk.idvesp WHERE ve.idobra=" + idObra
                    + ")";
            PreparedStatement st = con.prepareStatement(sql, 1005, 1007);
            if (st.execute()) {
                error = "No se puede actualizar datos de la empresa: ";
            }
            st.close();
            con.close();
            dbm = null;
        } catch (NullPointerException | SQLException e) {
            System.out.println("[" + nombreClase + "]{eliminarIdObra}\n"
                    + "Error :" + e.getMessage());
        }
        return error == null;
    }

    public deduccion_adelanto_materiales buscarId(String id) {
        deduccion_adelanto_materiales p = null;
        try {
            conexion dbm = new conexion();
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM `deduccion_adelanto_materiales` WHERE `idkm`=" + id);
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

    public deduccion_adelanto_materiales buscarIdvalIdespIdvadNro(int idval,
            int idesp, int idvad, int nro) {
        deduccion_adelanto_materiales p = null;
        try {
            conexion dbm = new conexion();
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT v1.* FROM `deduccion_adelanto_materiales` v1 "
                    + "INNER JOIN mes_indice_materiales v2 ON v2.idmim=v1.idmim "
                    + "WHERE v1.idval=" + idval + " AND v1.nro_valorizacion="
                    + nro + " AND v2.idesp=" + idesp + " AND v1.idvad=" + idvad);
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

    public double montoDeduccionAcumuladoIdVal(int idval) {
        double t = 0;
        try {
            conexion dbm = new conexion();
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            Statement st = con.createStatement();
            String sql = "SELECT SUM(v1.deduccion) sum_deduccion FROM `deduccion_adelanto_materiales` v1 "
                    + "INNER JOIN `mes_indice_materiales` v2 ON v2.idmim=v1.idmim "
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

    public int CountRegistros(int idvesp) {
        int pos = 0;
        try {
            conexion dbm = new conexion();
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT count(idkm) contar FROM `valor_k_material` WHERE `idvesp`=" + idvesp + " AND LENGTH(`simbolo`)>0");
            if (rs.next()) {
                pos = rs.getInt("contar");
            }
            rs.close();
            st.close();
            con.close();
            dbm = null;
        } catch (NullPointerException | SQLException e) {
            System.out.println("[" + nombreClase + "]{CountRegistros}\n"
                    + "Error :" + e.getMessage());
        }
        return pos;
    }

    public List<deduccion_adelanto_materiales> listTodo() {
        List<deduccion_adelanto_materiales> lista = new ArrayList<deduccion_adelanto_materiales>();
        try {
            conexion dbm = new conexion();
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from valor_k_material where estado=1");
            while (rs.next()) {
                lista.add(getResult(rs));
            }
            rs.close();
            st.close();
            con.close();
            dbm = null;
        } catch (NullPointerException | SQLException e) {
            System.out.println("[" + nombreClase + "]{listTodo}\n" + "Error :" + e.getMessage());

        }
        return lista;
    }

    public List<deduccion_adelanto_materiales> listTodoIdvesp(int idvesp) {
        List<deduccion_adelanto_materiales> lista = new ArrayList<deduccion_adelanto_materiales>();
        try {
            conexion dbm = new conexion();
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            Statement st = con.createStatement();
            String sql = "select * from valor_k_material where idvesp="
                    + idvesp + " order by correlativo asc";
            System.out.println("" + sql);
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                lista.add(getResult(rs));
            }
            rs.close();
            st.close();
            con.close();
            dbm = null;
        } catch (NullPointerException | SQLException e) {
            System.out.println("[" + nombreClase + "]{listTodoIdvesp}\n"
                    + "Error :" + e.getMessage());
        }
        return lista;
    }

    public List<deduccion_adelanto_materiales> listTodoIdObraIdEsp(int idobra, int idesp) {
        List<deduccion_adelanto_materiales> lista = new ArrayList<deduccion_adelanto_materiales>();
        try {
            conexion dbm = new conexion();
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            Statement st = con.createStatement();
            String sql = "SELECT vkm.* FROM `valor_k_material` vkm "
                    + "INNER JOIN `valor_especialidad` ve on ve.idvesp=vkm.idvesp "
                    + "WHERE ve.idobra=" + idobra + " and ve.idesp=" + idesp
                    + " order by correlativo asc";
            System.out.println("" + sql);
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
                    + "]{listTodoIdObraIdEsp}\n" + "Error :" + e.getMessage());
        }
        return lista;
    }

    public List<deduccion_adelanto_materiales> listTodo(int idVal) {//=por
//observar
        List<deduccion_adelanto_materiales> lista = new ArrayList<deduccion_adelanto_materiales>();
        try {
            conexion dbm = new conexion();
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            String sql = "select e.* from especialidad e "
                    + "inner join mes_indice_materiales v on v.idesp=e.idesp"
                    + "where v.idval=" + idVal;
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
            System.out.println("[" + nombreClase + "]{listTodo}\n" + "Error :" + e.getMessage());
        }
        return lista;
    }

    public List<deduccion_adelanto_materiales> listTodoIdvalIdfm(int idval,
            int idfm, int idpsm) {
        List<deduccion_adelanto_materiales> lista = new ArrayList<deduccion_adelanto_materiales>();
        try {
            conexion dbm = new conexion();
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            String sql = "SELECT v1.* FROM `deduccion_adelanto_materiales` v1 "
                    + "INNER JOIN mes_indice_materiales v2 ON v2.idmim=v1.idmim "
                    + "WHERE v2.idval=" + idval + " AND v2.idfm=" + idfm + " AND v1.idpsm=" + idpsm;
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

    private deduccion_adelanto_materiales getResult(ResultSet rs) throws
            SQLException {
        deduccion_adelanto_materiales p = new deduccion_adelanto_materiales();
        p.setIddam(rs.getInt("iddam"));
        p.setIdmim(rs.getInt("idmim"));
        p.setIdval(rs.getInt("idval"));
        p.setIdpsm(rs.getInt("idpsm"));
        p.setNroVal(rs.getInt("nro_valorizacion"));
        p.setMesAnio(rs.getString("mes_anio"));
        p.setMonMet(rs.getDouble("monto_metrado"));
        p.setCoeInc(rs.getDouble("coeficiente_incidencia"));
        p.setImo(rs.getDouble("indice_mes_base"));
        p.setIma(rs.getDouble("indice_mes_adelanto"));
        p.setImr(rs.getDouble("indice_mes_reajuste"));
        p.setA(rs.getDouble("adelanto"));
        p.setMmu(rs.getDouble("monto_maximo_utilizado"));
        p.setAdeDed(rs.getDouble("adelanto_deducible"));
        p.setSalAde(rs.getDouble("saldo_adelanto"));
        p.setDed(rs.getDouble("deduccion"));
        p.setMesPag(rs.getString("mes_anio_pago"));
        p.setMesActivo(rs.getInt("mes_activo"));
        return p;
    }
}
