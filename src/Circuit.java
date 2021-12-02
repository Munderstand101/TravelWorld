
public class Circuit extends Voyage {

	public final static int MAX = 10;
	public boolean enAutonomie;
	public Etape[] lesEtapes;
	public int nbEtape = 0;
	
	public Circuit(String preferenceVoyage, String plibelleVoyage, boolean enAutonomie) {
		super(preferenceVoyage, plibelleVoyage);
		this.enAutonomie = enAutonomie;
		lesEtapes = new Etape[MAX];
	}
	
	public void afficher()
	{
		super.afficher();
		System.out.println("En autonomie :"+this.enAutonomie);
		System.out.println("-----------------");
		
		for (int i =0; i<nbEtape; i++)
		{ 
			lesEtapes[i].afficher();
		}
		
		/*for (Etape lEtapes:lesEtapes)
		{
			lEtapes.afficher();
		}*/
	}
	
	public void ajouterEtape(Etape letape)//(int numeroEtape, String lieuEtape, int dateEtape)
	{
		if (nbEtape<MAX)
		{
			this.lesEtapes[nbEtape]=letape;
			nbEtape++;
		}
		
		/*int nbEtape = derniereEtape+1;
		Etape letape = new Etape(nbEtape, lieuEtape, dateEtape);
		lesEtapes[nbEtape]= letape;*/
	}

	
	
}
