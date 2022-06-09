package katas;

import java.util.ArrayList;

public class Calculator {
    private double total = 0.0;

    public double getTotal() {
        return this.total;
    }

    public void sum(double num) {
        this.total += num;
    }

    public void rest(double num) {
        this.total -= num;
    }

    public void multi(double num) {
        this.total *= num;
    }

    public void div(double num) {
        this.total /= num;
    }

    public void mod(double num) {
        this.total %= num;
    }

    public boolean isEven(double num) {
        return num % 2 == 0;

        /*if (num % 2 == 0.00) {
            return true;
        } else {
            return false;
        }*/
    }

    public double isBigger(double num1, double num2) {
        /*if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }*/
        return Math.max(num1, num2);
    }

    public void sumArrayNum(double[] array) {
        double result = 0;
        for (double num : array) {
            result += num;
        }
        this.total = result;
    }

    public ArrayList<Integer> filterNumBiggerOrEqualFive(ArrayList <Integer> arrayOfNum) {
        ArrayList <Integer> filteredArray = new ArrayList<>();

        for (int num : arrayOfNum) {
            if(num >= 5){
                filteredArray.add(num);
            }
        }
        return filteredArray;
    }
}
