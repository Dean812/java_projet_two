package classes;

public class SuperAdmin extends Users {

	public SuperAdmin() {
		super();
		// TODO Auto-generated constructor stub
	}
		// enlever ID 
	public SuperAdmin( String nom, String prenom) {
		super( nom, prenom);
		// TODO Auto-generated constructor stub
	}

	public void displayFullName() {
		System.out.println(this.getNom() + " " + this.getPrenom() + " : Je suis le superAdmin");
	};
	
}
