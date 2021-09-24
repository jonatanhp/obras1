/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author jonatan
 */
import java.util.Date;

public class obras {

    private int idova;
    private int dependiente;
    private int idu;
    private String nob;
    private String ent;
    private String lug;
    private int tob;
    private int sco;
    private int mej;
    private int pse;
    private int idphe;
    private String hec;
    private int idprv;
    private String rev;
    private int idprs;
    private String res;
    private int idpsp;
    private String sup;
    private Date fob;
    private Date fcu;
    private String con;
    private int eigv;
    private double mco;
    private double mre;
    private double mcosi;
    private double mresi;
    private Date mba;
    private Date mad;
    private Date mam;

    private double pad;
    private double pam;
    private int casok;
    private boolean bloquearPrePol;
    private int dias_contrato;
    private Date ff_amp;
    private int est;

    public obras() {
    }

    public obras(obras oo) {
        this.idova = oo.getIdova();
        this.dependiente = oo.getDependiente();
        this.idu = oo.getIdu();
        this.nob = oo.getNob();
        this.ent = oo.getEnt();
        this.lug = oo.getLug();
        this.tob = oo.getTob();
        this.sco = oo.getSco();
        this.mej = oo.getMej();
        this.pse = oo.getPse();
        this.idphe = oo.getIdphe();
        this.hec = oo.getHec();
        this.idprv = oo.getIdprv();
        this.rev = oo.getRev();
        this.idprs = oo.getIdprs();
        this.res = oo.getRes();
        this.idpsp = oo.getIdpsp();
        this.sup = oo.getSup();
        this.fob = oo.getFob();
        this.fcu = oo.getFcu();
        this.con = oo.getCon();
        this.eigv = oo.getEigv();
        this.mco = oo.getMco();
        this.mre = oo.getMre();
        this.mcosi = oo.getMcosi();
        this.mresi = oo.getMresi();
        this.mba = oo.getMba();
        this.mad = oo.getMad();
        this.mam = oo.getMam();
        this.pad = oo.getPad();
        this.pam = oo.getPam();
        this.casok = oo.getCasok();
        this.bloquearPrePol = oo.isBloquearPrePol();
        this.dias_contrato = oo.getDiasContrato();
        this.ff_amp = oo.getFfAmp();
        this.est = oo.getEst();
    }

    /**
     * @return the idobra
     */

    public int getIdova() {
        return idova;

    }

    /**
     * @param idobra the idobra to set
     */
    public void setIdova(int idobra) {
        this.idova = idobra;

    }

    /**
     * @return the nob
     */
    public String getNob() {
        return nob;

    }

    /**
     * @param nob the nob to set
     */
    public void setNob(String nob) {
        this.nob = nob;

    }

    /**
     * @return the ent
     */
    public String getEnt() {
        return ent;

    }

    /**
     * @param ent the ent to set
     */
    public void setEnt(String ent) {
        this.ent = ent;

    }

    /**
     * @return the lug
     */
    public String getLug() {
        return lug;

    }

    /**
     * @param lug the lug to set
     */
    public void setLug(String lug) {
        this.lug = lug;

    }

    /**
     * @return the tob
     */
    public int getTob() {

        return tob;

    }

    /**
     * @param tob the tob to set
     */
    public void setTob(int tob) {
        this.tob = tob;

    }

    /**
     * @return the sco
     */
    public int getSco() {
        return sco;

    }

    /**
     * @param sco the sco to set
     */
    public void setSco(int sco) {
        this.sco = sco;

    }

    /**
     * @return the mej
     */
    public int getMej() {
        return mej;

    }

    /**
     * @param mej the mej to set
     */
    public void setMej(int mej) {
        this.mej = mej;

    }

    /**
     * @return the pse
     */
    public int getPse() {
        return pse;

    }

    /**
     * @param pse the pse to set
     */
    public void setPse(int pse) {
        this.pse = pse;

    }

    /**
     * @return the idphe
     */
    public int getIdphe() {
        return idphe;

    }

    /**
     * @param idphe the idphe to set
     */
    public void setIdphe(int idphe) {
        this.idphe = idphe;

    }

    /**
     * @return the hec
     */
    public String getHec() {
        return hec;

    }

    /**
     * @param hec the hec to set
     */
    public void setHec(String hec) {
        this.hec = hec;

    }

    /**
     * @return the idprv
     */
    public int getIdprv() {
        return idprv;

    }

    /**
     * @param idprv the idprv to set
     */
    public void setIdprv(int idprv) {
        this.idprv = idprv;

    }

    /**
     * @return the rev
     */
    public String getRev() {
        return rev;

    }

    /**
     * @param rev the rev to set
     */
    public void setRev(String rev) {
        this.rev = rev;

    }

    /**
     * @return the idprs
     */
    public int getIdprs() {
        return idprs;

    }

    /**
     * @param idprs the idprs to set
     */
    public void setIdprs(int idprs) {
        this.idprs = idprs;

    }

    /**
     * @return the res
     */
    public String getRes() {
        return res;

    }

