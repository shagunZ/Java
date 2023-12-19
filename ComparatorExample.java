import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Collection;
import java.util.Comparator;

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + '}';
    }
}

public class ComparatorExample implements Comparator<Object> {
        @Override
        public int compare(Object obj1, Object obj2) {
                Student student1 = (Student) obj1;
                Student student2 = (Student) obj2;
                // return Integer.compare(student1.getAge(), student2.getAge());
                return Integer.compare(student1.getAge(), student2.getAge());
        }
    

    public static void main(String[] args) {
        Student student1 = new Student("Alice", 25);
         Student student2 =   new Student("Bob", 30);
            Student student3 =  new Student("Charlie", 22);

        
        ArrayList<Student> students = new ArrayList<>();
    students.add(student1);
    students.add(student2);
    students.add(student3);

        System.out.println("Original order:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Use the AgeComparator (local class) to sort the array
        Collections.sort(students, new ComparatorExample());

        // Display the sorted order
        System.out.println("\nSorted order based on age:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
