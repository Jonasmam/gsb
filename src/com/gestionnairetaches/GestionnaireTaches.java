package com.gestionnairetaches;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class GestionnaireTaches {

    private Scanner scanner = new Scanner(System.in); // Déclaration de scanner au début
    private List<Tache> listeTaches = new ArrayList<>();
    public void ajouterTache() {
        System.out.println("**Ajouter une tâche**");
        System.out.println("Numéro : ");
        int numero = scanner.nextInt();
        System.out.println("Description : ");
        scanner.nextLine();
        String description = scanner.nextLine();
        System.out.println("Statut (0/1) : ");
        int statut = scanner.nextInt();

        SimpleDateFormat sdf = new SimpleDateFormat("27/12/2001");
        Date dateLimite = null;


        try {
            System.out.println("Date limite (27/12/2001) : ");
            String dateStr = scanner.next();
            dateLimite = sdf.parse(dateStr);
        } catch (ParseException e) {
            System.out.println("Erreur de format de date. Veuillez saisir une date au format jj/mm/aaaa.");
            // Demander à l'utilisateur de resaisir la date
        }

        Tache tache = new Tache(numero, description, statut, dateLimite);
        listeTaches.add(tache);
        System.out.println("Tâche ajoutée avec succès!");
    }
}
