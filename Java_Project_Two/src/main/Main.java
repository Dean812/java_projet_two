package main;

import classes.Personne;

public class Main {

	public static void main(String[] args) {
		
		
		Personne personne1 = new Personne(); // run grace a public personne(){super()}
		
		// en private ▼ 
		personne1.setNum(1); // si on met 0, la méthode va renvoyer le message d'erreur
		personne1.setNom("Noel");
		personne1.setPrenom("Bernie");
		
		System.out.println("Salut ! Moi c'est " + personne1.getPrenom() + " " + personne1.getNom() + " and i am number " + personne1.getNum() );
		System.out.println(personne1);
		
		Personne personne2 = new Personne(2, "Wick", "John");
		
		System.out.println("Salut ! Moi c'est " + personne2.getPrenom() + " " + personne2.getNom() + " and i am number " + personne2.getNum() );
		System.out.println(personne2);
		
		System.out.println(Personne.getNbrPersonnes()); // valeur 2
		// sum up : via l'attribut en private statique insérer dans les constructeurs adéquats
		// la valeur s'incrémente des qu'un objet est utilisé (ici personne1 et 2)
		
		
	}

}
