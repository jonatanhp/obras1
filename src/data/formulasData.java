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
import OBJETOS.cC1Formulas;
import utilitarios.fechas;
import vconexion.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;
import OBJETOS.cEspecialidad;

public class dC1Formulas {

    private final String nombreClase = "dC1Formulas";

    public int getMaxId() {
        String error = null;
        int id = 0;
        conexion dbm = new conexion();
        try {
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            String sql = "SELECT max(idfm) id FROM `c1_formulas`";
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
            System.out.println("[" + nombreClase + "]{getMaxId}\n" + "Error:" + e.getMessage());
        }
        return id;

    }

    public boolean crear(cC1Formulas o) {
        String error = null;
        conexion dbm = new conexion();
        try {
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            //`idvaldat`,null,
            String sql = "INSERT INTO `c1_formulas`(`idfm`,`idova`, `idesp`, `estado_pre`,`estado_k`,`pos`) "
                    + "VALUES (null," + o.getIdova() + "," + o.getIdesp()
                    + "," + o.isEstadoPre() + "," + o.isEstadoK() + "," + o.getPos() + ")";
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

    public boolean modificarPos(int idfm, int pos) {
        String error = null;
        conexion dbm = new conexion();
        try {
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            //`idvaldat`,null,
            String sql = "UPDATE `c1_formulas` SET `pos`=" + pos + " WHERE `idfm`=" + idfm;
            PreparedStatement st = con.prepareStatement(sql, 1005, 1007);
            if (st.execute()) {
                error = "No se puede actualizar datos de la empresa: ";
            }
            st.close();
            con.close();
            dbm = null;
        } catch (NullPointerException | SQLException e) {
            System.out.println("[" + nombreClase + "]{modificarPos}\n"
                    + error + e.getMessage());
        }
        return error == null;
    }

    public boolean modificarEstPre(int idfm, boolean estado) {

        String error = null;
        conexion dbm = new conexion();
        try {
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            //`idvaldat`,null,
            String sql = "UPDATE `c1_formulas` SET `estado_pre`=" + estado
                    + " WHERE `idfm`=" + idfm;
            PreparedStatement st = con.prepareStatement(sql, 1005, 1007);
            if (st.execute()) {
                error = "No se puede actualizar datos de la empresa: ";
            }
            st.close();
            con.close();
            dbm = null;
        } catch (NullPointerException | SQLException e) {
            System.out.println("[" + nombreClase + "]{modificarEstPre}\n"
                    + error + e.getMessage());
        }
        return error == null;
    }

    public boolean modificarEstK(int idfm, boolean estado) {
        String error = null;
        conexion dbm = new conexion();
        try {
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            //`idvaldat`,null,
            String sql = "UPDATE `c1_formulas` SET `estado_k`=" + estado + " WHERE `idfm`=" + idfm;
            PreparedStatement st = con.prepareStatement(sql, 1005, 1007);
            if (st.execute()) {
                error = "No se puede actualizar datos de la empresa: ";
            }
            st.close();
            con.close();
            dbm = null;
        } catch (NullPointerException | SQLException e) {
            System.out.println("[" + nombreClase + "]{modificarEstK}\n"
                    + error + e.getMessage());
        }
        return error == null;
    }

    public int countEspIdova(int idova) {
        int total = 0;
        try {
            conexion dbm = new conexion();
            Connection con = dbm.getConnection();
            if (con == null) {

                throw new NullPointerException(dbm.getError());
            }
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(`idfm`) total FROM `c1_formulas` WHERE `idova`=" + idova);
            if (rs.next()) {
                try {
                    total = rs.getInt("total");
                } catch (NumberFormatException e) {
                    total = 0;
                }
            }
            rs.close();
            st.close();
            con.close();
            dbm = null;
        } catch (NullPointerException | SQLException e) {
            System.out.println("[" + nombreClase + "]{countEspIdova}\n"
                    + "Error :" + e.getMessage());
        }
        return total;
    }

    public int sumPresupuestoIdova(int idova) {
        int total = 0;
        try {
            conexion dbm = new conexion();
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT SUM(`estado_pre`) total FROM `c1_formulas` WHERE `idova`=" + idova);
            if (rs.next()) {
                try {
                    total = rs.getInt("total");
                } catch (NumberFormatException e) {
                    total = 0;
                }
            }
            rs.close();
            st.close();
            con.close();
            dbm = null;
        } catch (NullPointerException | SQLException e) {
            System.out.println("[" + nombreClase
                    + "]{sumPresupuestoIdova}\n" + "Error :" + e.getMessage());
        }
        return total;
    }

    public int sumPolinomioIdova(int idova) {
        int total = 0;
        try {
            conexion dbm = new conexion();
            Connection con = dbm.getConnection();

            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT SUM(`estado_k`) total FROM `c1_formulas` WHERE `idova`=" + idova);
            if (rs.next()) {
                try {
                    total = rs.getInt("total");
                } catch (NumberFormatException e) {
                    total = 0;
                }
            }
            rs.close();
            st.close();
            con.close();
            dbm = null;
        } catch (NullPointerException | SQLException e) {
            System.out.println("[" + nombreClase + "]{sumPolinomioIdova}\n"
                    + "Error :" + e.getMessage());
        }
        return total;
    }

    public cC1Formulas buscarId(int idfm) {
        cC1Formulas p = null;
        try {
            conexion dbm = new conexion();
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            Statement st = con.createStatement();
            String sql = "SELECT * FROM `c1_formulas` WHERE idfm=" + idfm;
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                p = getResult(rs);
            }
            rs.close();
            st.close();
            con.close();
            dbm = null;
        } catch (NullPointerException | SQLException e) {
            System.out.println("[" + nombreClase + "]{buscarId}\n" + "Error:" + e.getMessage());
            p = null;
        }
        p.setOe(new dEspecialidad().BuscarId("" + p.getIdesp()));
        return p;
    }

    public List<cC1Formulas> listarFormulasIdova(int idova) {
        List<cC1Formulas> lista = new ArrayList<cC1Formulas>();
        try {
            conexion dbm = new conexion();
            Connection con = dbm.getConnection();
            if (con == null) {

                throw new NullPointerException(dbm.getError());
            }
            Statement st = con.createStatement();
            String sql = "SELECT v1.*,v2.nom FROM `c1_formulas` v1 "
                    + "INNER JOIN `especialidad` v2 ON v2.idesp=v1.idesp "
                    + "WHERE v1.idova=" + idova + " "
                    + "ORDER BY v1.pos ASC";
            System.out.println("sql:" + sql);
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                lista.add(getResult2(rs));
            }
            rs.close();
            st.close();
            con.close();
            dbm = null;
        } catch (Exception e) {
            System.out.println("[" + nombreClase
                    + "]{listarFormulasIdova}\n" + "Error :" + e.getMessage());
            lista = new ArrayList<cC1Formulas>();
        }
        return lista;
    }//*/

