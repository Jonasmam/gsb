package com.gestionnairetaches;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        // Création d'une instance de GestionnaireTaches
        GestionnaireTaches gestionnaireTaches = new GestionnaireTaches();

        // Appel de la méthode ajouterTache() de GestionnaireTaches
        gestionnaireTaches.ajouterTache();

        // Création d'une instance de Tache
        Tache tache = new Tache(1, "Exemple de tâche", 1, new Date());

        // Affichage de la tâche créée
        System.out.println(tache);

        // Exemple de manipulation de date avec SimpleDateFormat
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date = sdf.parse("01/01/2022");
        System.out.println("Date formatée : " + sdf.format(date));
    }
}
