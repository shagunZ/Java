import java.util.*;
class Student{
    String name;
    int roll; 
    void setDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name:");
        this.name = sc.nextLine();
        System.out.println("enter roll:");
        this.roll = sc.nextInt();

    }
    void getDetails(){
        System.out.println(this.name+" : "+ this.roll);
    }
}

public class ArrofObj {
    public static void main(String[] args) {
        System.out.println("enter size of arr");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Student [] stu = new Student[size];

        for(int i =0;i<size;i++){
            stu[i] = new Student();
            stu[i].setDetails();
        }

        for(int i=0;i<size;i++){
            stu[i].getDetails();
        }
    }
}
