package exercice9

import java.util.Scanner;

public class InvertString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez une chaîne de caractères : ");
        String nom = scanner.nextLine();
        StringBuilder builder = new StringBuilder(nom);
        builder = builder.reverse();
        System.out.println("L'inversion de cette chaîne donne : mon" );
    }
}