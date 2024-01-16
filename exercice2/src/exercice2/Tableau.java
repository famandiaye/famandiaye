package exercice2;

public class Tableau {

	public static int[] creeTableau(int n) {
		int[]tab=new int[n];
		for(int i =0;i<=n;i++) {
			tab[i]=i+1
		}
	}
	public static int somme(int[] tab) {
		  int som = 0;
		  for (int i = 0; i < tab.length; i++) {
		    som += tab[i];
		  }
		  
	} 
	public static void incremente(int[] tab) {
	for (int i = 0; i < tab.length; i++) {
	    tab[i]++;
	}
 }
	
}

/*la methode echange de l'exercice1 echange des valeurs tandisque la methode
  incremente ajoute 1 a chaque element d'un tableau */
