/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Entities.Article;
import Services.articleServices;
import java.sql.Date;

/**
 *
 * @author Med. Ali
 */
public class CrudTest {
        public static  void main(String[] args){
            
            Article a = new Article("sanawnaw", "article about sanawnaw", "google", "the longest text ever", 5, Date.valueOf("2020-5-5"),Date.valueOf("2020-5-5") );
            articleServices as = new articleServices();
     as.ajouterArticle(a);
     
        System.out.println(as.afficherArticle());
            
        }
    
}
