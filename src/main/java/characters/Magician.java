package characters;

public class Magician extends Player{

    private int maxHp;
    private Spell spell;
    private Pet pet;

    public Magician(String name, int currentHp, int lootValue) {
        super(name, currentHp, lootValue);
        this.maxHp = 200;
        this.spell = Spell.FIREBALL;
        this.pet = new Pet();
    }

    public int getMaxHp() {
        return maxHp;
    }

    public Spell getSpell() {
        return spell;
    }

    public Pet getPet() {
        return pet;
    }

    public void changeSpell(Spell spell) {
        this.spell = spell;
    }

    public void castSpell(Enemy enemy) {
        int totalEnemyHp = enemy.getCurrentHp() + enemy.getArmourValue() - this.getSpell().getDamagePoints();
        enemy.setCurrentHp(totalEnemyHp);
    }
}
