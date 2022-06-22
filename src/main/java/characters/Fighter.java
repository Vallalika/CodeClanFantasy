package characters;

public class Fighter extends Player{

    Weapon weapon;
    private int armourValue;

    public Fighter(String name, int currentHp, int lootValue) {
        super(name, currentHp, lootValue);
        this.weapon = Weapon.SWORD;
        this.armourValue = 25;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public int getArmourValue() {
        return armourValue;
    }

    public void changeWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack(Enemy enemy) {
        int totalEnemyHp = enemy.getCurrentHp() + enemy.getArmourValue() - this.getWeapon().getAttackPoints();
        enemy.setCurrentHp(totalEnemyHp);
    }
}
