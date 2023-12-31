public class Tut3 {
    public static void main(String[] args){
        Person p1 = new Person();
        p1.name = "anuj";
        System.out.println("name is " + p1.name);
        p1.color(33);
        System.out.println("count: "+Person.count);

        Person p2 = new Person(22,"haina");
        System.out.println("p2: "+p2.age+" "+p2.name);

        Developer d1 = new Developer(11,"developerS");
        Developer d2= new Developer();
        d1.color(0);
        d1.color("darkmode");
    }
}

class Developer extends Person{
 public Developer() {
        super(); // Call the default constructor of the parent class
        System.out.println("Developer default constructor is called");
    }
    public Developer(int age,String name){
        super(age,name); //use to call parent constructor
                System.out.println("r is called ");
    }
    //so color is a example of runtime polymorphism
    void color(String c){
        System.out.println("Devcolor: "+c);
    }
    void color(int c){
        super.color(c);;
        System.out.println("Devcolorthis is neewejfejiswjofs: "+c);
    }
}


class Person{
    protected String name;   //children ko accessible ho baki kisi class ko ho na ho
    int age ;
    static int count ; //not a property of a object so using static and can be accessed using classname
    void color(int clr){
        System.out.println("color: "+clr);
    }
    Person(){
        count++;
        System.out.println("contructor is called "+count);
    }
    // Person(int newage,String newname){
    //     this();
    //     age = newage;
    //     name=newname;
    // }
    Person(int age,String name){
        this();
        this.age = age;
        this.name=name;
    }
}



//protected:accessible to that class and its children.