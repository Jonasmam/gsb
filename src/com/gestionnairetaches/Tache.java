package com.gestionnairetaches;
import java.io.Serializable;
import java.util.Date;
public class Tache implements Serializable {


    private static final long serialVersionUID = 1L;

    private int numero;
    private String description;
    private int statut;
    private Date dateLimite;

    public Tache(int numero, String description, int statut, Date dateLimite) {
        this.numero = numero;
        this.description = description;
        this.statut = statut;
        this.dateLimite = dateLimite;
    }



    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStatut() {
        return statut;
    }

    public void setStatut(int statut) {
        this.statut = statut;
    }

    public Date getDateLimite() {
        return dateLimite;
    }

    public void setDateLimite(Date dateLimite) {
        this.dateLimite = dateLimite;
    }

    @Override
    public String toString() {
        return "Tâche n°" + numero + " : " + description + " (" + (statut == 1 ? "Fini" : "Non fini") + ") - Date limite : " + dateLimite;
    }
}
