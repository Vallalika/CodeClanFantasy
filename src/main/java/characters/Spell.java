package characters;

public enum Spell {

    FIREBALL(50),
    ICESHARD(10),
    LIGHTNINGSTRIKE(10),
    EARTHQUAKE(50),
    TORNADO(100);

    private final int damagePoints;


    Spell(int damagePoints) {
        this.damagePoints = damagePoints;
    }

    public int getDamagePoints() {
        return damagePoints;
    }
}
