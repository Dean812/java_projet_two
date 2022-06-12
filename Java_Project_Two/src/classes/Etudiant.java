package classes;

public class Etudiant extends Personne {

	private String niveau;
	
	public Etudiant() {
		// TODO Auto-generated constructor stub
	}

	public Etudiant(String niveau) {
		super();
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
		return "Etudiant [niveau=" + niveau + "]";
	}

	
}
