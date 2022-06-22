package characters;

public class Cleric extends Player{

    private HealingTool healingTool;
    private int maxHp;

    public Cleric(String name, int currentHp, int lootValue) {
        super(name, currentHp, lootValue);
        this.healingTool = HealingTool.POTION;
        this.maxHp = 200;

    }

    public HealingTool getHealingTool() {
        return healingTool;
    }

    public void changeHealingTool(HealingTool healingTool) {
        this.healingTool = healingTool;
    }


    public void heal(Player player) {
        if (player.getCurrentHp() + healingTool.getHealPoints() <= maxHp){
            player.setCurrentHp(player.getCurrentHp() + healingTool.getHealPoints());
        } else {
            player.setCurrentHp(this.maxHp);
        }
    }
}
