package rooms;

public class LootRoom extends Room {

    private int lootValue;

    public LootRoom(String name, int lootValue) {
        super(name);
        this.lootValue = lootValue;
    }

    public int getLootValue() {
        return lootValue;
    }

    public void setLootValue(int lootValue) {
        this.lootValue = lootValue;
    }
}
