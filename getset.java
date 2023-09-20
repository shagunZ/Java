public class getset {

    private String name;
    private int age;

    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name = name;
    }

    public int getage(){
        return age;
    }
    public void setage(int age){
        this.age = age;
    }


    public static void main(String[] args) {
        getset N = new getset();
        N.setname("shagun");
        N.setage(20);

        System.out.println(N.getname());
        System.out.println(N.getage());
    }
    
}
