package characters;

public enum Weapon {

    CLUB(50),
    AXE(100),
    SWORD(100),
    STAFF(10),
    MORNINGSTAR(100);

    private int attackPoints;

    Weapon(int attackPoints) {
        this.attackPoints = attackPoints;
    }

    public int getAttackPoints() {
        return attackPoints;
    }
}
