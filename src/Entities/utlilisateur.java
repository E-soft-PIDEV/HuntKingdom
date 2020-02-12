/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.Objects;

/**
 *
 * @author Med. Ali
 */
public class utlilisateur {
    
    int id ; 
    String nom ;
    String prenom;
    String adresseMail ;
    int numTel;
    String imagePersonne;
    String imagePermis;

    public utlilisateur() {
    }

    public utlilisateur(String nom, String prenom, String adresseMail, int numTel, String imagePersonne, String imagePermis) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresseMail = adresseMail;
        this.numTel = numTel;
        this.imagePersonne = imagePersonne;
        this.imagePermis = imagePermis;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresseMail() {
        return adresseMail;
    }

    public void setAdresseMail(String adresseMail) {
        this.adresseMail = adresseMail;
    }

    public int getNumTel() {
        return numTel;
    }

    public void setNumTel(int numTel) {
        this.numTel = numTel;
    }

    public String getImagePersonne() {
        return imagePersonne;
    }

    public void setImagePersonne(String imagePersonne) {
        this.imagePersonne = imagePersonne;
    }

    public String getImagePermis() {
        return imagePermis;
    }

    public void setImagePermis(String imagePermis) {
        this.imagePermis = imagePermis;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final utlilisateur other = (utlilisateur) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }


    @Override
    public String toString() {
        return "utlilisateur{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", adresseMail=" + adresseMail + ", numTel=" + numTel + ", imagePersonne=" + imagePersonne + ", imagePermis=" + imagePermis + '}';
    }
    
    
    
    
}
