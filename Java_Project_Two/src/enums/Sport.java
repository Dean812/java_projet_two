package enums;

public enum Sport {
	
	// ensemble de constante 
	
//	FOOT,
//	RUGBY,
//	TENNIS,
//	CROSS_FIT,
//	BASKET
	
	
	FOOT("foot",1),
	RUGBY("rugby",7),
	TENNIS("tennis",3),
	CROSS_FIT("cross_fit",4),
	BASKET("basket",6);
	
	private final String nom;
	private final int code;

	Sport(String nom, int code) {
		this.nom = nom;
		this.code = code;
	}
	
	public String getNom() {
		return this.nom;
	}
	public int getCode() {
		return this.code;
	}
	
}
