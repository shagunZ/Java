class Demo implements Cloneable {
    int x = 333;

 
    public Demo clone() throws CloneNotSupportedException {
        return (Demo) super.clone();
    }
}

public class DeepClone implements Cloneable {
    String name = " ";
    String id = " ";
    Demo d = new Demo();

    public DeepClone(String s, String i) {
        this.name = s;
        this.id = i;
    }

    
    public Object clone() throws CloneNotSupportedException {
        DeepClone clonedObject = (DeepClone) super.clone();
        clonedObject.d = (Demo) d.clone(); // Perform deep cloning for the 'd' field
        return clonedObject;
    }

    public static void main(String[] args) {
        DeepClone s1 = new DeepClone("A", "1");
        try {
            DeepClone clone = (DeepClone) s1.clone();

            System.out.println(s1.d.x);
            s1.d.x = 2;
            System.out.println(s1.d.x);
            System.out.println(clone.d.x);
            clone.d.x = 8;
            System.out.println(s1.d.x);
            System.out.println(clone.d.x);

            System.out.println(clone == s1);

        } catch (CloneNotSupportedException e) {
            System.out.println("err" + e);
        }
    }
}
