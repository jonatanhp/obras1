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
import entities.obras;
import util.fechas;
import data.conexion;
import java.sql.SQLException;

public class obrasData {

    public static int CON_IGV = 1;
    public static int SIN_IGV = 0;
    public static int CON_ACTUALIZAR_K = 1;
    public static int SIN_ACTUALIZAR_K = 0;
    private final String nombreClase = "obrasData";

    public int getIdMax() {
        String error = null;
        int id = 0;
        conexion dbm = new conexion();
        try {
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            String sql = "SELECT MAX(idova) id FROM `obras`";
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
            System.out.println("Ubicacion del Error[obrasData]:{public int getMaxId()}");
            System.out.println("[" + nombreClase + "]{}\n" + "Error :"
                    + e.getMessage());
        }

        return id;
    }

    public boolean crear(obras o) {
        String error = null;
        conexion dbm = new conexion();
        try {
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            String sql = "INSERT INTO `obras`( `dependiente`,`idu`,`nob`,`ent`, `lug`, `tob`, `sco`, `mej`, `pse`, `idphe`," + " `hec`, `idprv`, `rev`, `idprs`, `res`, `idpsp`,`sup`, `fob`, `fcu`, `con`,`eigv`,"
                    + "`mco`,`mre`,`mcosi`,`mresi`, `mba`, `mad`,`mam`,`pad`, `pam`, `casok`, `dias_contrato`, `ff_amp`, `est`) "
                    + "VALUES (" + o.getDependiente() + "," + o.getIdu()
                    + ",'" + o.getNob() + "','" + o.getEnt() + "','" + o.getLug() + "'," + o.getTob()
                    + "," + o.getSco() + ","
                    + "" + o.getMej() + "," + o.getPse() + "," + o.getIdphe()
                    + ",'" + o.getHec() + "'," + o.getIdprv() + ",'" + o.getRev() + "',"
                    + "" + o.getIdprs() + ",'" + o.getRes() + "',"
                    + o.getIdpsp() + ",'" + o.getSup() + "','" + fechas.formatAMD(o.getFob())
                    + "','" + fechas.formatAMD(o.getFcu()) + "','"
                    + o.getCon() + "'," + o.getEigv() + "," + o.getMco()
                    + "," + o.getMre() + "," + o.getMcosi() + "," + o.getMresi() + ",'"
                    + fechas.formatAMD(o.getMba()) + "','"
                    + fechas.formatAMD(o.getMad()) + "','" + fechas.formatAMD(o.getMam()) + "',"
                    + o.getPad() + "," + o.getPam() + "," + o.getCasok()
                    + "," + o.getDiasContrato() + ",'" + fechas.formatAMD(o.getFfAmp()) + "',"
                    + o.getEst() + ")";
            System.out.println("obrasData->crear:" + sql);
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

    public boolean modificar(obras o) {
        String error = null;
        conexion dbm = new conexion();
        try {
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());

            }
            String sql = "UPDATE `obras` SET `nob`='" + o.getNob()
                    + "',`ent`='" + o.getEnt() + "',`lug`='" + o.getLug() + "',"
                    + "`tob`=" + o.getTob() + ",`sco`=" + o.getSco()
                    + ",`mej`=" + o.getMej() + ",`pse`=" + o.getPse() + ",`idphe`=" + o.getIdphe()
                    + ","
                    + "`hec`='" + o.getHec() + "',`idprv`=" + o.getIdprv()
                    + ",`rev`='" + o.getRev() + "',`idprs`=" + o.getIdprs() + ",`res`='"
                    + o.getRes() + "',"
                    + "`idpsp`=" + o.getIdpsp() + ",`sup`='" + o.getSup()
                    + "',`fob`='" + fechas.formatAMD(o.getFob()) + "',`fcu`='"
                    + fechas.formatAMD(o.getFcu()) + "',`con`='" + o.getCon() + "',"
                    + "`mco`=" + o.getMco() + ",`eigv`=" + o.getEigv()
                    + ",`mre`=" + o.getMre() + ",`mcosi`=" + o.getMcosi() + ",`mresi`="
                    + o.getMresi() + ",`mba`='" + fechas.formatAMD(o.getMba()) + "',"
                    + "`mad`='" + fechas.formatAMD(o.getMad()) + "',`mam`='"
                    + fechas.formatAMD(o.getMam()) + "',`est`=" + o.getEst() + " ,`pad`="
                    + o.getPad() + ",`pam`=" + o.getPam() + ",`dias_contrato`="
                    + o.getDiasContrato() + ",`ff_amp`='" + fechas.formatAMD(o.getFfAmp()) + "' "
                    + "WHERE `idova`=" + o.getIdova();
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

    public boolean modificarCasoK(int idobra, int casoK) {
        String error = null;
        conexion dbm = new conexion();
        try {
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            String sql = "UPDATE `obras` SET `casok`=" + casoK + " "
                    + "WHERE `idova`=" + idobra;
            System.out.println("" + sql);
            PreparedStatement st = con.prepareStatement(sql, 1005, 1007);
            if (st.execute()) {
                error = "No se puede actualizar datos de la OBRA: ";
            }
            st.close();
            con.close();
            dbm = null;
        } catch (NullPointerException | SQLException e) {

            System.out.println("[" + nombreClase + "]{modificarCasoK}\n"
                    + error + e.getMessage());
        }
        return error == null;
    }

    public boolean modificarBloqueoPrePol(int idobra, boolean bloqueo) {
        String error = null;
        conexion dbm = new conexion();
        try {
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            String sql = "UPDATE `obras` SET `bloquear_pre_pol`=" + bloqueo
                    + " "
                    + "WHERE `idova`=" + idobra;
            System.out.println("" + sql);
            PreparedStatement st = con.prepareStatement(sql, 1005, 1007);
            if (st.execute()) {
                error = "No se puede actualizar datos de la OBRA: ";
            }
            st.close();
            con.close();
            dbm = null;
        } catch (NullPointerException | SQLException e) {
            System.out.println("[" + nombreClase
                    + "]{modificarBloqueoPrePol}\n" + error + e.getMessage());
        }
        return error == null;
    }

    public boolean modificarEstado(String idestado) {
        String error = null;
        conexion dbm = new conexion();
        try {
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            String sql = "UPDATE `obras` SET `estado`=false WHERE `idobra`="
                    + idestado;
            PreparedStatement st = con.prepareStatement(sql, 1005, 1007);
            if (st.execute()) {
                error = "No se puede actualizar datos de la empresa: ";
            }
            st.close();
            con.close();
            dbm = null;
        } catch (NullPointerException | SQLException e) {
            System.out.println("[" + nombreClase + "]{modificarEstado}\n"
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
            String sql = "DELETE FROM `obras` WHERE `idova`=" + id;
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

    public boolean eliminarObrasAdicionales(int idova) {
        String error = null;
        conexion dbm = new conexion();
        try {
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            String sql = "DELETE FROM `obras` WHERE `dependiente`=" + idova;
            PreparedStatement st = con.prepareStatement(sql, 1005, 1007);
            if (st.execute()) {
                error = "No se puede actualizar datos de la empresa: ";
            }
            st.close();
            con.close();
            dbm = null;
        } catch (NullPointerException | SQLException e) {
            System.out.println("[" + nombreClase
                    + "]{eliminarObrasAdicionales}\n" + error + e.getMessage());
        }
        return error == null;
    }

    public obras BuscarId(String id) {
        obras p = null;
        try {
            conexion dbm = new conexion();
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());

            }
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from obras where idova="
                    + id);
            if (rs.next()) {
                p = getResult(rs);
            }
            rs.close();
            st.close();
            con.close();
            dbm = null;
        } catch (NullPointerException | SQLException e) {
            System.out.println("[" + nombreClase + "]{BuscarId}\n" + "Error:" + e.getMessage());
        }
        return p;
    }

    public List<obras> ListTodo(int idu) {
        List<obras> lista = new ArrayList<obras>();
        try {
            conexion dbm = new conexion();
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from obras where dependiente=0 and idu=" + idu + " order by fob asc");
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

    public List<obras> ListTodoIdovaDependiente(int idova) {
        List<obras> lista = new ArrayList<obras>();
        try {
            conexion dbm = new conexion();
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from obras where dependiente=" + idova + " order by fob asc");
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

    private obras getResult(ResultSet rs) throws SQLException {
        obras p = new obras();
        p.setIdova(rs.getInt("idova"));
        p.setDependiente(rs.getInt("dependiente"));
        p.setIdu(rs.getInt("idu"));
        p.setNob(rs.getString("nob"));
        p.setEnt(rs.getString("ent"));
        p.setLug(rs.getString("lug"));
        p.setTob(rs.getInt("tob"));
        p.setSco(rs.getInt("sco"));
        p.setMej(rs.getInt("mej"));
        p.setPse(rs.getInt("pse"));
        p.setIdphe(rs.getInt("idphe"));
        p.setHec(rs.getString("hec"));
        p.setIdprv(rs.getInt("idprv"));
        p.setRev(rs.getString("rev"));
        p.setIdprs(rs.getInt("idprs"));
        p.setRes(rs.getString("res"));
        p.setIdpsp(rs.getInt("idpsp"));
        p.setSup(rs.getString("sup"));
        p.setFob(rs.getDate("fob"));
        p.setFcu(rs.getDate("fcu"));
        p.setCon(rs.getString("con"));
        p.setEigv(rs.getInt("eigv"));
        p.setMco(rs.getDouble("mco"));
        p.setMre(rs.getDouble("mre"));
        p.setMcosi(rs.getDouble("mcosi"));
        p.setMresi(rs.getDouble("mresi"));
        p.setMba(rs.getDate("mba"));
        p.setMad(rs.getDate("mad"));
        p.setMam(rs.getDate("mam"));
        p.setPad(rs.getDouble("pad"));
        p.setPam(rs.getDouble("pam"));
        p.setCasok(rs.getInt("casok"));
        p.setBloquearPrePol(rs.getBoolean("bloquear_pre_pol"));

        p.setDiasContrato(rs.getInt("dias_contrato"));
        p.setFfAmp(rs.getDate("ff_amp"));
        p.setEst(rs.getInt("est"));
        return p;
    }
}
