import java.util.Arrays;
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

public class ComparatorExample {
    static class AgeComparator implements Comparator<Object> {
        @Override
        public int compare(Object obj1, Object obj2) {
            if (obj1 instanceof Student && obj2 instanceof Student) {
                Student student1 = (Student) obj1;
                Student student2 = (Student) obj2;
                // return Integer.compare(student1.getAge(), student2.getAge());
                return student1.getAge() - student2.getAge();
            }
            return 0; // Default comparison for other types
        }
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student("Alice", 25),
                new Student("Bob", 30),
                new Student("Charlie", 22)
        };

        System.out.println("Original order:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Use the AgeComparator (local class) to sort the array
        Arrays.sort(students, new AgeComparator());

        // Display the sorted order
        System.out.println("\nSorted order based on age:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
