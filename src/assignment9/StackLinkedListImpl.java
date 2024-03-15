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
        // No items in list
        if (list.val == null) {
            list = new MyLinkedList(item);
            return;
        }
        // More than 2 items in list
        MyLinkedList temp = list;
        while (temp.next != null) {
            temp = list.next;
        }
        temp.next = new MyLinkedList(item);
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
            System.out.println("Popping value: " + item);
            return item;
        }
        // more than one item
        MyLinkedList temp = list;
        while (temp.next.next != null) { // 1 - 2 - 3 - 4 - 5 - null
            temp = list.next;
        }
        item = temp.next.val;
        temp.next = null;
        System.out.println("Popping value: " + item);
        return item;
    }

    public boolean isEmpty() {
        return list.val == null;
    }

    public Object peek() {
        System.out.println("Inside peek");
        if (isEmpty()) {
            System.out.println("Empty");
            return null;
        }
        MyLinkedList temp = list;
        while (temp.next != null) {
            temp = temp.next;
        }
        System.out.println("Peeking stack: " + temp.val);
        return temp.val;
    }

    public int size() {
        int count = list.val == null ? 0 : 1;
        MyLinkedList temp = list;
        while (temp.next != null) {
            temp = temp.next;
            count++;
        }
        System.out.println("Size of stack: " + count);
        return count;
    }


    public static void main(String[] args) {
        StackLinkedListImpl a = new StackLinkedListImpl();
        a.push(10);
        a.size();
        a.peek();
        a.push("Alpha");
        a.size();
        a.peek();
        a.push("Henry");
        a.size();
        a.peek();
        System.out.println(" ----- ");
        a.pop();
        a.size();
        a.peek();
        a.pop();
        a.size();
        a.peek();
        a.pop();
        a.size();
        a.peek();
    }


}