    private cC1Formulas getResult(ResultSet rs) throws SQLException {
        cC1Formulas p = new cC1Formulas();
        p.setIdfm(rs.getInt("idfm"));
        p.setIdesp(rs.getInt("idesp"));
        p.setEstadoPre(rs.getBoolean("estado_pre"));
        p.setEstadoPre(rs.getBoolean("estado_k"));
        p.setPos(rs.getInt("pos"));
        return p;
    }

    private cC1Formulas getResult2(ResultSet rs) throws SQLException {
        cC1Formulas p = new cC1Formulas();
        p.setIdfm(rs.getInt("idfm"));
        p.setIdesp(rs.getInt("idesp"));
        p.setEstadoPre(rs.getBoolean("estado_pre"));
        p.setEstadoK(rs.getBoolean("estado_k"));
        p.setPos(rs.getInt("pos"));
        p.setOe(new cEspecialidad());
        p.getOe().setNom(rs.getString("nom"));
        return p;
    }

    public List<cC1Formulas> conteoAPMPorFormulasOrdAscIdval(int idval) {
        List<cC1Formulas> lista = new ArrayList<cC1Formulas>();
        try {
            conexion dbm = new conexion();
            Connection con = dbm.getConnection();
            if (con == null) {
                throw new NullPointerException(dbm.getError());
            }
            String sql = "SELECT v1.idfm,COUNT(*) conteo FROM `c1_formulas` v1 "
                    + "INNER JOIN mes_reajuste_valorizado v3 ONv3.idfm=v1.idfm "
                    + "INNER JOIN reajustes v2 ON v2.idmrv=v3.idmrv "
                    + "WHERE v2.idval=" + idval + " GROUP BY v1.idfm ORDER BY v1.idfm ASC";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                cC1Formulas p = new cC1Formulas();
                p.setIdfm(rs.getInt("idfm"));
                p.setPos(rs.getInt("conteo"));
                lista.add(p);
            }
            rs.close();
            st.close();
            dbm = null;
        } catch (NullPointerException | SQLException e) {
            System.out.println("[" + nombreClase
                    + "]{conteoAPMPorFormulasOrdAscIdval}\n" + "Error :" + e.getMessage());
            lista = new ArrayList<cC1Formulas>();
        }
        return lista;
    }
}
