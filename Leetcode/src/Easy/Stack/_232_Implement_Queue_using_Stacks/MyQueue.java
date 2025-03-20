package Easy.Stack._232_Implement_Queue_using_Stacks;

import java.util.Stack;

public class MyQueue {
    private Stack<Integer> s1 = new Stack<>();

    public void push(int x) {
        if (s1.isEmpty()) {
            s1.push(x);
            return;
        }
        int top = s1.pop();
        push(x);
        s1.push(top);
    }

    public int pop() {
        return s1.pop();
    }

    public int peek() {
        return s1.peek();
    }

    public boolean empty() {
        return s1.isEmpty();
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        System.out.println(queue.peek()); // Output: 1
        System.out.println(queue.pop());  // Output: 1
        System.out.println(queue.pop());  // Output: 2
        System.out.println(queue.empty()); // Output: false
    }
}
