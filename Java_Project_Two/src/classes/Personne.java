package classes;

import interfaces.IMiseEnForme;

public class Personne implements IMiseEnForme{

	private int num;
	private String nom;
	private String prenom;
	private static int nbrPersonnes;
	private Adresse adresse; // class agrégation ajouter

	public Personne() {
		super();
		nbrPersonnes++;
	}

	public Personne(int num, String nom, String prenom) {
		super();
		nbrPersonnes++;
		this.setNum(num);
		this.nom = nom;
		this.prenom = prenom;
	}

	public Personne(int num, String nom, String prenom, Adresse adresse) {
		super(); // nouveau constructeur lié à adresse
		nbrPersonnes++;
		this.setNum(num);
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		if (num < 1) {
			System.out.println("il est interdit de mettre une valeur négative");
		} else {
			this.num = num;
		}
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public static int getNbrPersonnes() {
		return nbrPersonnes;
	}

	public static void setNbrPersonnes(int nbrPersonnes) {
		Personne.nbrPersonnes = nbrPersonnes;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Personne [num=" + num + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + "]";
	}
	
	// Classe final , fonction directement utilisable dans main
	public final void afficherNomComplet() {
		System.out.println(this.getPrenom() + "  " + this.getNom());
	}

	public void afficherNomMajuscule() {
		System.out.println(nom.toUpperCase());
	}				// le nom vient directement de l'attribut

	public void afficherPrenomMajuscule() {
		System.out.println(prenom.toUpperCase());
					// prenom < attribut
	}
	//     surcharge plus compléte + value de l'interface 
	public void afficherNomComplet2(String nom, String prenom, Adresse adresse) {
		System.out.println(nom.toUpperCase() + " " + prenom.toUpperCase() + " + value : " + VALUE);
	}



}
