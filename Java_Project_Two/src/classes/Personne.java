package classes;

public class Personne {

	// class public + attribut public
	 public int num;
	 public String nom;
	 public String prenom;
	
	// construction du toString pour l'affiche de l'objet sysout(Personne1)
	 @Override
	public String toString() {
		return "Personne [num=" + num + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	
}
