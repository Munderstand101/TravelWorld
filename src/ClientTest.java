import org.junit.Before;
import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class ClientTest {

    private Client leClient;
    @Before
    public void setUp(){
        this.leClient = new Client("Hakuna","Matata");
    }

    @Test
    public void testAjouterReservation() throws ParseException {

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        Date dd1 = dateFormat.parse("16/09/2021");
        Date dr1 = dateFormat.parse("16/10/2021");

        Voyage unVoyage1 = new Voyage("v01","Visite Slovenie");

        Reservation uneReservation = new Reservation(dd1, dr1, true, unVoyage1);

        assertTrue("La liste de reservation doit etre vide", this.leClient.getLesReservations().size()==0);

        this.leClient.ajouterReservation(uneReservation);

        assertTrue("La liste de reservation doit contenir une reservation", this.leClient.getLesReservations().size()==1);

        this.leClient.ajouterReservation(uneReservation);

        assertTrue("La liste de reservation doit contenir deux reservation", this.leClient.getLesReservations().size()==2);

    }
}