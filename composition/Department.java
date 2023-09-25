
import java.util.*; 
import composition.Batch; 

public class Department {
    private String name;
    private int sizeofDepartment;
    Batch[] bt;

    void inpDepartmentDetail(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name of department");
        this.name = sc.nextLine();
               System.out.println("Enter the number of batches in this department");
               sizeofDepartment =sc.nextInt();
               bt = new Batch[sizeofDepartment]; 
               for(int i=0;i<sizeofDepartment;i++){
                bt[i] = new Batch();
                bt[i].inpBatchDetail(); 
               }
    }

    void displayDepartmentdetail(){
        System.out.println("department: "+this.name);
        for(int i=0;i<this.sizeofDepartment;i++){
            bt[i].displayBatchDetail();
        }
    }

    public static void main(String[] args) {
        Department dpt = new Department();
        dpt.inpDepartmentDetail();
        dpt.displayDepartmentdetail();
    }

}
