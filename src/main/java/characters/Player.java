package characters;

public abstract class Player {

    protected String name;
    protected int maxHp;
    protected int currentHp;
    protected int lootValue;

    public Player(String name, int currentHp, int lootValue) {
        this.name = name;
        this.currentHp = currentHp;
        this.maxHp = maxHp;
        this.lootValue = lootValue;
    }

    public String getName() {
        return name;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    public int getLootValue() {
        return lootValue;
    }

    public void setCurrentHp(int hp){
        this.currentHp = hp;
    }
}
