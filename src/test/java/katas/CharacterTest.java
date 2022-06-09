package katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {

    // 1

    @Test
    void allCharactersWhenCreatedStartsWith1000Health() {
        //GIVEN
        Character naruto = new Character();
        //WHEN
        int result = naruto.getInitHealth();
        //THEN
        assertEquals(1000, result);
    }

    @Test
    void allCharactersWhenCreatedStartsWith1Level() {
        //GIVEN
        Character naruto = new Character();
        //WHEN
        int result = naruto.getInitLevel();
        //THEN
        assertEquals(1, result);
    }

    @Test
    void allCharactersWhenCreatedStartsWithTrueAlive() {
        //GIVEN
        Character naruto = new Character();
        //WHEN
        boolean result = naruto.getAliveStatus();
        //THEN
        assertTrue(result);
    }

    @Test
    void damageIsTakenFromHealth() {
        //GIVEN
        Character naruto = new Character();
        int damage = 75;
        //WHEN
        int result = naruto.isDamaged(damage, naruto);
        //THEN
        assertEquals(925, result);
    }

    @Test
    void characterDiesIfDamageExceedsHealth() {
        //GIVEN
        Character naruto = new Character();
        int damage = 1100;
        //WHEN
        naruto.isDamaged(damage, naruto);
        boolean result = naruto.getAliveStatus();
        //THEN
        assertFalse(result);
    }

    @Test
    void deadCharacterCantBeHealed() {
        //GIVEN
        Character naruto = new Character();
        int damage = 1100;
        //WHEN
        naruto.isDamaged(damage, naruto);
        boolean result = naruto.canBeHealed();
        //THEN
        assertFalse(result);
    }

    @Test
    void healCannotRise1000Health() {
        //GIVEN
        Character naruto = new Character();
        int damage = 300;
        int healing = 299;

        //WHEN
        naruto.isDamaged(damage, naruto);
        naruto.isHealed(healing, naruto);

        boolean result = naruto.canBeHealed();

        //THEN
        assertTrue(result);
    }

    // 2

    /*@Test
    void characterCannotDamageItself() {
        //GIVEN
        Character naruto = new Character();
        int damage = 50;
        //WHEN
        naruto.isDamaged(damage);
        boolean result = naruto.canBeDamaged();

        //THEN
        assertFalse(result);
    }*/
}

        // System.out.println(naruto.canBeHealed());
