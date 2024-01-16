package exercice11;


import java.util.Random;
import java.util.Scanner;

public class SeqOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la taille du tableau : ");
        int taille = scanner.nextInt();
        int[] tab = new int[taille];
        Random random = new Random();
        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(2);
        }
        int longueurSequence = 0;
        int nombreSequences = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == 1) {
                longueurSequence++;
            } else {
                 (longueurSequence > 0) {
                    nombreSequences++;
                    System.out.println("Séquence de 1 de longueur " + longueurSequence);
                    
                }
            }
        }
    }
    
}


