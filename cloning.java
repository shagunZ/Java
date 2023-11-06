class Demo {
    int x = 333;
}

public class cloning implements Cloneable{
    String name =" ";
    String id = " ";
    Demo d = new Demo();
    public cloning(String s,String i){
        this.name = s;
        this.id =i;
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    public static void main(String[] args) {
        cloning s1 = new cloning("A","1");
        try{
            cloning clone = (cloning) s1.clone();
            System.out.println("yes");
            System.out.println(s1.name);
            System.out.println("///");
            System.out.println(clone.name);

        System.out.println(s1.d.x);
        s1.d.x = 2;
        System.out.println(s1.d.x);
        System.out.println(clone.d.x);
        clone.d.x = 8;
        System.out.println(s1.d.x);
        System.out.println(clone.d.x);

        System.out.println(clone==s1);

        }catch(CloneNotSupportedException e){
            System.out.println("err"+e);
        }     
    }
}
