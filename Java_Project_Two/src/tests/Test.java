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
			System.out.println(x/y);    
		} catch (ArithmeticException e) { 
		//	System.out.println("Exception : " + e.getMessage());
			e.printStackTrace(); // Le message présente l'erreur et sa ligne 
		}					
		System.out.println("Fin de calcul");
		
	}

}
