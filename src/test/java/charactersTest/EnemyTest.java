package charactersTest;

import characters.Enemy;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    Enemy dragon;

    @Before
    public void before(){
        dragon = new Enemy();
    }

    @Test
    public void hasSpecies(){
        assertEquals("Dragon", dragon.getSpecies());
    }

    @Test
    public void hasAttackPower(){
        assertEquals(100, dragon.getAttackPower());
    }

    @Test
    public void hasArmourValue(){
        assertEquals(50, dragon.getArmourValue());
    }

    @Test
    public void hasCurrentHp(){
        assertEquals(1000, dragon.getCurrentHp());
    }

    @Test
    public void hasMaxHp(){
        assertEquals(1000, dragon.getMaxHp());
    }

    @Test
    public void canSetIsDead(){
        dragon.setIsDead();
        assertEquals(true, dragon.getIsDead());
    }

    @Test
    public void canSetCurrentHp(){
        dragon.setCurrentHp(0);
        assertEquals(0, dragon.getCurrentHp());
    }
}
