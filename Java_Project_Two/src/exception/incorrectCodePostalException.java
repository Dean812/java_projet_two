package exception;

public class incorrectCodePostalException extends Exception{

	public incorrectCodePostalException() { //Message d'erreur construit pret à l'emploi 
		System.out.println("Le code postal doit contenir exactement 11 caractères");
	}
	
}
