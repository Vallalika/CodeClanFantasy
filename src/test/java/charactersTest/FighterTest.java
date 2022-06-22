package charactersTest;

import characters.Enemy;
import characters.Fighter;
import characters.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FighterTest {

    Fighter fighter;

    @Before
    public void before(){
        fighter = new Fighter("Hulk", 500, 50);
    }

    @Test
    public void hasName(){
        assertEquals("Hulk", fighter.getName());
    }

    @Test
    public void hasCurrentHp(){
        assertEquals(500, fighter.getCurrentHp());
    }

    @Test
    public void hasLootValue(){
        assertEquals(50, fighter.getLootValue());
    }

    @Test
    public void hasWeapon(){
        assertEquals(Weapon.SWORD, fighter.getWeapon());
    }

    @Test
    public void canChangeWeapon(){
        fighter.changeWeapon(Weapon.MORNINGSTAR);
        assertEquals(Weapon.MORNINGSTAR, fighter.getWeapon());
    }

    @Test
    public void canAttack(){
        Enemy enemy = new Enemy();
        fighter.attack(enemy);
        assertEquals(950, enemy.getCurrentHp());
    }
}
