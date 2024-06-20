package org.example.Exercices.plante;

public class Main {
    public static void main(String[] args) {
        Plante plante = new Plante("Fleur", 0.5, "Vert");
        plante.afficher();

        System.out.println();

        Arbre arbre = new Arbre("Chêne", 10, "Vert", 1.2);
        System.out.println(arbre);
    }
}
