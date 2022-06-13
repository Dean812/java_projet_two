package main;

import classes.Admin;
import classes.Adresse;
import classes.Enseignant;
import classes.Etudiant;
import classes.Personne;
import classes.SuperAdmin;
import classes.Users;
import enums.Sport;

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

		Personne personne3; // agrégation

		Adresse adresse3 = new Adresse("Jarvis street", "ON M4Y 2H1", "Toronto");
		personne3 = new Personne(56, "Panda", "Dean", adresse3);
		System.out.println(personne3);
		System.out.println(
				"Je m'appelle " + personne3.getPrenom() + " et j'habite à " + personne3.getAdresse().getVille());
		System.out.println(Personne.getNbrPersonnes());

		// personne 4
		Personne personne4 = new Personne(4, "DeRomanus", "Marius", new Adresse("Av De Dunkerque", "59160", "Rome"));
		System.out.println(
				"Je m'appelle " + personne4.getPrenom() + " et j'habite à " + personne4.getAdresse().getVille());
		System.out.println(Personne.getNbrPersonnes());

		// création classe enseignant / étudiant -- héritage / extends
		// personne 5
		Enseignant enseignant = new Enseignant(5, "Green", "Jonas", 1700);
		System.out.println(enseignant); // ce la ne m'affiche que le salaire
		System.out.println(
				"Hola, ich bin " + enseignant.getPrenom() + " et je gagne " + enseignant.getSalaire() + " €. ");
		System.out.println(Personne.getNbrPersonnes()); // ▲ mets les getter sont dispo

		// personne 6 et 7 - teacher
		Enseignant teacher1 = new Enseignant(6, "Parker", "Peter",
				new Adresse("45 Rickefeller Plaza", "NY 10111", "New York"), 2500);
		Personne teacher2 = new Enseignant(7, "Stark", "Tony", new Adresse("sacremento Av", "LA 65213", "Los Angeles"),
				10500);
		// personne 8 et 9 - student
		Etudiant student1 = new Etudiant(8, "Johanson", "Scarlette",
				new Adresse("Rue Piotr", "5qs88", "St Petersbourg"), "Suprême");
		Etudiant student2 = new Etudiant(9, "Murray", "Bill", new Adresse("NY street", "PT 32548", "Punxsutawney"),
				"Ultra");
		System.out.println("----------------------exercice tableau +  foreach------------------------------------");
		// exercice 
		Personne[] personnes = { teacher1, teacher2, student1, student2 };

		for (Personne sumup : personnes) {
			System.out.println(sumup.getNom());
			if (sumup instanceof Enseignant) {
				System.out.println("   " + ((Enseignant) sumup).getSalaire());
			} else {
				System.out.println("   " + ((Etudiant) sumup).getNiveau());
			}
		}
		System.out.println("--------------function final affichenomcomplet dans class Personne-------------------");
		
		// fonction final effectuer dans personne : affiche nom complet
				student2.afficherNomComplet();
				
		System.out.println("----------------------Interface--------------------------");
		// 2 méthodes viennent de l'interface, insérer dans Personne
		// elles ont été modifiées pour que soit le nom soit le prénom ( au choix) passe en majuscule
		
		student1.afficherNomMajuscule();
		student1.afficherPrenomMajuscule();
		teacher1.afficherNomComplet2("Carrey", "Jim", adresse3);
		
		System.out.println("----------------------Enum--------------------------");
		
//		Sport sport = Sport.BASKET;
//		System.out.println(sport);
		
		Sport sport = Sport.TENNIS;
		System.out.println(sport.getCode() + " < code | sport > " + sport.getNom());
		
		System.out.println(sport.ordinal()); // affiche 2 , tennis est bien en position 2.
		
		System.out.println(Sport.values()[3]); // affiche le nom de la valeur demander
		
		System.out.println("----------------------class Abstract - (super)Admin--------------------------");
	
		Admin admin = new Admin("Winchester", "Sam");
		admin.displayFullName();
		SuperAdmin sAdmin = new SuperAdmin("Winchester", "Dean");
		sAdmin.displayFullName();
		
	}
}
