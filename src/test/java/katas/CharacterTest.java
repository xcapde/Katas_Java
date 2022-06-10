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
        Character freezer = new Character();
        int damage = 75;
        //WHEN
        int result = naruto.isDamaged(damage, freezer);
        //THEN
        assertEquals(925, result);
    }

    @Test
    void characterDiesIfDamageExceedsHealth() {
        //GIVEN
        Character naruto = new Character();
        Character freezer = new Character();
        int damage = 1100;
        //WHEN
        naruto.isDamaged(damage, freezer);
        boolean result = naruto.getAliveStatus();
        //THEN
        assertFalse(result);
    }

    @Test
    void deadCharacterCantBeHealed() {
        //GIVEN
        Character naruto = new Character();
        Character freezer = new Character();
        int damage = 1050;
        //WHEN
        naruto.isDamaged(damage, freezer);
        boolean result = naruto.canBeHealed();
        //THEN
        assertFalse(result);
    }

    @Test
    void healCannotRise1000Health() {
        //GIVEN
        Character naruto = new Character();
        Character freezer = new Character();
        int damage = 300;
        int healing = 299;

        //WHEN
        naruto.isDamaged(damage, freezer);
        naruto.isHealed(healing, freezer);

        boolean result = naruto.canBeHealed();

        //THEN
        assertTrue(result);
    }

    // 2

    @Test
    void characterCannotDamageItself() {
        //GIVEN
        Character naruto = new Character();
        int damage = 400;

        //WHEN
        int result = naruto.isDamaged(damage, naruto);

        //THEN
        assertEquals(1000, result);
    }

    @Test
    void characterCanOnlyHealItself() {
        //GIVEN
        Character naruto = new Character();
        Character freezer = new Character();
        int damage = 400;
        int healing = 350;

        //WHEN
        naruto.isDamaged(damage, freezer);

        int result = naruto.isHealed(healing, naruto);

        //THEN
        assertEquals(950, result);
    }

    @Test
    void ifTargetLevelIs5orMoreAboveDamageIsReducedHalf() {
        //GIVEN
        Character naruto = new Character();
        Character freezer = new Character();
        int damage = 200;
        freezer.setLevel(10);

        //WHEN
        int result = freezer.isDamaged(damage, naruto);

        //THEN
        assertEquals(900, result);
    }

    @Test
    void ifTargetLevelIs5orMoreBelowDamageIsIncreasedHalf() {
        //GIVEN
        Character naruto = new Character();
        Character freezer = new Character();
        int damage = 200;
        naruto.setLevel(10);

        //WHEN
        int result = freezer.isDamaged(damage, naruto);

        //THEN
        assertEquals(600, result);
    }
}

        // System.out.println(naruto.canBeHealed());
