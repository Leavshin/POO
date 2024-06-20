package org.example.Exercices.joueur;

public class Joueur {
    // Attributs
    private String nom;
    private int niveau;
    private int points;

    // Constructeur
    public Joueur(String nom, int niveau, int points) {
        this.nom = nom;
        this.niveau = niveau;
        this.points = points;
    }

    // Getters
    public String getNom() {
        return nom;
    }
    public int  getNiveau() {
        return niveau;
    }
    public int getPoints() {
        return points;
    }

    // Setters
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setNiveau(int  niveau) {
        this.niveau = niveau;
    }
    public void setPoints(int points) { this.points = points; }

    // Méthode pour effectuer une quête
    public void effectuerUneQuete() {
        this.points += 10;
        System.out.println("Le joueur " + nom + " a effectué une quête et gagné 10 points d'expérience.");
    }

    // Méthode pour vérifier le niveau
    public void verifierNiveau() {
        if (this.points >= 100) {
            this.niveau += 1;
            this.points = 0;
            System.out.println("Le joueur " + nom + " passe au niveau : " + this.niveau);
        }
    }

    // Méthode toString pour afficher les informations du joueur
    @Override
    public String toString() {
        return "Le joueur " + nom + "', niveau=" + niveau + ", pointsExperience=" + points + "}";
    }
}
