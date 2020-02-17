/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author Admin
 */
public class Publication {
    
    private int id;
    private String contenu;
    private String photo;
    
    public Publication(int id, String contenu, String photo){
        this.id = id;
        this.contenu = contenu;
        this.photo = photo;
    }
    
    public Publication(String contenu, String photo){
        this.contenu = contenu;
        this.photo = photo;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString(){
        return "Publication{" + "id=" + id + ", contenu=" + contenu + ", photo=" + photo + '}';
    }
    
}

