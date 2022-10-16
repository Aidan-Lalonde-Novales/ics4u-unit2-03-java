/*
* This program finds the length of a board foot
* given width and height
*
* @author  Aidan Lalonde-Novales
* @version 1.0
* @since   2020-10-10
*/

import java.util.Scanner;

/**
 * This is a board foot length calculator.
*/

final class Main {
    /**
     * Prevent instantiation.
     * Throw an exception IllegalStateException.
     * if this ever is called
     *
     * @throws IllegalStateException
     *
     */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        final MrCoxallStack myStack = new MrCoxallStack();

        while (true) {
            final Scanner numObj = new Scanner(System.in);
            System.out.println("Enter a number to add (-1 to pop): ");
            try {
                final float tempNum = numObj.nextFloat();
                if (tempNum == -1) {
                    break;
                } else {
                    myStack.push(tempNum);
                }
            } catch (java.util.InputMismatchException ex) {
                System.out.println("\nInvalid Input. Try Again.");
            }
            System.out.println("");
        }
        System.out.println("\nOriginal Stack:");
        System.out.print(myStack.getStack());
        System.out.println("\nPopped Number:");
        System.out.print(myStack.popStack());

        System.out.println("");
        System.out.println("\nDone.");
    }
}
