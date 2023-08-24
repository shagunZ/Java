public class Tut4 {
    public static void main(String[] args){
        Laptop l1 = new Laptop();
        // l1.price = 22;
        l1.setPrice(22);
        System.out.println(l1.getPrice());
    }
}

class Laptop{
    int ram;
    private int price;

    public void setPrice(int price){
        //validations eg,
        boolean isAdm = true;
        if(!isAdm)System.out.println("you cannot set");
        else
        this.price = price;
    }

    public void setRam(int ram){
        this.ram = ram;
    }
    public int getPrice(){
        return price;
    }
}