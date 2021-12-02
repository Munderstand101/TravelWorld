
public class Sejour extends Voyage {

	public String lieuSejour;
	
	public Sejour(String referenceVoyage, String libelleVoyage, String lieuSejour) {
		super(referenceVoyage, libelleVoyage);
		this.lieuSejour = lieuSejour;
	}

	
	public void afficher()
	{
		super.afficher();
		System.out.println("Lieu Sejour :"+this.lieuSejour);
	}
}
