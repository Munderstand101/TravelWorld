import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestVoyage {

	public static void main(String[] args) throws ParseException {
		
		
		Voyage unVoyage1 = new Voyage("v01","Visite Slovenie");
		Voyage unVoyage2 = new Voyage("v02","Visite Roumanie");
		Voyage unVoyage3 = new Voyage("v03","Visite Italie");
		
		Sejour unSejour = new Sejour("s01", "Visite Slovenie", "Slovenie");
		
		Circuit unCircuit = new Circuit("TEST", "test", true);
		
		Etape uneEtape = new Etape(1, "Arad", 10);
		Etape uneEtape2 = new Etape(2, "Lipova", 30);
		
		
		unCircuit.ajouterEtape(uneEtape);
		unCircuit.ajouterEtape(uneEtape2);
		
		System.out.println("---------------------------------");
		unCircuit.afficher();
		
		
		Client unClient = new Client("Eikichi", "Onizuka");
		//Client unClient2 = new Client("Ryuji", "Danma");
		
		
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		
		java.util.Date dd1 = dateFormat.parse("16/09/2021");
		java.util.Date dr1 = dateFormat.parse("16/10/2021");
		
		Reservation uneReservation = new Reservation(dd1, dr1, true, unVoyage1);
	
		uneReservation.afficher();
		
		
		java.util.Date dd2 =  dateFormat.parse("8/09/2021");
		java.util.Date dr2 =  dateFormat.parse("8/10/2021");
		
		Reservation uneReservation2 = new Reservation(dd2, dr2, false, unVoyage2);
		
		uneReservation2.afficher();
		
		java.util.Date dd3 = dateFormat.parse("8/09/2021");
		java.util.Date dr3 = dateFormat.parse("8/10/2021");
		
		Reservation uneReservation3 = new Reservation(dd2, dr2, true, unVoyage3);
		
		uneReservation3.afficher();
		
		
		unClient.ajouterReservation(uneReservation);
		unClient.ajouterReservation(uneReservation2);
		unClient.ajouterReservation(uneReservation3);
		
		
		unClient.afficherListeResaAVenir();
		unClient.afficherListeResaEnCours();
		unClient.afficherListeResaPassees();
		
		
	}

}
