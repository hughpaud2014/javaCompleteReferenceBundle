package Track2.LightApp;

/*
    Compute distance light travels using long variables.

    Call this file "LightApp.java"
*/

public class LightApp {
    public static void main(String args[]) {
        int lightSpeed;
        long days;
        long seconds;
        long distance;

        // approximate speed light in miles per second
        lightSpeed = 186000;

        days = 1000; // specify number of days here

        seconds = days * 24 * 60 * 60; // Convert to seconds

        distance = lightSpeed * seconds; // Compute distance

        System.out.print("In " + days);
        System.out.print(" days light will travel about ");
        System.out.println(distance + " miles.");
    }
}