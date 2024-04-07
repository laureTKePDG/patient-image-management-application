/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author pak
 */
public class Medecin {
     private String nomMedecin;
    private String prenomMedecin;
    private String service;
    private int telMedecin;
    private String emailMedecin;
     private String password;
    private String urlImage ;
     private String sexeM;
    public Medecin() {
    }

    public Medecin(String nomMedecin, String prenomMedecin, String service, int telMedecin, String emailMedecin, String password, String urlImage, String sexeM) {
        this.nomMedecin = nomMedecin;
        this.prenomMedecin = prenomMedecin;
        this.service = service;
        this.telMedecin = telMedecin;
        this.emailMedecin = emailMedecin;
        this.password = password;
        this.urlImage = urlImage;
        this.sexeM = sexeM;
    }

       

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
 
    public String getNomMedecin() {
        return nomMedecin;
    }

    public void setNomMedecin(String nomMedecin) {
        this.nomMedecin = nomMedecin;
    }

    public String getPrenomMedecin() {
        return prenomMedecin;
    }

    public void setPrenomMedecin(String prenomMedecin) {
        this.prenomMedecin = prenomMedecin;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getSexeM() {
        return sexeM;
    }

    public void setSexeM(String sexeM) {
        this.sexeM = sexeM;
    }

    public int getTelMedecin() {
        return telMedecin;
    }

    public void setTelMedecin(int telMedecin) {
        this.telMedecin = telMedecin;
    }

    public String getEmailMedecin() {
        return emailMedecin;
    }

    public void setEmailMedecin(String emailMedecin) {
        this.emailMedecin = emailMedecin;
    }

 
    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
    
        //saveMedecin
    public boolean saveMedecin(){
boolean ok=false;
         String sqlinsertPatient="INSERT INTO `medecin`(`nomMedecin`, `prenomMedecin`, `service`, `telMedecin`, `emailMedecin`, `password`, `urlImage`, `sexeM`) VALUES ('"+this.getNomMedecin()+"','"+this.getPrenomMedecin()+"','"+this.getService()+"','"+this.getTelMedecin()+"','"+this.getEmailMedecin()+"','"+this.getPassword()+"','"+this.getUrlImage()+"','"+this.getSexeM()+"')";
         String sqlinsertrole="INSERT INTO `role`(`email`, `password`, `typeUser`) VALUES ('"+this.getEmailMedecin()+"','"+this.getPassword()+"','Medecin')";
           boolean statement0=new ConnexionBD().InsertUpdateData(sqlinsertrole);
           boolean statement=new ConnexionBD().InsertUpdateData(sqlinsertPatient);
           if(statement==true && statement0==true){
               ok=true;
           }else{
               ok=false;
           }
        return ok;
    }
    
     public boolean updateMedecin(){
      String sql="UPDATE `medecin` SET `nomMedecin`='"+this.getNomMedecin()+"',`prenomMedecin`='"+this.getPrenomMedecin()+"',`service`='"+this.getService()+"',`telMedecin`='"+this.getTelMedecin()+"',`password`='"+this.getPassword()+"',`urlImage`='"+this.getUrlImage()+"' WHERE `emailMedecin`='"+this.getEmailMedecin()+"' ";
       boolean statement=new ConnexionBD().InsertUpdateData(sql);
       
        return statement;
    }
    
}
