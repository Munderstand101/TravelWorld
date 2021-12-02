
public class Etape {
	public int numeroEtape;
	public String lieuEtape;
	public int dateEtape;
	
	
	public Etape(int numeroEtape, String lieuEtape, int dateEtape) {
		this.numeroEtape = numeroEtape;
		this.lieuEtape = lieuEtape;
		this.dateEtape = dateEtape;
	}
	
	public void afficher()
	{
		System.out.println("Numero etape :"+this.numeroEtape);
		System.out.println("Lieu etape :"+this.lieuEtape);
		System.out.println("Date etape :"+this.dateEtape);
		System.out.println("--------------------");
	}
}
