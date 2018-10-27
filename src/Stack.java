import java.util.Arrays;

public class Stack {
    private int stackSize = 0;
    private int[] array;

    public Stack(int arrayMaxSize) {
        this.array = new int[arrayMaxSize];
    }

    public Stack copy() {
        Stack stackCopy = new Stack(array.length);
        stackCopy.array = Arrays.copyOf(this.array, array.length);
        stackCopy.stackSize = this.stackSize;
        return stackCopy;
    }

    public void push(int value) {
        if (stackSize < array.length) {
            array[stackSize] = value;
        } else {
            throw new IllegalStateException("Overflow");
        }
        increaseStackSize();
    }

    public void pop() {
        if (stackSize > 0) {
            decreaseStackSize();
        } else {
            throw new IllegalStateException("Underflow");
        }
    }

    public int size() {
        return stackSize;
    }

    private void increaseStackSize(){ stackSize++; }

    private void decreaseStackSize(){ stackSize--; }

    public String toString() {
        String returnString = "";
        for (int i = 0; i < stackSize; i++) {
            if (i == stackSize-1) {
                returnString += array[i] + "";
            } else {
                returnString += array[i] + " -> ";
            }
        }
        return returnString;
    }
}
