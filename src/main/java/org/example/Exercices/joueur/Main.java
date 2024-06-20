package org.example.Exercices.joueur;

public class Main {
    public static void main(String[] args) {
        // Création des objets Joueur
        Joueur joueur1 = new Joueur("Alice", 1, 90);
        Joueur joueur2 = new Joueur("Bob", 2, 110);

        // Affichage des informations des joueurs avant les quêtes
        System.out.println(joueur1);
        System.out.println(joueur2);

        // Effectuer des quêtes
        joueur1.effectuerUneQuete();
        joueur2.effectuerUneQuete();

        // Vérifier le niveau après les quêtes
        joueur1.verifierNiveau();
        joueur2.verifierNiveau();

        // Affichage des informations des joueurs après les quêtes
        System.out.println(joueur1);
        System.out.println(joueur2);
    }
}