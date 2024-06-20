package org.example.Exercices.chaise;

public class Chaise {
    // Variables d'instance
    private int nombrePieds;
    private String materiaux;
    private String couleur;
    private double prix;

    // Constructeur par défaut
    public Chaise() {
        this.nombrePieds = 4;
        this.materiaux = "bois";
        this.couleur = "verte";
        this.prix = 50.0;
    }

    // Constructeur avec paramètres
    public Chaise(int nombrePieds, String materiaux, String couleur, double prix) {
        this.nombrePieds = nombrePieds;
        this.materiaux = materiaux;
        this.couleur = couleur;
        this.prix = prix;
    }

    // Surcharge de la méthode pour afficher les informations
    @Override
    public String toString() {
        return "C'est une chaise avec " + nombrePieds + " pied(s) en " + materiaux +
                ", de couleur " + couleur + ", à un prix de " + prix + " euros.";
    }
}
