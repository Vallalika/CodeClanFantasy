package rooms;

public abstract class Room {

    protected String name;
    protected Party party;
    protected boolean cleared;

    public Room(String name) {
        this.name = name;
        this.cleared = false;
        this.party = null;
    }

    public String getName() {
        return name;
    }

    public Party getParty() {
        return party;
    }

    public void setCleared(boolean value) {
        this.cleared = value;
    }

    public void addParty(Party party){
        this.party = party;
    }

    public boolean getCleared() {
        return this.cleared;
    }
}
