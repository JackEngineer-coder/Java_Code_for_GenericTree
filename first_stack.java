import java.util.*;

public class  first_stack{

  public static void main(String[] args) {
    // Write your code here

    Stack<Integer> stack = new Stack<>();
    stack.push(10);
    stack.push(100);
    stack.push(1000);

    System.out.println(stack.peek());
    stack.pop();


    System.out.println(stack.peek());
    stack.pop();
  

    System.out.println(stack.peek());
    stack.pop();

    

  }
}