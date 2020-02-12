/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Article;
import Utilities.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Med. Ali
 */
public class articleServices {

    Connection cn = DataSource.getInstance().getConnection();

    public void ajouterArticle(Article a) {
        String req = "insert into article (titre,description,source,contenu,note,dateAjout,dateMAJ) "
                + "values ('" + a.getTitre() + "','" + a.getDescription() + "','" + a.getSource() + "','" + a.getContenu() + "','" + a.getNote() + "','" + a.getDateAjout() + "','" + a.getDateMAJ() + "')";
        try {
            Statement st = cn.createStatement();
            st.executeUpdate(req);
            System.out.println("Article ajouté");

        } catch (SQLException ex) {
            Logger.getLogger(articleServices.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Article> afficherArticle() {
        List<Article> list = new ArrayList<>();
        String req = "select * from Article";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(req);
            while (rs.next()) {
                Article a = new Article();
                a.setIdArticle(rs.getInt(1));
                a.setTitre(rs.getString("titre"));
                a.setDescription(rs.getString("description"));
                a.setSource(rs.getString("source"));
                a.setContenu(rs.getString("contenu"));
                a.setIdArticle(rs.getInt(6));
                a.setDateAjout(rs.getDate("dateAjout"));
                a.setDateMAJ(rs.getDate("dateMAJ"));

                list.add(a);
            }

        } catch (SQLException ex) {
            Logger.getLogger(articleServices.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
    
      public void supprimerArticle(int id) {
        try {
            String req = "delete from article where id=?";
            PreparedStatement pt = cn.prepareStatement(req);
            pt.setInt(1, id);
            pt.executeUpdate();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
      
      
// not so sure ??? 
       public void modifierArticle(Article a, Article nouveauA) {
        //  this.supprimerEspace(local.getId());
        this.ajouterArticle(nouveauA);
    }
      
}
