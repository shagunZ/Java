import java.util.ArrayDeque;

public class arraydeque {
    public static void main(String[] args) {
        //double ended 
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        //offer and offerlast work same, offerfirst add at first
        adq.offer(33);
        adq.offerFirst(34);
        adq.offerLast(35);
        adq.offer(13);

        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq.poll());
        System.out.println("poll"+adq);
        System.out.println(adq.pollFirst());
        System.out.println("pollfirst"+adq);
        System.out.println(adq.pollLast());
        System.out.println("polllast"+adq);
    }
}
