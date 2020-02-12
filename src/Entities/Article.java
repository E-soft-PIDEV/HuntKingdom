/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.sql.Date;

/**
 *
 * @author Med. Ali
 */
public class Article {
    
    int IdArticle;
    String titre;
    String description;
    String source;
    String contenu;
    int note;
    Date dateAjout;
    Date dateMAJ;

    public Article() {
    }

    public Article(String titre, String description, String source, String contenu, int note, Date dateAjout, Date dateMAJ) {
        this.titre = titre;
        this.description = description;
        this.source = source;
        this.contenu = contenu;
        this.note = note;
        this.dateAjout = dateAjout;
        this.dateMAJ = dateMAJ;
    }
    
    

    public int getIdArticle() {
        return IdArticle;
    }

    public void setIdArticle(int IdArticle) {
        this.IdArticle = IdArticle;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public Date getDateAjout() {
        return dateAjout;
    }

    public void setDateAjout(Date dateAjout) {
        this.dateAjout = dateAjout;
    }

    public Date getDateMAJ() {
        return dateMAJ;
    }

    public void setDateMAJ(Date dateMAJ) {
        this.dateMAJ = dateMAJ;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + this.IdArticle;
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
        final Article other = (Article) obj;
        if (this.IdArticle != other.IdArticle) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Article{" + "titre=" + titre + ", description=" + description + ", source=" + source + ", contenu=" + contenu + ", note=" + note + ", dateAjout=" + dateAjout + ", dateMAJ=" + dateMAJ + '}';
    }
    
    
    
}
