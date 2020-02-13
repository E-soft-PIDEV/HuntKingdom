/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entity.Commentaire;
import Entities.PublicationForum;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import utils.ConnexionBD;

/**
 *
 * @author malik
 */
public class ServiceCommentaire {
     Connection cn=ConnexionBD.getInstance().getConnexion();
      public void ajoutercommentaire(Commentaire u) {
          Statement st;
        try {
            
         st =cn.createStatement();
        String req="INSERT INTO commentaire( id, id_user,id_pb ,contenu,) VALUES ('"+u.getId()+"','"+u.getId_user()+"','"+u.getId_pb()+"','"+u.getContenu()+"')";
             st.execute(req);
        } catch (SQLException ex) {
            Logger.getLogger(ServiceCommentaire.class.getName()).log(Level.SEVERE, null, ex);
        }
       
          
        
      }
      
      public  List<Commentaire>getallCommentaire() {
          List<Commentaire> commentaire = new ArrayList<Commentaire>();
          
          try {
         Statement st =cn.createStatement();
            String req="select * from  commentaire";
            ResultSet result =st.executeQuery(req);
            result.beforeFirst();
            
              while (result.next()) {
                    Commentaire u=new Commentaire();
                  u.setId_pb(result.getInt(1));
                  u.setId_user(result.getInt(2));
                  u.setContenu(result.getString(3));
                  u.setId(result.getInt(4));
                 
                  commentaire.add(u);
                  System.out.println(u);
                  
              }
        } catch (SQLException ex) {
            Logger.getLogger(ServiceCommentaire.class.getName()).log(Level.SEVERE, null, ex);
            
        }
          return commentaire;
      }
       public  void updatCommentaire(Commentaire  u, int id)
    {
             PreparedStatement pt;

        try {
             pt = cn.prepareStatement ("UPDATE  commentaire set contenu=? WHERE id =?");
                  pt.setString(1,u.getContenu());
                  pt.setInt(2,id);
                 
            pt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ServiceForum.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
      
      
           
            
  
           
           
      
       
        public  void deletcommentaire(int id)
    {
        try {
         Statement st =cn.createStatement();
            String req="delete from  commentaire  WHERE id ='"+id+"'";
            st.executeUpdate(req);
        } catch (SQLException ex) {
            Logger.getLogger(ServiceForum.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
       
       
       
     
          
      }
    

