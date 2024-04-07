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
public class Image {
  private String urlimage;

    public Image() {
    }

    public Image(String urlimage) {
        this.urlimage = urlimage;
    }

    public String getUrlimage() {
        return urlimage;
    }

    public void setUrlimage(String urlimage) {
        this.urlimage = urlimage;
    }
  
    public boolean saveImage(){
         String sqlinsertPatient="INSERT INTO `image`(`UrlImage`) VALUES ('"+this.getUrlimage()+"')";
         boolean statement=new ConnexionBD().InsertUpdateData(sqlinsertPatient);
       
       return statement;
    }
  
}
