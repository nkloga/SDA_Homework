
/* Exercise N.5
Create stack with array as data storage.
*/

public class FifthMain {
    public static void main(String[] args) {
        Stack stack = new Stack(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("Stack after adding 5 values:           " + stack.toString());
        stack.pop();
        stack.pop();
        System.out.println("Stack after removing 2 values:         " + stack.toString());
        Stack newStack = stack.copy();
        stack.pop();
        System.out.println("Original stack with one value removed: " + stack.toString());
        System.out.println("Copy of original stack:                " + newStack.toString());
    }
}
