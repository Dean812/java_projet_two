package classes;

public class Personne {

	// class public + attribut private
	private int num;
	private String nom;
	private String prenom;

	public Personne() {
		super();
	}
	
	// constructeur auto généré - using fields
	public Personne(int num, String nom, String prenom) {
		super();
//		if (num < 1) {
//			System.out.println("il est interdit de mettre une valeur négative");
//		} else { // pour respectuer la cohérence, on met le if comme au setter
//			this.num = num;
//		}           du coup, on peut ré écrire comme ci dessus ▲
		this.setNum(num); //   ou juste appelé la méthode setNum()
		this.nom = nom;
		this.prenom = prenom;
	}

	// constructeur.s accesseurs
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

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	// construction du toString pour l'affiche de l'objet sysout(Personne1)
	@Override
	public String toString() {
		return "Personne [num=" + num + ", nom=" + nom + ", prenom=" + prenom + "]";
	}

}
