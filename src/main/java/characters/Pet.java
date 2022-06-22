package characters;

public class Pet {

    private String species;
    private int currentHp;
    private int maxHp;
    private int armourValue;

    public Pet() {
        this.species = "Panther";
        this.currentHp = 200;
        this.maxHp = 200;
        this.armourValue = 5;
    }

    public String getSpecies() {
        return species;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public int getArmourValue() {
        return armourValue;
    }
}
