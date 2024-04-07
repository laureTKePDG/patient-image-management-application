/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Vector;
import javax.swing.JTable;

/**
 *
 * @author pak
 */
public class Archive {
    private String nom;
    private String description;

    public Archive() {
    }

    public Archive(String nom, String description) {
        this.nom = nom;
        this.description = description;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    ///get la date courrente:
	public String auj() {
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MMMM/dd HH:mm:ss");
		return dtf.format(LocalDateTime.now());
	}
    //creer
       public boolean saveArchive(){
         String sqlinsertPatient="INSERT INTO `archive`(`nom`, `Date_creation`, `description`) VALUES ('"+this.getNom()+"','"+this.auj()+"','"+this.getDescription()+"')";
       boolean statement=new ConnexionBD().InsertUpdateData(sqlinsertPatient);
       
       return statement;
    }
    
    
    
    //lister
   public JTable listArchive(){
    String query="SELECT `idArchive`,`nom`, `Date_creation`, `description`  FROM `archive`";
      String[] champs ={"idArchive","nom","Date_creation","description"};
      Vector<String> titres=new Vector<String>();
       titres.addElement("id");
      titres.addElement("Nom Archive");
      titres.addElement("Date de cration");
      titres.addElement("Description");
   
      JTable table= new ConnexionBD().getData(query, champs, titres);
      return table;
  }
 //lister
   public JTable listArchiveId(int id){
    String query="SELECT p.idPatient ,p.nomPatient,e.rapport, e.montant,e.unitedemesure ,e.domaine,e.date ,e.urlImage FROM archive a,examen e, patient p WHERE e.idArchive=a.idArchive and e.idPatient=p.idPatient and a.idArchive="+id+" ";
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
