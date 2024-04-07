/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author pak
 */
public class ConnexionBD {
     private Connection con=null;
    static final String User="root";
    static final String Password="";
    static final String URL="jdbc:mysql://localhost:3306/gestion_des_imageries_poo";

    public ConnexionBD() {
        try{
            con= DriverManager.getConnection(URL, User, Password);
            //JOptionPane.showMessageDialog(null,"connect with"+con.toString());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"not connect to server and message is "+e.getMessage());
        }
    }
    
    //****Requete d'Insertion dans la Base de données
    public boolean InsertUpdateData(String sql){
        boolean ok=false;
        if(con!=null){
           try{
            Statement statement= con.createStatement();
            int nbr=statement.executeUpdate(sql); //si nbr=1 requete  enregistrer sinon nbre=0 requette echoue
            if(nbr!=0) ok=true;
           }catch(SQLException e){
               System.out.println(e.getMessage());
           }   
        }
        return ok;
    }
 /**
     * lister
     */
   /**
     * @param query
     * @param champs
     * @param columns
     * @return 
     */
    public JTable getData(String query, String[] champs, Vector<String> columns){
         JTable table=null;
        if(con!=null){
           try{
               Statement stm = con.createStatement();
              ResultSet res = stm.executeQuery(query);
     
      Vector<Vector> data=new Vector<Vector>();
            //int i = 0;
            while (res.next()) {
                 Vector<String> line=new Vector<String>(champs.length);
                for(int j=0;j<champs.length;j++)
                    line.addElement(res.getString(champs[j]));
                data.addElement(line);
//              i++;
            }  
                table = new JTable(data, columns);
           }catch(SQLException e) {
                 e.printStackTrace();
            }
        }
        return table;
    }
     
    public List<String> selectcolon(String sql){
        List<String> result=new ArrayList<>();
        if(con!=null){
            try{
                Statement state=con.createStatement();
                ResultSet rs=state.executeQuery(sql);
                while(rs.next()){
                    result.add(rs.getString(1));
                }
                rs.close();
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
      }
     return result;
}
    
    public   ResultSet requeste(String sql) throws SQLException{
          ResultSet rs=null;
             Connection con=DriverManager.getConnection(URL, User, Password);
             PreparedStatement pat=null;
             pat =con.prepareStatement(sql);
           rs=pat.executeQuery();
             
        return rs;
    }
}