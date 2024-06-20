package org.example.Exercices.plante;

public class Arbre extends Plante {
    private double circonferenceTronc;

    public Arbre(String nom, double hauteur, String couleurFeuilles, double circonferenceTronc) {
        super(nom, hauteur, couleurFeuilles);
        this.circonferenceTronc = circonferenceTronc;
    }

    public double getCirconferenceTronc() {
        return circonferenceTronc;
    }

    public void setCirconferenceTronc(double circonferenceTronc) {
        this.circonferenceTronc = circonferenceTronc;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Circonférence du tronc: " + circonferenceTronc + " mètres");
    }

    //@Override
    //public String toString() {
    //    return super.toString() + "\nCirconférence du tronc: " + circonferenceTronc + " mètres";
    //}
}
