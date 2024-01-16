package exercice8;


mport java.util.Scanner;

public class StringToInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez une chaîne de caractères correspondant à un entier : ");
        String str = scanner.nextLine();
        int entier = 0;
            char c = str.charAt(i);
            if (!Character.isDigit(c)) {
                System.out.println("La chaîne de caractères saisie ne correspond pas à un entier.");
                System.out.println("Veuillez saisir une chaîne de caractères correspondant à un entier.");
                return;
            }
            int chiffre = Character.getNumericValue(c);
            entier = entier
        }
        System.out.println("L'entier correspondant à la chaîne de caractères est : " + entier);
    }
}