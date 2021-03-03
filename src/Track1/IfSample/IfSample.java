package Track1.IfSample;

/*
    Demonstrate the if statement.
    Call the file "IfSample.java"

*/

public class IfSample {
    public static void main(String[] args) {

        // Establish variable types
        int x, y;

        // Define variable values
        x = 10;
        y = 20;

        // Declare if statements
        if (x < y)
            System.out.println("x is less than y");

        x = x * 2;

        if (x == y)
            System.out.println("x now is equal to y");

        x = x * 2;

        if (x > y)
            System.out.println("x now greater than y");

        // This will not display anything
        if (x == y)
            System.out.println("You won't see this.");

    }
}
