package exercice3;


class Personne {
	String prenom;
	String nom;
	private int age;
	static int nbPersonnes = 0;
	
 public Personne(String p, String n, int a){
	prenom = p;
	nom = n;
	age = a;
	nbPersonnes++;
 }
 public void affichePersonne1(){
	System.out.println(prenom+" "+nom+" a "+age+" ans");
  }
}
	public class ProgPrincipal {
		
		public static void main(String[] args){
			Personne p1 = new Personne("Jean", "Durand", 25);
			Personne p2 = new Personne("Patrick", "Martin", 30);
			
			p1.affichePersonne1();
			p2.affichePersonne1();
			
			System.out.println(Personne.nbPersonnes);
			System.out.println(p1.prenom);
		}
	}
	//la methode affichePersonne affiche le prenom,nom et l'age de chaque personne
	 

		  public int getAge() {
		    return age;
		  }
		}

		public class ProgrammePrincipal {
		  public static void main(String args[]) {
		  Personne  p1 = new Personne("Durant", "Genre", 25);
		    System.out.println(p1.prenom);
		    System.out.println(p1.nom);
		    System.out.println(p1.getAge());
		  }
		}
		public static void anniversaire(personne p) {
			int age
		}
		public static void main(String args[]) {
			personne("durand,"jean",25);
				System.out.println(p1.getAge);
		}
		class Personne{
			string prenom;
		string nom;
		private int age;
		static int nbPersonnes = 0;
	public Personne(String p, String n, int a){
		prenom = p;
		nom = n;
		age = a;
		nbPersonnes++;
		}
		}
	public class ProgPrincipal {
	 public static void main(String[] args){
		Personne p1 = new Personne("Jean", "Durand", 25);
		System.out.println(p1);
		
	 }
		
	}
	//le programme va afficher le nom,prenom et l'age de la personne1
	
	class Personne {
		String prenom;
		String nom;
		private int age;
	 static int nbPersonnes = 0;
	public Personne(String p, String n, int a){
		prenom = p;
		nom = n;
		age = a;
		nbPersonnes++;
		}
		public String toString(){
		return (prenom+" "+nom+" a "+age+" ans");
		}
		}
	public class ProgPrincipal {
	 public static void main(String[] args){
		Personne p1 = new Personne("Jean", "Durand", 25);
		System.out.println(p1);
	 }
	}
	//le programme affiche les information de la personne 1
	
	
