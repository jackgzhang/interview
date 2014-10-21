package weivretni.mixpanel;

import org.junit.Test;

public class MQueueTest {

    private MQueue queue = new MQueue();

    @Test
    public void test() {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }
    }
}
