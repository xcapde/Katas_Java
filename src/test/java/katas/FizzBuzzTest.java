package katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    public void is3Multiple() {
        //GIVEN
        FizzBuzz fizz = new FizzBuzz();
        int num = 9;
        //WHEN
        fizz.is3or5Multiple(num);
        String result = fizz.getResult();
        //THEN
        assertEquals("Fizz", result);
    }

    @Test
    public void is5Multiple() {
        //GIVEN
        FizzBuzz fizz = new FizzBuzz();
        int num = 10;
        //WHEN
        fizz.is3or5Multiple(num);
        String result = fizz.getResult();
        //THEN
        assertEquals("Buzz", result);
    }

    @Test
    public void is3and5Multiple() {
        //GIVEN
        FizzBuzz fizz = new FizzBuzz();
        int num = 15;
        //WHEN
        fizz.is3or5Multiple(num);
        String result = fizz.getResult();
        //THEN
        assertEquals("FizzBuzz", result);
    }

    @Test
    public void isNot3and5Multiple() {
        //GIVEN
        FizzBuzz fizz = new FizzBuzz();
        int num = 17;
        //WHEN
        fizz.is3or5Multiple(num);
        String result = fizz.getResult();
        //THEN
        assertEquals(String.valueOf(num), result);
    }

}