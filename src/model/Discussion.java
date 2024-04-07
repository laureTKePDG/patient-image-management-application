/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

/**
 *
 * @author pak
 */
public class Discussion {
    private int idp,idm;
    private String msg_patient,msg_medecin;

    public Discussion() {
    }

    public Discussion(int idp, int idm, String msg_patient) {
        this.idp = idp;
        this.idm = idm;
        this.msg_patient = msg_patient;
    }

    public Discussion(int idp, int idm, String msg_patient, String msg_medecin) {
        this.idp = idp;
        this.idm = idm;
        this.msg_patient = msg_patient;
        this.msg_medecin = msg_medecin;
    }

    public int getIdp() {
        return idp;
    }

    public void setIdp(int idp) {
        this.idp = idp;
    }

    public int getIdm() {
        return idm;
    }

    public void setIdm(int idm) {
        this.idm = idm;
    }

    public String getMsg_patient() {
        return msg_patient;
    }

    public void setMsg_patient(String msg_patient) {
        this.msg_patient = msg_patient;
    }

    public String getMsg_medecin() {
        return msg_medecin;
    }

    public void setMsg_medecin(String msg_medecin) {
        this.msg_medecin = msg_medecin;
    }
 
    
       //creer ///get la date courrente:
	public String auj() {
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MMMM/dd HH:mm:ss");
		return dtf.format(LocalDateTime.now());
	}
       
    /**
     * create discos
     */
        //by patient
    public boolean createDiscos(){
        String sql="INSERT INTO `conversation`(`idMedecin`, `idPatient`, `msg_patient`, `heurePatient`) VALUES ("+this.getIdm()+","+this.getIdp()+",'"+this.getMsg_patient()+"','"+this.auj()+"')";
        
         boolean statement=new ConnexionBD().InsertUpdateData(sql);
       
        return statement;
    }
//    by medecin
    public boolean createDiscosM(){
        String sql="INSERT INTO `conversation`(`idMedecin`, `idPatient`, `msg_medecin`, `heureMedecin`) VALUES ("+this.getIdm()+","+this.getIdp()+",'"+this.getMsg_patient()+"','"+this.auj()+"')";
        
         boolean statement=new ConnexionBD().InsertUpdateData(sql);
       
        return statement;
    }
    /**
     * medecin replay the discos
     */
    public boolean replay(int idP, int idM, String mM){
        String sql="UPDATE `conversation` SET "
                + "`msg_medecin`='"+mM+"',"
                + "`heureMedecin`='"+this.auj()+"'"
                + " WHERE `idMedecin`="+idM+" AND`idPatient`="+idP+"";
        boolean statement=new ConnexionBD().InsertUpdateData(sql);
       
        return statement;
    }
}
