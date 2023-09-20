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
class Computer{
    String name;
    String desc; 
    void setCDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name:");
        this.name = sc.nextLine();
        System.out.println("enter desc:");
        this.desc = sc.nextLine();

    }
    void getCDetails(){
        System.out.println(this.name+" ::::"+ this.desc);
    }
    void useofthis(){
        System.out.println("in comp");
    }
}

public class ArrofDiffObj {

      Student st = new Student();
        Computer cp = new Computer();
        void useofthis(){
        System.out.println("in arrofdiffobj");
    }
        void inputD(){
            this.st.setDetails();
            cp.setCDetails();
        }
        void displayD(){
            this.st.getDetails();
            cp.getCDetails();
            this.cp.useofthis();
        }
        ArrofDiffObj(){
            System.out.println("constructor");
        }
    public static void main(String[] args) {
        
      ArrofDiffObj A = new ArrofDiffObj();
        A.inputD();
        A.displayD();
        A.useofthis();

    }
}
