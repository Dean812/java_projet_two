package tests;

public class Test {

	public static void main(String[] args) {

		//  Step 1 - afficher erreur 
//		int x = 5, y = 0;
//		System.out.println(x/y);
//		System.out.println("Fin de calcul");
		// affiche aritmeticException : / zero
		
		try {
			int x = 5, y = 0;
			System.out.println(x/y);    //si on ne connait pas l'exception
		} catch (ArithmeticException e) {  // just use : Exception e 
			System.out.println("Exception : Division par zéro");
		}
		System.out.println("Fin de calcul");
		
	}

}
