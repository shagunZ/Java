import java.util.Scanner;
public class Tut2{
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println("name is "+name);
        // int age = sc.nextInt();
        // System.out.println("age is "+age);

        Person p1 = new Person(); //constructor is called while creating objects
        Person p2 = new Person(22,"haha");
        p1.age = 33;
        p1.name = "alina";
        System.out.println(p1.age + " " + p1.name);
        p1.eat();
        p1.walk();
        p1.walk(100);
        p2.walk();
        p2.walk(40);

        System.out.println(Person.count);

        Developer d1 = new Developer(66,"shah");
        d1.walk(90);
        d1.walk();
        
    }
}


//inheritence
class Developer extends Person{
    public Developer(int age,String name){
    super(age,name);
    }
    void walk(){
        System.out.println("developer "+name + " is walking");
    } //run time polymorphism
}

class Person{
    String name;
    int age;
    static int count; //means now its class ki property not object ki property which means ki isko access krne ke liye koi object bnane ki zaroorat nhi hai

    public Person(){
        count++;
        System.out.println("creating an object");
    }
    public Person(int age,String name){
        this();  //agar ek constructor se dosra constructor call karna hai toh like iss constructor se pehle simple Person vala constructor b call ho jayega and usme count++ hojayega.
        // name = newName;
        // age = newAge;
        this.name = name;  //ie usss class ke name ke andar ye vala name daal do
        this.age = age;
    }


    //these walk functions are compile time polymorphism (multiple forms)
    void walk(){
        System.out.println(name + " is walking");
    }
    void walk(int steps){
        System.out.println(name + " is walking " +steps);
    }
    void eat(){
        System.out.println(name + " is eating");
    }

}