package main;

import classes.Adresse;
import classes.Enseignant;
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
		
		
		Personne personne3 ;  // agrégation
		
		Adresse adresse3 = new Adresse("Jarvis street","ON M4Y 2H1", "Toronto" );
		personne3 = new Personne(56, "Panda", "Dean", adresse3); 
		System.out.println(personne3);
		System.out.println("Je m'appelle " + personne3.getPrenom() + " et j'habite à " + personne3.getAdresse().getVille() );
		System.out.println(Personne.getNbrPersonnes());
		
		//personne 4
		Personne personne4 = new Personne(4,"DeRomanus", "Marius", new Adresse("Av De Dunkerque","59160", "Rome")); 
		System.out.println("Je m'appelle " + personne4.getPrenom() + " et j'habite à " + personne4.getAdresse().getVille() );
		System.out.println(Personne.getNbrPersonnes());
		
		
		// création classe enseignant / étudiant   --  héritage / extends
		// personne 5 
		Enseignant enseignant = new Enseignant(5, "Green", "Jonas", 1700);
		System.out.println(enseignant); // ce la ne m'affiche que le salaire 
		System.out.println("Hola, ich bin " + enseignant.getPrenom() + " et je gagne " + enseignant.getSalaire() + " €. ");
		System.out.println(Personne.getNbrPersonnes());	 // ▲  mets les getter sont dispo
		// autre manières d'écrire , le teacher2 commence par Personne
		Enseignant teacher1 = new Enseignant(6,"Parker", "Peter", new Adresse("45 Rickefeller Plaza", "NY 10111", "New York"),2500 );
		Personne teacher2 = new Enseignant(7,"Stark", "Tony", new Adresse("sacremento Av", "LA 65213", "Los Angeles"),10500 );
		System.out.println(Personne.getNbrPersonnes());
			
		
	}

}
