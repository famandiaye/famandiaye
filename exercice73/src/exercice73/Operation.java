package exercice73;

import java.util.Scanner;
public class Operation {
	// TODO Auto-generated constructor stub
	public Operation(String date,int montant) {
	 this.date = date;
	 this.montant = montant;
	}
	public Operation(String date,int montant) {
		 this.date = date date du jour;
		 this.montant = montant;
	}

public static void main(String[] args) {
    Operation[] operations = new Operation[50];
    for (int i = 0; i < operations.length; i++) {
        operations[i] = new Operation("Opération " + (i+1), 0.00);
    }
    Scanner scanner = new Scanner(System.in);
    int choix;
    while (choix != 0) {
        System.out.println("Menu :");
        System.out.println("0. Quitter");
        System.out.println("1. Voir les opérations");
        System.out.println("2. Ajouter une opération");
        System.out.print("Votre choix : ");
        choix = scanner.nextInt();
     
        }
    }

 /* l'option 1 nous aide a voir les operateurs.
  pour demandez a l'utilisateurles information necessaire pour creer un objet
  Operation il faut choisire l'optrion 2.*/

  public void setOption2() {
	  this.option2 = option;
  }

}


