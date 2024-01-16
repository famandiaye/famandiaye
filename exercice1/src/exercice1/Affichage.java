package exercice1;

public class Test {
	public static void echange(int i,int j) {
		int aux=i;
		i=j;
		j=aux;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		int b=2;
        echange(a,b);
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		/*le programme affiche
		 a=1
		 b=2
		 */
		
	}

}
