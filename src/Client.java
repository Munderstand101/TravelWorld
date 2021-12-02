

import java.util.*;

public class Client {
	
	private static int dernierNbCient = 0;
	private int numCient;
	private String nom;
	private String prenom;
	private ArrayList<Reservation> lesReservations;
	
	public Client(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
		this.lesReservations = new ArrayList<Reservation>();
		dernierNbCient++;
		this.numCient = dernierNbCient;
	}
	
	public void afficher() {
		System.out.println("num client : " + this.numCient);
		System.out.println("nom client : " + this.nom);
		System.out.println("prenom client : " + this.prenom);
		for (int i=0;i<lesReservations.size();i++) {
			lesReservations.get(i).afficher();
		}
	}
	
	public void afficherListeResaPassees() {
		System.out.println("--------------Passees-------------------");
		Date actuelle = new Date();
		for (Reservation laReservation:lesReservations) {
			if (laReservation.getDateRetour().before(actuelle)) {
				laReservation.afficher();
			}
		}
	}
	
	public void afficherListeResaEnCours() {
		System.out.println("--------------EnCours-------------------");
		Date actuelle = new Date();
		for (Reservation laReservation:lesReservations) {
			if (laReservation.getDateDepart().before(actuelle) && laReservation.getDateRetour().after(actuelle)) {
				laReservation.afficher();	
			}
		}
	}
	
	public void afficherListeResaAVenir() {
		System.out.println("--------------AVenir-------------------");
		Date actuelle = new Date();
		for (Reservation laReservation:lesReservations) {
			if (laReservation.getDateDepart().after(actuelle)) {
				laReservation.afficher();
			}
		}
	}
	
	public void ajouterReservation(Reservation uneReservation)
	{
		this.lesReservations.add(uneReservation);
	}
	
	
	public int getNumCient() {
		return numCient;
	}

	public void setNumCient(int numCient) {
		this.numCient = numCient;
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

	public ArrayList<Reservation> getLesReservations() {
		return lesReservations;
	}

	public void setLesReservations(ArrayList<Reservation> lesReservations) {
		this.lesReservations = lesReservations;
	}
	
	

}
