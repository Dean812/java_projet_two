package main;

import classes.Personne;

public class Main {

	public static void main(String[] args) {
		
		// importer Personne  - class personne en public
//		Personne personne1 = new Personne();
//
//		personne1.num = 1;
//		personne1.nom = "Wick";
//		personne1.prenom = "John";
//		
//		System.out.println(" Hi, i'm " + personne1.prenom + " " + personne1.nom + " and i am number " + personne1.num );
//		System.out.println(personne1); // affichera Classes.Personne@15db9742 si le toString n'est pas construit dans la classe Personne
		//        class public  ▲ 
		
		Personne personne1 = new Personne();
		
		// en private ▼ 
		personne1.setNum(1); // si on met 0, la méthode va renvoyer le message d'erreur
		personne1.setNom("Noel");
		personne1.setPrenom("Bernie");
		
		System.out.println("Salut ! Moi c'est " + personne1.getPrenom() + " " + personne1.getNom() + " and i am number " + personne1.getNum() );
		System.out.println(personne1);
	}

}
