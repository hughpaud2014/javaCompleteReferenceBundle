package Variables.ScopeErr;

// Demonstrate Outer scope error of a variable.
// Call this file ScopeErr.java

public class ScopeErr {
    public static void main(String args[]) {
        int bar = 1;
        { //creates new scope
            int bar = 2; // Compile-time error -bar already defined!

        }
    }
    
}
