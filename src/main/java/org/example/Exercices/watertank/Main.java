package org.example.Exercices.watertank;

public class Main {
    public static void main(String[] args) {
        WaterTank watertank1 = new WaterTank(10, 20, 10);//fillLevel maxCapacity weightEmpty
        WaterTank watertank2 = new WaterTank(10, 10, 5);

        System.out.println("Poids total de la citerne 1 : " + watertank1.getTotalWeight());
        System.out.println("Poids total de la citerne 2 : " + watertank2.getTotalWeight());

        System.out.println("----------------------");

        System.out.println("Quantité d'eau dans la citerne 1 : " + watertank1.getFillLevel());
        watertank1.affichageCiterne();
        System.out.println("Quantité d'eau dans la citerne 2 : " + watertank2.getFillLevel());
        watertank2.affichageCiterne();
        System.out.println("Quantité d'eau dans toutes les citernes : " + WaterTank.getTotalFillLevels());

        System.out.println("----------------------");

        int excessWater = watertank1.fill(11);
        System.out.println("Quantité d'eau dans la citerne 1 après ajout de 11 litres: " + watertank1.getFillLevel() + "/" + watertank1.getMaxCapacity());
        System.out.println("Excès d'eau récupéré : " + excessWater);

        int waterTaken = watertank2.empty(11);
        System.out.println("Quantité d'eau dans la citerne 2 après tentative de retrait de 11 litres: " + watertank2.getFillLevel() + "/" + watertank2.getMaxCapacity());
        System.out.println("Quantité d'eau récupérée : " + waterTaken);

        System.out.println("----------------------");

        System.out.println("Quantité d'eau dans la citerne 1 : " + watertank1.getFillLevel());
        watertank1.affichageCiterne();
        System.out.println("Quantité d'eau dans la citerne 2 : " + watertank2.getFillLevel());
        watertank2.affichageCiterne();
        System.out.println("Quantité d'eau dans toutes les citernes : " + WaterTank.getTotalFillLevels());
    }
}
