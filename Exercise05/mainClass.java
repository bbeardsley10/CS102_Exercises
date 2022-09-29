package Exercise05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * mainClass
 */
public class mainClass {

    public static void main(String[] args) {
        

        /*Example of Linked lists */

        LinkedList myLL = new LinkedList();
        myLL.add(5);
        myLL.add(-5);
        myLL.add(20);
        myLL.add("Brenton");
        myLL.add(2.8);

        myLL.remove(); //This removes the first number in the linked list (5)
        System.out.println(myLL);

        // FIFO - First IN First OUT Data Structure
        // LIFO - Last IN First OUT Data Structure


        /* Implementation of Queue Function */


        Queue<String> myQ = new LinkedList();
        myQ.add("green");
        myQ.add("yellow");
        myQ.add("blue");
        myQ.add("pink");
        myQ.add("grey");

        System.out.println(myQ);
        myQ.poll();                    //poll removes the first object in the queue
        System.out.println(myQ);
        myQ.poll();
        System.out.println(myQ);


        /* Implmentation of Stack Function */


        Stack<String> myStack = new Stack();
        myStack.push("green");
        myStack.push("yellow");
        myStack.push("blue");
        myStack.push("pink");
        myStack.push("grey");

        System.out.println(myStack);
        myStack.pop();              //Removes the last item that was added to the stack
        System.out.println(myStack);
        myStack.pop();
        System.out.println(myStack);
    }
}