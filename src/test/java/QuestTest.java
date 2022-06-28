import characters.Cleric;
import characters.Fighter;
import characters.Magician;
import characters.Player;
import org.junit.Before;
import org.junit.Test;
import rooms.EnemyRoom;
import rooms.LootRoom;
import rooms.Party;
import rooms.Room;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class QuestTest {

    private Quest quest;
    private EnemyRoom villainsRoom;
    private LootRoom treasureRoom;
    private Party party;
    private Player player1;
    private Player player2;
    private Player player3;

    @Before
    public void before() {
        villainsRoom = new EnemyRoom("Dragon room");
        treasureRoom = new LootRoom("Golden room",1000);
        quest = new Quest("A single enemy quest");
        player1 = new Fighter("Urgh",500,50);
        player2 = new Magician("Shazam",200,50);
        player3 = new Cleric("Marvin the Sage",200,50);
    }

    @Test
    public void canGetQuestName() {
        assertEquals("A single enemy quest", quest.getQuestName());
    }

    @Test
    public void startsWithNoRoom() {
        assertEquals(0, quest.getLocations().size());
    }

    @Test
    public void canCheckIsComplete() {
        assertEquals(false, quest.getCompleteStatus());
    }

    @Test
    public void canChangeCompleteStatusToTrue() {
        quest.changeCompleteStatus(true);
        assertEquals(true, quest.getCompleteStatus());
    }

    @Test
    public void canChangeCompleteStatusToFalse() {
        quest.changeCompleteStatus(true);
        quest.changeCompleteStatus(false);
        assertEquals(false, quest.getCompleteStatus());
    }

    @Test
    public void canAddLocation() {
        quest.addLocation(villainsRoom);
        quest.addLocation(treasureRoom);
        assertEquals(2, quest.getLocations().size());
    }

    @Test
    public void startsWithNoCurrentRoom() {
        assertNull(quest.getCurrentRoom());
    }

    @Test
    public void canSetCurrentRoom() {
        quest.setCurrentRoom(villainsRoom);
        assertEquals(villainsRoom, quest.getCurrentRoom());
    }

    @Test
    public void startsWithNoParty() {
        assertNull(quest.getParty());
    }

    @Test
    public void canAddPartyToQuest() {
        party = new Party (player1,player2,player3);
        quest.setParty(party);
        assertEquals(party, quest.getParty());
    }
}
