package roomsTest;

import characters.Player;
import org.junit.Before;
import org.junit.Test;
import rooms.LootRoom;
import rooms.Party;
import rooms.Room;

import static org.junit.Assert.*;

public class LootRoomTest {

    LootRoom lootRoom;
    Party party;
    Player player1;
    Player player2;
    Player player3;

    @Before
    public void before(){
        lootRoom = new LootRoom("Money Room", 5000);
        party = new Party (player1, player2, player3);
    }

    @Test
    public void canGetName(){
        assertEquals("Money Room", lootRoom.getName());
    }

    @Test
    public void startsWithNoParty(){
        assertNull(lootRoom.getParty());
    }


    @Test
    public void canSetCleared(){
        lootRoom.setCleared(true);
        assertEquals(true, lootRoom.getCleared());
    }

    @Test
    public void canAddParty(){
        lootRoom.addParty(party);
        assertNotNull(lootRoom.getParty());
    }

    @Test
    public void canGetLoot(){
        assertEquals(5000, lootRoom.getLootValue());
    }

    @Test
    public void canSetLoot(){
        lootRoom.setLootValue(2000);
        assertEquals(2000, lootRoom.getLootValue());
    }


}
