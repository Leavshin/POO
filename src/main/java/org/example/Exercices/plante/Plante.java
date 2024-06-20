package org.example.Exercices.plante;

public class Plante {
    private String nom;
    private double hauteur;
    private String couleurFeuilles;

    public Plante(String nom, double hauteur, String couleurFeuilles) {
        this.nom = nom;
        this.hauteur = hauteur;
        this.couleurFeuilles = couleurFeuilles;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getHauteur() {
        return hauteur;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }

    public String getCouleurFeuilles() {
        return couleurFeuilles;
    }

    public void setCouleurFeuilles(String couleurFeuilles) {
        this.couleurFeuilles = couleurFeuilles;
    }

    public void afficher() {
        System.out.println("Nom: " + nom);
        System.out.println("Hauteur: " + hauteur + " mètres");
        System.out.println("Couleur des feuilles: " + couleurFeuilles);
    }
}
