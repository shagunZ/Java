import java.util.*;
public class objectclass {
    String name; 
    int rollno;
    public objectclass(String name,int rollno){
        this.name = name;
        this.rollno = rollno ;
    }
    public String toString(){
        return "Name: "+this.name + ",roll: "+this.rollno;
    }
    public boolean equals(Object o){
        if(this==o)return true;
        if(o==null||getClass()!=o.getClass())return false;
        objectclass stu = (objectclass) o;
        return rollno == stu.rollno;
    }

    public int hashCode(){
        return Objects.hash(rollno);
    }
    public static void main(String[] args) {
        objectclass student1=new objectclass("John",23);
        objectclass student2=new objectclass("Jane",45);
        objectclass student3=new objectclass(" zane",45);
        System.out.println(student1.equals(student2)); //false because they have same roll no but different names
        System.out.println(student2.equals(student3)); //true
        // System.out.println(student2.toString());//Name: Jane
        // System.out.println(Objects.hash(student2));//-1139777280
        System.out.println(student1.toString());


        //we have defined that two students are different only when their roll numbers are different, ie overriding of equals functions
        Set<objectclass> studentset = new HashSet<>();
        studentset.add(new objectclass("abd",11 ));
        studentset.add(new objectclass("rbd",13 ));
        studentset.add(new objectclass("rbd",13 ));
        System.out.println(studentset);
    }
}

