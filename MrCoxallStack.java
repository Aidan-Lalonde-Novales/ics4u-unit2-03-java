/*
* This file pushes to and prints a stack.
*
* @author  Aidan Lalonde-Novales
* @version 1.0
* @since   2020-10-10
*/

import java.util.ArrayList;

/**
 * Stack Class.
 */
public class MrCoxallStack {
    /**
     * Creates an Array Stack.
     */
    private ArrayList<Float> stack = new ArrayList<Float>();

    /**
     * This function is the getter.
     *
     * @return stack - array being added to.
     */
    public ArrayList<Float> getStack() {
        return this.stack;
    }

    /**
     * This function adds a number to the stack.
     *
     * @param tempNum - number to be pushed to the stack.
     */
    public void push(float tempNum) {
        stack.add(tempNum);
    }

    /**
     * This function pops the most recent value from the stack.
     *
     * @return this.stack - returns a popped version of the stack.
     */
    public float popStack() {
        return this.stack.remove(stack.size() - 1);
    }
}
