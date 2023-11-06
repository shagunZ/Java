public class varargs {

    public void demo(String ...arr){
        for(String s : arr){
            System.out.println("Value is "+s);
        }
        System.out.println(arr.length);
    }
    public static void main(String[] args) {
     varargs t = new varargs();
     t.demo("A","B");   
    }
}
