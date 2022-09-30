package Day_48_Collections;

import java.util.Stack;

public class Stack_Examlple {
    public static void main(String[] args) {
        Stack<Object> stack=new Stack<>();           //kova gibi düşün son giren ilk cıkar...
        stack.add(true);
        stack.add(5);
        stack.add("Merhaba");
        stack.add('C');
        stack.add(8.8);

        System.out.println(stack.size());

        stack.push("dünya");     // hem ekler hem de yazdırır..
        System.out.println(stack.peek());   // peek son veriyi getirir ama silmez ..  pop ile peek arasındaki fark budur..

        System.out.println(stack.size());


    }
}