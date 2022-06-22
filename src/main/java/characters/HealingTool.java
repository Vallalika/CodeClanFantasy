package characters;

public enum HealingTool {

    POTION(250),
    SUPERPOTION(500),
    MAXIPOTION(1000);

    private final int healPoints;

    HealingTool(int healPoints) {
        this.healPoints = healPoints;
    }

    public int getHealPoints() {
        return healPoints;
    }
}
