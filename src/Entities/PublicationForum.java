/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.sql.Timestamp;

/**
 *
 * @author malik
 */
public class PublicationForum {
    private int id_pb ;
    private int id_user ;
    private String titre ;
    private String contenu ;
    private String theme ; 
    private Timestamp Posted_in;


    public PublicationForum(int id_pb, int id_user, String titre, String contenu, String theme,Timestamp Posted_in) {
        this.id_pb = id_pb;
        this.id_user = id_user;
        this.titre = titre;
        this.contenu = contenu;
        this.theme = theme;
        this.Posted_in= Posted_in;
    }
    public PublicationForum(  String titre, String contenu, String theme) {
        
        this.titre = titre;
        this.contenu = contenu;
        this.theme = theme;
        
    }

    public PublicationForum() {
    }

    public int getId_pb() {
        return id_pb;
    }

    public int getId_user() {
        return id_user;
    }

    public String getTitre() {
        return titre;
    }

    public String getContenu() {
        return contenu;
    }

    public String getTheme() {
        return theme;
    }

    public void setId_pb(int id_pb) {
        this.id_pb = id_pb;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public Timestamp getPosted_in() {
        return Posted_in;
    }

    public void setPosted_in(Timestamp Posted_in) {
        this.Posted_in = Posted_in;
    }

    @Override
    public String toString() {
        return "PublicationForum{" + "id_pb=" + id_pb + ", id_user=" + id_user + ", titre=" + titre + ", contenu=" + contenu + ", theme=" + theme + ", Posted_in=" + Posted_in + '}';
    }
    

   
    
    
    
}
