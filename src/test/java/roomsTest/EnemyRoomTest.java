package roomsTest;

import characters.Player;
import org.junit.Before;
import org.junit.Test;
import rooms.EnemyRoom;
import rooms.Party;
import rooms.Room;

import static org.junit.Assert.*;

public class EnemyRoomTest {

    Party party;
    EnemyRoom enemyRoom;
    Player player1;
    Player player2;
    Player player3;

    @Before
    public void before(){
        party = new Party(player1, player2, player3);
        enemyRoom = new EnemyRoom("Dragon Room");
    }

    @Test
    public void canGetName(){
        assertEquals("Dragon Room", enemyRoom.getName());
    }

    @Test
    public void startsWithNoParty(){
        assertNull(enemyRoom.getParty());
    }

    @Test
    public void canGetEnemy(){
        assertEquals("Dragon", enemyRoom.getEnemy().getSpecies());
    }

    @Test
    public void canSetCleared(){
        enemyRoom.setCleared(true);
        assertEquals(true, enemyRoom.getCleared());
    }

    @Test
    public void canAddParty(){
        enemyRoom.addParty(party);
        assertNotNull(enemyRoom.getParty());
    }

}
