package exercice71;
import	java.util.*;
public class Compte {
  int numero;
  String typeCompte;
  double solde;
  int codeSecret;
  //constructeur par defaut:
  
public Compte() {
   this.numero = 999999;
	this.typeCompte = " ";
	this.solde = 0;
	this.codeSecret = 0;
	}
//methode:

 public void attribuerCodeSecret() {
	
	Object math;
	int codeSecret = (int)(math.random*9899+100);
 }
 
 //constructeur sur charge:
 
 public Compte(int numero, String typeCompte, double solde) {
	    this.numero = numero;
	    if (typeCompte.equals("D") || typeCompte.equals("E")) {
	        this.typeCompte = typeCompte;
	    } else {
	        this.typeCompte = " ";
	    }
	    this.solde = solde;
	    this.codeSecret = 0;
 }
//modificateurs seteurs:
	    

public void setNumero(int numero) {
    this.numero = numero;
}

public void setTypeCompte(String typeCompte) {
    this.typeCompte = typeCompte;
}

//accesseurs geteurs:


public void getNumero(int numero) {
    this.numero = numero;
}

public void getTypeCompte(String typeCompte) {
    this.typeCompte = typeCompte;
}


}
