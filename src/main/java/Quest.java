import rooms.Party;
import rooms.Room;

import java.util.ArrayList;

public class Quest {

    private String questName;
    private ArrayList<Room> locations;
    private boolean isComplete;
    private Party party;
    private Room currentRoom;

    public Quest(String questName) {
        this.questName = questName;
        this.locations = new ArrayList<>();
        this.isComplete = false;
        this.party = null;
        this.currentRoom = null;
    }

    public String getQuestName() {
        return questName;
    }

    public ArrayList<Room> getLocations() {
        return locations;
    }

    public boolean getCompleteStatus() {
        return isComplete;
    }

    public void changeCompleteStatus(boolean value) {
        this.isComplete = value;
    }

    public void addLocation(Room room) {
        this.locations.add(room);
    }

    public void setCurrentRoom(Room room) {
        this.currentRoom = room;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public Party getParty() {
        return this.party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

}
