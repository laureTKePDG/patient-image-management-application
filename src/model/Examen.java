/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JTable;

/**
 *
 * @author pak
 */
public class Examen {
    private String rapport;
    private int idP;
    private int idA;
    private int montant;
    private String domaine;
    private String unitedemesure;
  ///  private String date;
    private String urlImage;
    public Examen() {
    }

    public Examen(String rapport, int idP, int idA, int montant, String domaine, String unitedemesure, String urlImae) {
        this.rapport = rapport;
        this.idP = idP;
        this.idA = idA;
        this.montant = montant;
        this.domaine = domaine;
        this.unitedemesure = unitedemesure;
        this.urlImage = urlImae;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImae) {
        this.urlImage = urlImae;
    }

    

    public String getRapport() {
        return rapport;
    }

    public void setRapport(String rapport) {
        this.rapport = rapport;
    }

    public int getIdP() {
        return idP;
    }

    public void setIdP(int idP) {
        this.idP = idP;
    }

    public int getIdA() {
        return idA;
    }

    public void setIdA(int idA) {
        this.idA = idA;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    public String getDomaine() {
        return domaine;
    }

    public void setDomaine(String domaine) {
        this.domaine = domaine;
    }

    public String getUnitedemesure() {
        return unitedemesure;
    }

    public void setUnitedemesure(String unitedemesure) {
        this.unitedemesure = unitedemesure;
    }
         //creer ///get la date courrente:
	public String auj() {
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MMMM/dd HH:mm:ss");
		return dtf.format(LocalDateTime.now());
	}
        
        ///--------------
        public List<String> listArchive(){
            boolean ok;
            List<String> liste=new ArrayList<>();
            String sql="SELECT `nom` FROM `archive`";
            
            liste=new ConnexionBD().selectcolon(sql);
         return liste;   
        }
        //------
       public boolean saveArchive(){
         String sqlinsertPatient="INSERT INTO `examen`(`rapport`, `idPatient`, `idArchive`, `montant`, `domaine`, `unitedemesure`, `date`, `urlImage`) VALUES ('"+this.getRapport()+"','"+this.getIdP()+"','"+this.getIdA()+"','"+this.getMontant()+"','"+this.getDomaine()+"','"+this.getUnitedemesure()+"','"+this.auj()+"','"+this.getUrlImage()+"')";
       boolean statement=new ConnexionBD().InsertUpdateData(sqlinsertPatient);
       
       return statement;
    }
      
      //lister
   public JTable listExamen(){
    String query="SELECT `nom`, `Date_creation`, `description`  FROM `archive`";
      String[] champs ={"nom","Date_creation","description"};
      Vector<String> titres=new Vector<String>();
      titres.addElement("Nom Archive");
      titres.addElement("Date de cration");
      titres.addElement("Description");
   
      JTable table= new ConnexionBD().getData(query, champs, titres);
      return table;
  }

     public JTable listEx(){
         String sql="SELECT `idExam`, `rapport`, `idPatient`, `idArchive`, `montant`, `domaine`, `unitedemesure`, `date`, `urlImage` FROM `examen`";
    
      String[] champs ={"idExam","rapport","idPatient","idArchive","montant","domaine","unitedemesure","date","urlImage"};
      Vector<String> titres=new Vector<String>();
      titres.addElement("Id Examen");
      titres.addElement("Rapport de l'examen");
      titres.addElement("Id du Patient");
       titres.addElement("Dans l'archive");
      titres.addElement("montant");
      titres.addElement("domaine");
       titres.addElement("Unité de mesure");
      titres.addElement("Date de d'examination");
      titres.addElement("Image pris au cours de l'exam");
   
      JTable table= new ConnexionBD().getData(sql, champs, titres);
      return table;
     }   
}
