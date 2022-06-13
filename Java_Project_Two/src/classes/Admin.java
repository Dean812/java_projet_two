package classes;

public class Admin extends Users {

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
		// enlever ID !!
	public Admin( String nom, String prenom) {
		super( nom, prenom);
		// TODO Auto-generated constructor stub
	}

	public void displayFullName() {
		System.out.println(this.getNom() + " " + this.getPrenom() + " : Je suis l'admin");
	};
	
	
}
