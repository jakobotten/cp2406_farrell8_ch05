// EvenOdd.java
// Checks if a number is even or odd


import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;
        int number_mod;
        String output;

        System.out.println("Enter a number:");
        number = input.nextInt();
        number_mod = number % 2;
        if (number_mod == 0)
            output = "even";
        else
            output = "odd";
        System.out.println("The number " + number + " is " + output);
    }
}
