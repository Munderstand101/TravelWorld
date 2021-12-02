
public class Voyage {

	private String referenceVoyage;
	private String libelleVoyage;
	
	public Voyage(String preferenceVoyage, String plibelleVoyage) {
		this.referenceVoyage = preferenceVoyage;
		this.libelleVoyage = plibelleVoyage;
	}


	public void afficher()
	{
		System.out.println("Reference Voyage :"+this.referenceVoyage);
		System.out.println("Libelle Voyage :"+this.libelleVoyage);
	}

}
