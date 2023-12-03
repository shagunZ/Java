import java.util.Comparator;
import java.util.PriorityQueue;
public class priorityqueue {
    public static void main(String[] args) {
        //min heap
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        //or Queue<Integer> pq = new PriorityQueue<>();
        
        //max heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(22);
        pq.offer(12);
        pq.offer(11);
        pq.offer(32);
        System.out.println(pq);

        pq.poll();
        System.out.println(pq);

        System.out.println(pq.peek());
    }
}
