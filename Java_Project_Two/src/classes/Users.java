package classes;

public abstract class Users {
	
	private int id;
	private String nom;
	private String prenom;
	private static int count;
	
	public Users() {
		super();
		count++;
	}

	public Users( String nom, String prenom) { // enlever ID <<<
		super();
		this.id = count++;
		this.nom = nom;
		this.prenom = prenom;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Users.count = count;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	public abstract void displayFullName(); // méthode abstraite 

}
