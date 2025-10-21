import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface {
    // Very similar to list interface
    // part of the java.util package and extend the collection interface

    // Uses first in first out, no index access
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Has the same basic functions as list interface
        // add: if queue is full, throw exception
        // offer: if queue is full, return false
        queue.add(15);
        queue.add(25);
        queue.offer(30);

        System.out.println(queue);

        // remove the element in front
        // remove: if queue is empty, throw exception
        // poll: if queue is empty, return null
        queue.remove();
        queue.poll();
        System.out.println(queue);

        // return the element in front withour removing it
        // element: if queue is empty, throw exception
        // peek: if queue is empty, return null
        System.out.println(queue.element());
        System.out.println(queue.peek());
        System.out.println(queue);

        // iterating a queue
        queue.add(100);
        queue.add(24);
        for (int i: queue){
            System.out.println(i);
        }

        // Classes that implement queue interface is: Priority Queue, LinkedList, Priority Blocking Queue
    }
}
