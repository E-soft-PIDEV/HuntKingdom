/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author malik
 */
public class Commentaire {
    private int id,id_user,id_pb ;
    private String contenu ; 

    public Commentaire(int id, int id_user, int id_pb, String contenu) {
        this.id = id;
        this.id_user = id_user;
        this.id_pb = id_pb;
        this.contenu = contenu;
    }

    public int getId() {
        return id;
    }

    public int getId_user() {
        return id_user;
    }

    public int getId_pb() {
        return id_pb;
    }

    public String getContenu() {
        return contenu;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public void setId_pb(int id_pb) {
        this.id_pb = id_pb;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public Commentaire() {
    }

        
    
    
    
    
}
