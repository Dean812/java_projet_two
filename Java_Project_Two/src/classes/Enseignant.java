package classes;

public class Enseignant extends Personne {

	private double salaire;

	public Enseignant() {
		// TODO Auto-generated constructor stub
	}

	// qd on add constructeur using field , le premier chiox est une barre déroulante
	// elle permet de choisir différent constructeur
	public Enseignant(int num, String nom, String prenom, double salaire) {
		super(num, nom, prenom);
		this.salaire = salaire;
	}
	// exemple de ce constructeur avec teacher
	public Enseignant(int num, String nom, String prenom, Adresse adresse, double salaire) {
		super(num, nom, prenom, adresse);
		this.salaire = salaire;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	@Override
	public String toString() {
		return "Enseignant [salaire=" + salaire + "]";
	}

}
