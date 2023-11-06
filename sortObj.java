import java.util.Arrays;

public class sortObj implements Comparable<sortObj>{
    String name = "";
    String id = "";
    int salary = 0;
    public sortObj(String n, String i, int s){
        this.name = n;
        this.id = i;
        this.salary = s;
    }

    public int compareTo(sortObj e){
        // if(this.salary < e.salary) return -1;
        // if(this.salary>e.salary)return 1;
        // else return 0; 
        return this.salary-e.salary;
    }
    public static void main(String[] args) {
        sortObj e1 = new sortObj("a","1",1100);
        sortObj e2 = new sortObj("b","2",250);
        sortObj e3 = new sortObj("c","3",200);
        sortObj[] arr = new sortObj[3];
        arr[0] = e1;
        arr[1]=e2;
        arr[2]=e3;
        Arrays.sort(arr);
        for(sortObj e : arr){
            System.out.println(e.name + " "+e.id + " "+e.salary);
        }
    }
}
