public class Queue {
    private int arrayMaxSize;
    private int arraySize = -1;
    private int[] array;

    public Queue(int arrayMaxSize) {
        this.arrayMaxSize = arrayMaxSize;
        this.array = new int[arrayMaxSize];
    }

    public Queue copy() {
        Queue stack = new Queue(arrayMaxSize);
        stack.arraySize = this.arraySize;
        stack.array = this.array;
        stack.arrayMaxSize = this.arrayMaxSize;
        return stack;
    }

    public void enqueue(int value) {
        arraySize++;
        if (arraySize < arrayMaxSize) {
            array[arraySize] = value;
        } else {
            throw new ArrayIndexOutOfBoundsException("Overflow");
        }
    }

    public void dequeue() {
        if (arraySize > 0) {
            arraySize--;
            array[0] = 0;
            for (int i = 0; i < arraySize + 1; i++) {
                array[i] = array[i + 1];
            }
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
            if (i == arraySize) {
                returnString += array[i] + "";
            } else {
                returnString += array[i] + " -> ";
            }
        }
        return returnString;
    }
}
