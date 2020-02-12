/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entity.PublicationForum;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import utils.ConnexionBD;

/**
 *
 * @author malik
 */
public class ServiceForum {
     Connection cn=ConnexionBD.getInstance().getConnexion();

      public void ajouterPub(PublicationForum u)
    {
        
   
        Statement st;
        try {
            
         st =cn.createStatement();
        String req="INSERT INTO publication( id_pb, id_user, titre ,contenu,theme,Posted_in) VALUES ('"+u.getId_pb()+"','"+u.getId_user()+"','"+u.getTitre()+"','"+u.getContenu()+"','"+u.getTheme()+"','"+u.getPosted_in()+"')";
             st.execute(req);
        } catch (SQLException ex) {
            Logger.getLogger(ServiceForum.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
     
     
     public  void deletPub(int id)
    {
        try {
         Statement st =cn.createStatement();
            String req="delete from  publication  WHERE id_pb ='"+id+"'";
            st.executeUpdate(req);
        } catch (SQLException ex) {
            Logger.getLogger(ServiceForum.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public  void updateArticle(PublicationForum u)
    {
        try {
         Statement st =cn.createStatement();
            String req="UPDATE  article set id_user='"+u.getId_user()+"',titre='"+u.getTitre()+"',contenu='"+u.getContenu()+"',theme='"+u.getTheme()+"',Posted_in='"+u.getPosted_in()+"'WHERE id_pb ='"+u.getId_pb()+"'";
            st.executeUpdate(req);
        } catch (SQLException ex) {
            Logger.getLogger(ServiceForum.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
     
      public  ObservableList<PublicationForum> getallpublication(){
          ObservableList<PublicationForum> publication = FXCollections.observableArrayList();
          
          try {
         Statement st =cn.createStatement();
            String req="select * from  article";
            ResultSet result =st.executeQuery(req);
            result.beforeFirst();
            
              while (result.next()) {
                    PublicationForum u=new PublicationForum();
                  u.setId_pb(result.getInt(1));
                  u.setId_user(result.getInt(2));
                  u.setTitre(result.getString(3));
                  u.setContenu(result.getString(4));
                  u.setTheme(result.getString(5));
                  u.setPosted_in(result.getTimestamp(6));
              
                  publication.add(u);
                  System.out.println(u);
                  
              }
        } catch (SQLException ex) {
            Logger.getLogger(ServiceForum.class.getName()).log(Level.SEVERE, null, ex);
            
        }
          return publication;
      }
     
      
       public  ObservableList<PublicationForum> search(String name){
          ObservableList<PublicationForum> articles = FXCollections.observableArrayList();
          
          try {
         Statement st =cn.createStatement();
            String req="select * from  article where Title like '%"+name+"%' ";
            ResultSet result =st.executeQuery(req);
            result.beforeFirst();
            
              while (result.next()) {
                  PublicationForum u = new PublicationForum();
                  u.setId_pb(result.getInt(1));
                  u.setId_user(result.getInt(2));
                  u.setTitre(result.getString(3));
                  u.setContenu(result.getString(4));
                  u.setTheme(result.getString(5));
                  u.setPosted_in(result.getTimestamp(6));
                  
                  articles.add(u);
                  System.out.println(u);
                  
              }
        } catch (SQLException ex) {
            Logger.getLogger(ServiceForum.class.getName()).log(Level.SEVERE, null, ex);
            
        }
          return articles;
      }
      
       public static void main(String[] args) {
           Timestamp now = new Timestamp(System.currentTimeMillis());
           ServiceForum sf=new ServiceForum();
           PublicationForum p = new PublicationForum(1,1,"hduhduzhudhzu","dhiuzéeuduz","fjiozjfiozejiof",now);
           sf.ajouterPub(p);
            String pattern = "yyyy-MM-dd";
           ConnexionBD ds =ConnexionBD.getInstance();
          // PublicationForum p = new PublicationForum(1,1,"hduhduzhudhzu","dhiuzéeuduz","fjiozjfiozejiof",now) ;
         //  new ServiceForum().ajouterPub(p);
           
       }
     
     
     
}