    /**
     * @param res the res to set
     */
    public void setRes(String res) {
        this.res = res;

    }

    /**
     * @return the idpsp
     */
    public int getIdpsp() {
        return idpsp;

    }

    /**
     * @param idpsp the idpsp to set
     */
    public void setIdpsp(int idpsp) {
        this.idpsp = idpsp;

    }

    /**
     * @return the sup
     */
    public String getSup() {
        return sup;

    }

    /**
     * @param sup the sup to set
     */
    public void setSup(String sup) {
        this.sup = sup;

    }

    /**
     * @return the fob
     */
    public Date getFob() {
        return fob;

    }

    /**
     * 131
     *
     * @param fob the fob to set
     */
    public void setFob(Date fob) {
        this.fob = fob;
    }

    /**
     * @return the con
     */
    public String getCon() {
        return con;
    }

    /**
     * @param con the con to set
     */
    public void setCon(String con) {
        this.con = con;
    }

    /**
     * @return the est
     */
    public int getEst() {
        return est;
    }

    /**
     * @param est the est to set
     */
    public void setEst(int est) {
        this.est = est;
    }

    @Override
    public String toString() {
        return nob; //To change body of generated methods, choose Tools |
//Templates.
    }

    /**
     * @return the mco
     */
    public double getMco() {
        return mco;
    }

    /**
     * @param mco the mco to set
     */
    public void setMco(double mco) {
        this.mco = mco;
    }

    /**
     * @return the mba
     */

    public Date getMba() {
        return mba;

    }

    /**
     * @param mba the mba to set
     */
    public void setMba(Date mba) {
        this.mba = mba;

    }

    /**
     * @return the mad
     */
    public Date getMad() {
        return mad;

    }

    /**
     * @param mad the mad to set
     */
    public void setMad(Date mad) {
        this.mad = mad;

    }

    /**
     * @return the fcu
     */
    public Date getFcu() {
        return fcu;

    }

    /**
     * @param fcu the fcu to set
     */
    public void setFcu(Date fcu) {
        this.fcu = fcu;

    }

    /**
     * @return the mre
     */
    public double getMre() {
        return mre;

    }

    /**
     * @param mre the mre to set
     */
    public void setMre(double mre) {
        this.mre = mre;

    }

    /**
     * @return the pad
     */
    public double getPad() {

        return pad;

    }

    /**
     * @param pad the pad to set
     */
    public void setPad(double pad) {
        this.pad = pad;

    }

    /**
     * @return the pam
     */
    public double getPam() {
        return pam;

    }

    /**
     * @param pam the pam to set
     */
    public void setPam(double pam) {
        this.pam = pam;

    }

    /**
     * @return the mam
     */
    public Date getMam() {
        return mam;

    }

    /**
     * @param mam the mam to set
     */
    public void setMam(Date mam) {
        this.mam = mam;

    }

    /**
     * @return the mcosi
     */
    public double getMcosi() {
        return mcosi;

    }

    /**
     * @param mcosi the mcosi to set
     */
    public void setMcosi(double mcosi) {
        this.mcosi = mcosi;

    }

    /**
     * @return the mresi
     */
    public double getMresi() {
        return mresi;

    }

    /**
     * @param mresi the mresi to set
     */
    public void setMresi(double mresi) {
        this.mresi = mresi;
    }

    /**
     * @return the eigv
     */
    public int getEigv() {
        return eigv;
    }

    /**
     * @param eigv the eigv to set
     */
    public void setEigv(int eigv) {
        this.eigv = eigv;
    }

    /**
     * @return the casok
     */
    public int getCasok() {
        return casok;
    }

    /**
     * @param casok the casok to set
     */
    public void setCasok(int casok) {
        this.casok = casok;
    }

    /**
     * @return the bloquearPrePol
     */
    public boolean isBloquearPrePol() {
        return bloquearPrePol;
    }

    /**
     * @param bloquearPrePol the bloquearPrePol to set
     */
    public void setBloquearPrePol(boolean bloquearPrePol) {
        this.bloquearPrePol = bloquearPrePol;
    }

    /**
     * @return the dias_contrato
     */
    public int getDiasContrato() {
        return dias_contrato;
    }

    /**
     * @param dias_contrato the dias_contrato to set
     */
    public void setDiasContrato(int dias_contrato) {
        this.dias_contrato = dias_contrato;
    }

    /**
     * @return the ff_amp
     */
    public Date getFfAmp() {
        return ff_amp;
    }

    /**
     * @param ff_amp the ff_amp to set
     */
    public void setFfAmp(Date ff_amp) {
        this.ff_amp = ff_amp;
    }

    /**
     * @return the idu
     */
    public int getIdu() {
        return idu;
    }

    /**
     * @param idu the idu to set
     */
    public void setIdu(int idu) {
        this.idu = idu;
    }

    /**
     * @return the dependiente
     */
    public int getDependiente() {
        return dependiente;
    }

    /**
     * @param dependiente the dependiente to set
     */
    public void setDependiente(int dependiente) {
        this.dependiente = dependiente;
    }
}
