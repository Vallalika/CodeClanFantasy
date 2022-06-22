package charactersTest;

import characters.Cleric;
import characters.HealingTool;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    HealingTool healingTool;

    @Before
    public void before(){
        cleric = new Cleric ("Super Cleric", 200, 1000);
        healingTool = HealingTool.SUPERPOTION;
    }

    @Test
    public void hasName(){
        assertEquals("Super Cleric", cleric.getName());
    }

    @Test
    public void hasCurrentHp(){
        assertEquals(200, cleric.getCurrentHp());
    }

    @Test
    public void getHealingTool(){
        assertEquals(HealingTool.POTION, cleric.getHealingTool());
    }

    @Test
    public void canChangeHealingTool(){
        cleric.changeHealingTool(healingTool);
        assertEquals(HealingTool.SUPERPOTION, cleric.getHealingTool());
    }

    @Test
    public void canSetCurrentHp(){
        cleric.setCurrentHp(100);
        assertEquals(100, cleric.getCurrentHp());
    }

    @Test
    public void canHeal(){
        Cleric cleric2 = new Cleric("Wounded Cleric", 100, 0);
        cleric.heal(cleric2);
        assertEquals(200, cleric2.getCurrentHp());

    }
}
