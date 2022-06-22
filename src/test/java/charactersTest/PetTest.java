package charactersTest;

import characters.Pet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PetTest {

    Pet pet;

    @Before
    public void before(){
        pet = new Pet();
    }

    @Test
    public void hasSpecies(){
        assertEquals("Panther", pet.getSpecies());
    }

    @Test
    public void hasCurrentHp(){
        assertEquals(200, pet.getCurrentHp());
    }

    @Test
    public void hasMaxHp(){
        assertEquals(200, pet.getMaxHp());
    }

    @Test
    public void hasArmourValue(){
        assertEquals(5, pet.getArmourValue());
    }

}
