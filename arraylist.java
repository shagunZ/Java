import java.util.ArrayList;

class Student{
    String name;
    int roll;
    Student(String name, int roll){
        this.name = name;
        this.roll= roll;
    }
}
public class arraylist {

    public static void main(String[] args) {
        
        ArrayList<Student> list = new ArrayList<Student>();
        Student s1 = new Student("A",1);
        list.add(s1);
        
        Student st = list.get(0);
        System.out.println(st);
        
        list.add(0,new Student("N", 10));
        list.set(1,new Student("e", 5));
        System.out.println(list);


        Student[] arr = new Student[list.size()];
        list.toArray(arr);
        System.out.println("arr: "+arr);
    }

}
