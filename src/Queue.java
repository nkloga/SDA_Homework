import java.util.Arrays;

public class Queue {
    private int queueSize = 0;
    private int[] array;

    public Queue(int arrayMaxSize) {
        this.array = new int[arrayMaxSize];
    }

    public Queue copy() {
        Queue queueCopy = new Queue(array.length);
        queueCopy.array = Arrays.copyOf(this.array, array.length);
        queueCopy.queueSize = this.queueSize;
        return queueCopy;
    }

    public void enqueue(int value) {
        if (queueSize < array.length) {
            array[queueSize] = value;
        } else {
            throw new IllegalStateException("Overflow");
        }
        increaseQueue();
    }

    public int dequeue() {
        if (queueSize > 0) {
            int returnValue = array[0];
            decreaseQueue();
            array[0] = 0;
            for (int i = 0; i < queueSize + 1; i++) {
                array[i] = array[i + 1];
            }
            return returnValue;
        } else {
            throw new IllegalStateException("Underflow");
        }
    }


    private void increaseQueue(){ queueSize++; }

    private void decreaseQueue(){ queueSize--; }

    public int size() {
        return queueSize;
    }

    public String toString() {
        String returnString = "";
        for (int i = 0; i < queueSize; i++) {
            if (i == queueSize-1) {
                returnString += array[i] + "";
            } else {
                returnString += array[i] + " -> ";
            }
        }
        return returnString;
    }
}
