package main;

import classes.Adresse;
import classes.Personne;

public class Main {

	public static void main(String[] args) {

		Personne personne1 = new Personne();

		personne1.setNum(1);
		personne1.setNom("Noel");
		personne1.setPrenom("Bernie");

		System.out.println("Salut ! Moi c'est " + personne1.getPrenom() + " " + personne1.getNom() + " and i am number "
				+ personne1.getNum());
		System.out.println(personne1);

		Personne personne2 = new Personne(2, "Wick", "John");

		System.out.println("Salut ! Moi c'est " + personne2.getPrenom() + " " + personne2.getNom() + " and i am number "
				+ personne2.getNum());
		System.out.println(personne2);

		System.out.println(Personne.getNbrPersonnes());
		
		
		// instance d'une personne et d'une adresse
		// insérer l'adresse dans la personne 
		
		Personne personne3 ;
		Adresse adresse3 = new Adresse("Jarvis street","ON M4Y 2H1", "Toronto" );
		personne3 = new Personne(56, "Panda", "Dean", adresse3); 
		System.out.println(personne3);
		System.out.println("Je m'appelle " + personne3.getPrenom() + " et j'habite à " + personne3.getAdresse().getVille() );
		System.out.println(Personne.getNbrPersonnes());
		
		Personne personne4 = new Personne(4,"DeRomanus", "Marius", new Adresse("Av De Dunkerque","59160", "Rome")); 
		System.out.println("Je m'appelle " + personne4.getPrenom() + " et j'habite à " + personne4.getAdresse().getVille() );
		System.out.println(Personne.getNbrPersonnes());
	}

}
