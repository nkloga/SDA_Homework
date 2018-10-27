
/* Exercise N.5
Create stack with array as data storage.

Issues fixed:
    refactoring / simplification
    copy doesn't work correctly, add more value to the stack copy
*/

public class FifthMain {
    public static void main(String[] args) {
        Stack stack = new Stack(6);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.size());
        System.out.println("Stack after adding 5 values:           " + stack.toString());
        stack.pop();
        stack.pop();
        System.out.println("Stack after removing 2 values:         " + stack.toString());
        Stack newStack = stack.copy();
        stack.pop();
        System.out.println("Original stack with one value removed: " + stack.toString());
        System.out.println("Copy of original stack:                " + newStack.toString());
        stack.push(6);
        stack.push(7);
        stack.push(8);
        newStack.pop();
        System.out.println("Original stack:                        " + stack.toString());
        System.out.println("Copy of original stack:                " + newStack.toString());
        newStack.push(9);
        newStack.push(91);
        newStack.push(911);
        System.out.println("Original stack:                        " + stack.toString());
        System.out.println("Copy of original stack:                " + newStack.toString());

    }
}
