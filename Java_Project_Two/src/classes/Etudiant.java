package classes;

public class Etudiant extends Personne {

	private String niveau;

	public Etudiant() {
		// TODO Auto-generated constructor stub
	}

	public Etudiant(int num, String nom, String prenom, String niveau) {
		super(num, nom, prenom);
		this.niveau = niveau;
	}

	public Etudiant(int num, String nom, String prenom, Adresse adresse, String niveau) {
		super(num, nom, prenom, adresse);
		this.niveau = niveau;
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

	@Override
	public String toString() {
		return super.toString() + "Etudiant [niveau=" + niveau + "]";
	}

}
