/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Objects;
import java.util.Vector;
import javax.swing.JTable;

/**
 *
 * @author pak
 */
public class Patient {
    private String nomPatient;
    private String prenomPatient;
    private String dateNaissance;
    private char sexeP;
    private int telPatient;
    private String profession;
    private String mailPatient;
    private String password;

    public Patient() {
    }

    public Patient(String nomPatient, String prenomPatient, String dateNaissance, char sexeP, int telPatient, String profession, String mailPatient, String password) {
        this.nomPatient = nomPatient;
        this.prenomPatient = prenomPatient;
        this.dateNaissance = dateNaissance;
        this.sexeP = sexeP;
        this.telPatient = telPatient;
        this.profession = profession;
        this.mailPatient = mailPatient;
        this.password = password;
    }

    

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    

    public String getMailPatient() {
        return mailPatient;
    }

    public void setMailPatient(String mailPatient) {
        this.mailPatient = mailPatient;
    }

    public String getNomPatient() {
        return nomPatient;
    }

    public void setNomPatient(String nomPatient) {
        this.nomPatient = nomPatient;
    }

    public String getPrenomPatient() {
        return prenomPatient;
    }

    public void setPrenomPatient(String prenomPatient) {
        this.prenomPatient = prenomPatient;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public char getSexeP() {
        return sexeP;
    }

    public void setSexeP(char sexeP) {
        this.sexeP = sexeP;
    }

   
    public int getTelPatient() {
        return telPatient;
    }

    public void setTelPatient(int telPatient) {
        this.telPatient = telPatient;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.nomPatient);
        hash = 17 * hash + Objects.hashCode(this.prenomPatient);
        hash = 17 * hash + Objects.hashCode(this.dateNaissance);
        hash = 17 * hash + Objects.hashCode(this.sexeP);
        hash = 17 * hash + this.telPatient;
        hash = 17 * hash + Objects.hashCode(this.profession);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Patient other = (Patient) obj;
        if (this.telPatient != other.telPatient) {
            return false;
        }
        if (!Objects.equals(this.nomPatient, other.nomPatient)) {
            return false;
        }
        if (!Objects.equals(this.prenomPatient, other.prenomPatient)) {
            return false;
        }
        if (!Objects.equals(this.dateNaissance, other.dateNaissance)) {
            return false;
        }
        if (!Objects.equals(this.sexeP, other.sexeP)) {
            return false;
        }
        if (!Objects.equals(this.profession, other.profession)) {
            return false;
        }
        return true;
    }
    
    //savePatient
    public boolean savePatient(){
boolean ok=false;
         String sqlinsertPatient="INSERT INTO `patient`(`nomPatient`, `prenomPatient`, `dateNaissance`, `sexeP`, `telPatient`, `profession`, `mailPatient`) VALUES ('"+this.getNomPatient()+"','"+this.getPrenomPatient()+"','"+this.getDateNaissance()+"','"+this.getSexeP()+"','"+this.getTelPatient()+"','"+this.getProfession()+"','"+this.getMailPatient()+"')";
         String sqlinsertrole="INSERT INTO `role`(`email`, `password`, `typeUser`) VALUES ('"+this.getMailPatient()+"','"+this.getPassword()+"','Patient')";
           boolean statement0=new ConnexionBD().InsertUpdateData(sqlinsertrole);
           boolean statement=new ConnexionBD().InsertUpdateData(sqlinsertPatient);
           if(statement==true && statement0==true){
               ok=true;
           }else{
               ok=false;
           }
        return ok;
    }
    
    
    /**
     * Dossier patient
     */
    public JTable listPatient(){
    String query="SELECT `idPatient`,`nomPatient`, `prenomPatient`, `dateNaissance`, `sexeP`, `telPatient`, `profession`, `mailPatient` FROM `patient`";
      String[] champs ={"idPatient","nomPatient","prenomPatient","dateNaissance","sexeP","telPatient","profession","mailPatient"};
      Vector<String> titres=new Vector<String>();
      titres.addElement("Id patient");
      titres.addElement("Nom patient");
      titres.addElement("Prenom patient");
      titres.addElement("Date de naissance");
      titres.addElement("Sexe");
      titres.addElement("Tel. patient");
      titres.addElement("Profession");
      titres.addElement("E-mail");
      JTable table= new ConnexionBD().getData(query, champs, titres);
      return table;
  }
    public boolean updatePatient(String urlimage){
      String sql="UPDATE `patient` SET "             
              + "`nomPatient`='"+this.getNomPatient()+"',"
              + "`prenomPatient`='"+this.getPrenomPatient()+"',"
              + "`telPatient`='"+this.getTelPatient()+"',"
              + "`profession`='"+this.getProfession()+"' WHERE `mailPatient`='"+this.getMailPatient()+"'";
       boolean statement=new ConnexionBD().InsertUpdateData(sql);
       
        return statement;
    }
    
    
      public JTable listExamen(int id){
    String query="SELECT p.idPatient, p.nomPatient, e.rapport, e.montant, e.unitedemesure, e.domaine, e.date, e.urlImage FROM examen e, patient p WHERE  e.idPatient=p.idPatient and p.idPatient="+id+" ";
      String[] champs ={"p.idPatient","p.nomPatient","e.rapport", "e.montant","e.unitedemesure" ,"e.domaine","e.date" ,"e.urlImage"};
      Vector<String> titres=new Vector<String>();
      titres.addElement("ID Patient");
      titres.addElement("Nom Patient ");
      titres.addElement("Rapport de l'examen");  
      titres.addElement("Montant");
      titres.addElement("Unite de mesure");
      titres.addElement("Domaine");
      titres.addElement("Date de l'examen ");
      titres.addElement("Iamge de l'examen");
   
      JTable table= new ConnexionBD().getData(query, champs, titres);
      return table;
  }
      
    
}
