import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;

class Student{
    int roll;
    Student(int roll){
        this.roll = roll;
    }
}
public class linkedlist {
    public static void main(String[] args) {
        // Queue<Integer> queue = new LinkedList<>();
        // //add elements in queue
        // queue.offer(12);
        // queue.offer(24);
        // queue.offer(36);
        // System.out.println(queue);
        
        // System.out.println(queue.poll());
        // System.out.println(queue);


        LinkedList<String> ll = new LinkedList<>();
        ll.add("A");
        ll.addFirst("B");
        ll.addLast("C");
        System.out.println(ll);
        Iterator<String> itr = ll.iterator();
        while(itr.hasNext()){ 
        }



///////////////////////////////////////////////////////comparator/////////////////////
        Student s = new Student(22);
        Student t = new Student(24);
LinkedList<Student> listnew = new LinkedList<>();
listnew.add(s);
listnew.add(t);
           class CompareStudent implements Comparator<Student>{
            public int compare(Student s1, Student s2){
                if(s1.roll>s2.roll) return +1;
                else return -1;
            }
        }
CompareStudent comparator = new CompareStudent();

// Sorting the list using Collections.sort
Collections.sort(listnew, comparator);
        // Printing the sorted list
        for (Student student : listnew) {
            System.out.println("Roll: " + student.roll);
        }
////////////////////////////////////////////////////////////////////////////////////////


        //cloning
        LinkedList<String> classlist = (LinkedList<String>)ll.clone();
        //Collections
        Collections.reverse(classlist);
        Collections.shuffle(classlist);
        Collections.sort(classlist);
        System.out.println(classlist);
    }

  
}
