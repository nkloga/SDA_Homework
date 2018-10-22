
/* Exercise N.6
Create queue with array as data storage.
 */

public class SixthMain {
    public static void main(String[] args) {
        Queue queue = new Queue(10);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.println("Stack after adding 5 values:           " + queue.toString());
        queue.dequeue();
        queue.dequeue();
        System.out.println("Stack after removing 2 values:         " + queue.toString());
        Queue newQueue = queue.copy();
        queue.dequeue();
        System.out.println("Original stack with one value removed: " + queue.toString());
        System.out.println("Copy of original stack:                " + newQueue.toString());
    }
}
