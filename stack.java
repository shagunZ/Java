import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();
        animals.push("Lion");
        animals.push("dog");
        animals.push("cat");
        System.out.println(animals.peek());
        System.out.println("animals: "+animals);
        animals.pop();
        System.out.println("animals are: "+animals);
    }
}
