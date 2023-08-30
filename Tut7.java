import java.util.Scanner;

public class Tut7 {
    // Array of Objects
    public static void main(String[] args) {
        Student[] stuarr;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int n = sc.nextInt();
        stuarr = new Student[n];
        for (int i = 0; i < stuarr.length; ++i) {
            stuarr[i] = new Student();
            stuarr[i].inputStu();
        }

        for (Student st : stuarr) {
            st.displayStu();
        }

        Teacher[] teaArr;
        sc = new Scanner(System.in);
        System.out.print("\n Enter the no.of teachers ");
        int t = sc.nextInt();
        teaArr = new Teacher[t];   
        for(int i=0;i<teaArr.length;i++){
            teaArr[i] = new Teacher();
            teaArr[i].inputTea();
        }
        for(Teacher ta:teaArr)
            ta.displayTea();
    }
}

class Student {
    private String name = " ";
    private String roll = " ";

    void inputStu() {
        System.out.println("Enter Name");
        Scanner sc = new Scanner(System.in);
        this.name = sc.nextLine();
        System.out.println("Enter roll");
        sc = new Scanner(System.in);
        this.roll = sc.nextLine();

    }

    void displayStu() {
        System.out.println("name: " + this.name + " roll: " + this.roll);
        ;

    }

}

class Teacher {
    private String subj = " ";
    private String desg = " ";

    void inputTea() {
        System.out.println("Enter subject");
        Scanner sc = new Scanner(System.in);
        this.subj = sc.nextLine();
        System.out.println("Enter desgnation");
        sc = new Scanner(System.in);
        this.desg = sc.nextLine();

    }

    void displayTea() {
        System.out.println("subject: " + this.subj + " designation: " + this.desg);
        ;

    }

}
