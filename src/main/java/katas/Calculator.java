package katas;

import java.util.ArrayList;

public class Calculator {
    private double total = 0.0;

    public double getTotal() {
        return this.total;
    }

    ;

    public void sum(double num) {
        this.total += num;
    }

    ;

    public void rest(double num) {
        this.total -= num;
    }

    ;

    public void multi(double num) {
        this.total *= num;
    }

    public void div(double num) {
        this.total /= num;
    }

    // NO ESTÀ BÉ, HAURIA DE SER PERCENTATGES....
    public void mod(double num) {
        this.total %= num;
    }

    public boolean isEven(double num) {
        if (num % 2 == 0.00) {
            return true;
        } else {
            return false;
        }
    }

    public double isBigger(double num1, double num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }


    }

    /*public int sumArray(arr) {
        ArrayList<Integer> arr = new ArrayList<Integer>(num1, num2)
        for (double i : numsArray) {
            return this.sum( += i)
        } ;
    }*/
}
