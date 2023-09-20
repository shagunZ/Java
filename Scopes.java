public class Scopes {
    Scopes(){
        System.out.println("this is constructor");
    }

    {
        System.out.println("this is object initialization block");
    }

    static{
        System.out.println("this is static block");
    }

    public static void main(String[] args) {
        System.out.println("inside main");
        Scopes s = new Scopes();
    }
}
