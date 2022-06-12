package classes;

public class Personne {

	private int num;
	private String nom;
	private String prenom;
	private static int nbrPersonnes; //  compteur tout le tps prit en comte

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
		return "Personne [num=" + num + ", nom=" + nom + ", prenom=" + prenom + "]";
	}

	
}
