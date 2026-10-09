import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HauntedHouseTest {

    static HauntedHouse house;

    @BeforeEach
    void setUp() {
        house = new HauntedHouse();
    }

    @Test
    void isGhostPresentTest() {
        boolean presence  = house.isGhostPresent(); // actual value
        assertTrue(presence);
    }

    @Test
    void scareAwayGhostTest() {

    }

    @Test
    void scareAwayGhostTestWhenNoGhost() {
        boolean presence  = house.isGhostPresent(); // actual value before ScareAway
        assertTrue(presence);
        house.scareAwayGhost();
        presence = house.isGhostPresent();
        assertFalse(presence);
        scareAwayGhostTest();
        house.scareAwayGhost();
        presence = house.isGhostPresent();
        assertFalse(presence);
    }

    @Test
    void refillCandyBowl() {
        assertEquals(10, house.getCandyCount());
        house.refillCandyBowl(10);
        assertEquals(20, house.getCandyCount());
        house.refillCandyBowl(-10);
        assertEquals(20, house.getCandyCount());
        house.refillCandyBowl(0);
        assertEquals(20, house.getCandyCount());

    }

    @Test
    void trickOrTreat() {
        house.trickOrTreat(5);
        assertEquals(5, house.getCandyCount());
        house.trickOrTreat(10);
        assertEquals(5, house.getCandyCount());

    }

    @Test
    void TooManyPeople(){
        house.trickOrTreat(12);
        assertEquals(10, house.getCandyCount());
    }

    @Test
    void RunningLow(){
        house.trickOrTreat(10);
        house.trickOrTreat(5);
        assertEquals(5, house.getCandyCount());
    }

    @Test
    void getCandyCount() {
    }

    @Test
    void spookySound() {
        assertEquals("Boo!", house.spookySound());
    }

    @Test
    void testToString() {
    }
}