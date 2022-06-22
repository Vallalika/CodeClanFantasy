package characters;

public class Enemy {

    private String species;
    private int attackPower;
    private int armourValue;
    private int currentHp;
    private int maxHp;
    private boolean isDead;

    public Enemy() {
        this.species = "Dragon";
        this.attackPower = 100;
        this.armourValue = 50;
        this.currentHp = 1000;
        this.maxHp = 1000;
        this.isDead = false;
    }

    public String getSpecies() {
        return species;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public int getArmourValue() {
        return armourValue;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setIsDead(){
        this.isDead = true;
    }

    public boolean getIsDead() {
        return this.isDead;
    }

    public void setCurrentHp(int currentHp) {
        this.currentHp = currentHp;
    }
}
