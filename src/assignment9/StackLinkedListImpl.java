package assignment9;

import java.util.Stack;

public class StackLinkedListImpl {

    class MyLinkedList {
        Object val;
        MyLinkedList next;

        MyLinkedList(Object val) {
            this.val = val;
        }

        MyLinkedList() {
        }


    }

    private MyLinkedList list;

    public StackLinkedListImpl() {
        list = new MyLinkedList();
    }

    public void push(Object item) {
        MyLinkedList temp = new MyLinkedList();
        while (list.next != null) {
            temp = list.next;
        }
        list.next = new MyLinkedList(item);
    }

    public Object pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        Object item;
        // only one item
        if (list.next == null) {
            item = list.val;
            list.val = null;
            return item;
        }
        // more than one item
        MyLinkedList temp = list;
        while (list.next.next != null) {
            item = list.next;
            list.next = null;
            return item;
        }
        return null;
    }

    public boolean isEmpty() {
        return list.val == null;
    }

    public Object peek() {
        if (isEmpty()) {
            return null;
        }
        Object val = list.val;
        while (list.next != null) {
            val = list.next;
        }
        System.out.println("Peeking stack: " + val);
        return val;
    }

    public int size() {
        int count = 0;
        while (list.next != null) {
            count++;
        }
        System.out.println("Size of stack: " + count);
        return count;
    }


    public static void main(String[] args) {
        StackLinkedListImpl a = new StackLinkedListImpl();
        a.push(10);
        a.push("Alpha");
        a.push("Henry");
        System.out.println(a.pop());

        Stack<Integer> s = new Stack<Integer>();
        s.push(42);
        s.push(-3);
        s.push(17);
        System.out.println(s.pop());
    }


}