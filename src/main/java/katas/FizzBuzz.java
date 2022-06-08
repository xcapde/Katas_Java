package katas;

public class FizzBuzz {

    private String result = "";

    public String getResult() {
        return this.result;
    }

    public void is3or5Multiple(int num) {
        if (num % 3 == 0 && num % 5 == 0) {
            this.result = "FizzBuzz";
        } else if (num % 3 == 0) {
            this.result = "Fizz";
        } else if (num % 5 == 0) {
            this.result = "Buzz";
        } else {
          this.result = String.valueOf(num);
        }
    }
}