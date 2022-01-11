import java.util.*;



public class first_queue{


    public static void main(String[] args) {
       Queue<Integer> queue = new ArrayDeque<>();
       queue.add(10);
       queue.add(20);
       queue.add(30);

       System.out.print(queue);
       System.out.println(queue.peek());
       queue.remove();


       System.out.print(queue);
       System.out.println(queue.peek());
       queue.remove();



    }
}