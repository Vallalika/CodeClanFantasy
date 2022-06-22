package roomsTest;

import characters.Cleric;
import characters.Fighter;
import characters.Magician;
import characters.Player;
import org.junit.Before;
import org.junit.Test;
import rooms.Party;

import static org.junit.Assert.assertEquals;

public class PartyTest {

    Party party;
    Player player1;
    Player player2;
    Player player3;

    @Before
    public void before(){
        player1 = new Fighter("Urgh", 500, 50);
        player2 = new Magician("Kazam", 500, 100);
        player3 = new Cleric("Marvin the Sage", 200, 1);
        party = new Party (player1, player2, player3);
    }

    @Test
    public void canGetParty(){
        assertEquals(3, party.getParty().size());
    }
}
