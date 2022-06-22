package charactersTest;

import characters.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MagicianTest {

    Magician magician;
    Enemy enemy;

    @Before
    public void before() {
        magician = new Magician("Merlin", 200, 50);
        Spell spell = Spell.EARTHQUAKE;
    }

    @Test
    public void hasName(){
        assertEquals("Merlin", magician.getName());
    }

    @Test
    public void hasCurrentHp(){
        assertEquals(200, magician.getCurrentHp());
    }

    @Test
    public void hasSpell(){
        assertEquals(Spell.FIREBALL, magician.getSpell());
    }

    @Test
    public void hasPet(){
        assertEquals("Panther", magician.getPet().getSpecies());
    }

    @Test
    public void canChangeSpell(){
        magician.changeSpell(Spell.EARTHQUAKE);
        assertEquals(Spell.EARTHQUAKE, magician.getSpell());
    }

    @Test
    public void canCastSpell(){
        enemy = new Enemy();
        magician.castSpell(enemy);
        assertEquals(1000, enemy.getCurrentHp());
    }


}
