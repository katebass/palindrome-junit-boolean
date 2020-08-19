package xyz.edu;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello");

        // Task 1. Palindrome with LOGGER and tests
        String string = "LOOl**";
        boolean isPalindrome =  PalindromeService.isValid(string);
        System.out.println(isPalindrome);
        System.out.println("String " + string
                           + (isPalindrome ? " is " : " is not")
                           + " a palindrome");

        // --------------------------------------------------------------------
        // Task 2. Geometric figure with tests
        // create an instance of the class Cube
        Cube cube = new Cube(5);
        // call one of methods for class instance
        cube.toConsole();
        cube.getPerimeter();

        // Task 3. Boolean operations with tests.
        BooleanOperations booleanOperations = new BooleanOperations(true, true);
        System.out.println(booleanOperations.conjunction());
    }
}
