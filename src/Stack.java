public class Stack {
    private int arrayMaxSize;
    private int arraySize = -1;
    private int[] array;

    public Stack(int arrayMaxSize) {
        this.arrayMaxSize = arrayMaxSize;
        this.array = new int[arrayMaxSize];
    }

    public Stack copy() {
        Stack stack = new Stack(arrayMaxSize);
        stack.arraySize = this.arraySize;
        stack.array = this.array;
        stack.arrayMaxSize = this.arrayMaxSize;
        return stack;
    }

    public void push(int value) {
        arraySize++;
        if (arraySize < arrayMaxSize) {
            array[arraySize] = value;
        } else {
            throw new ArrayIndexOutOfBoundsException("Overflow");
        }
    }

    public void pop() {
        if (arraySize > 0) {
            arraySize--;
        } else {
            throw new ArrayIndexOutOfBoundsException("Underflow");
        }
    }

    public int size() {
        return arraySize + 1;
    }

    public String toString() {
        String returnString = "";
        for (int i = 0; i < arraySize + 1; i++) {
            if (i==arraySize) {
                returnString += array[i] + "";
            }else {
                returnString += array[i] + " -> ";
            }
        }
        return returnString;
    }
}
