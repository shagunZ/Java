class ExceptionDemo extends Exception{
    public String toString(){
        return "User defined Exception:demo";
    }
}
public class userException {
    public static void main(String[] args) {
        Exception d = new ExceptionDemo();
        try{
            throw new ExceptionDemo();
        }catch(ExceptionDemo e){
            System.out.println(e);}
    }
}


