import java.sql.Date;

public class Reservation {
	
	private static int dernierNbRese = 0;
	private int numReservation;
	private java.util.Date dateDepart;
	private java.util.Date dateRetour;
	private boolean estPaye;

	private Voyage leVoyage;
	
	public Reservation(java.util.Date dd1, java.util.Date dr1, boolean estPaye, Voyage leVoyage) {
		this.dateDepart = dd1;
		this.dateRetour = dr1;
		this.estPaye = estPaye;
		this.leVoyage = leVoyage;
		dernierNbRese++;
		this.numReservation=dernierNbRese;
	}

	public void afficher() {
		System.out.println("Numero reservation : " + this.numReservation);
		System.out.println("Reservation pay� : " + this.estPaye);
		System.out.println("dateDepart : " + this.dateDepart);
		System.out.println("dateRetour : " + this.dateRetour);
		System.out.println("---------------------------------");
		this.leVoyage.afficher();
	}
	

	public java.util.Date getDateDepart() {
		return dateDepart;
	}

	public void setDateDepart(java.util.Date dateDepart) {
		this.dateDepart = dateDepart;
	}

	public java.util.Date getDateRetour() {
		return dateRetour;
	}

	public java.util.Date setDateRetour(java.util.Date dateRetour) {
		return this.dateRetour = dateRetour;
	}

}
