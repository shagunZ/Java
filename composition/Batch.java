package composition;
import java.util.*;


class Student {
    private String name = " ";
    private int roll;

    void inpStudentDetail() {
        System.out.println("enter st name:");
        Scanner sc = new Scanner(System.in);
        this.name = sc.nextLine();
        System.out.println("enter roll: ");
        this.roll = sc.nextInt();
    }

    void displayStudentDetail() {
        System.out.println(this.name + ": " + this.roll);
    }
}

public class Batch{
    private String name = " ";
    private int sizeofBatch;
Student[] st;
    public void inpBatchDetail() {
        System.out.println("enter name and size of batch");
        Scanner sc = new Scanner(System.in);
        this.name = sc.nextLine();
        this.sizeofBatch = sc.nextInt();
        st = new Student[this.sizeofBatch];

        for(int i=0;i<this.sizeofBatch;i++){
            st[i] = new Student();
            st[i].inpStudentDetail();
        }
    }

    public void displayBatchDetail() {
        System.out.println("Batch: "+this.name);
       for(int i=0;i<this.sizeofBatch;i++){
            st[i].displayStudentDetail();
        }
    }
    public static void main(String[] args) {
        Batch bt = new Batch();
        bt.inpBatchDetail();
        bt.displayBatchDetail();
        System.out.println("btst");

    }
}
