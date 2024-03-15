package assignment9;

import java.util.Arrays;

public class ArrayQueueImpl {
    private int[] arr = new int[10];
    // rear = no. of elements in array
    // front = index of first element, either 0 or -1
    // Seems like we don't need front, becauser front item is always 0 if rear>0
    private int front = -1;
    private int rear = 0;

    public static void main(String[] args) {
        ArrayQueueImpl arrayQueue = new ArrayQueueImpl();
        arrayQueue.peek();
        arrayQueue.enqueue(1);
        arrayQueue.enqueue(2);
        arrayQueue.enqueue(3);
        arrayQueue.enqueue(4);
        arrayQueue.dequeue();
        arrayQueue.dequeue();
        arrayQueue.peek();
        arrayQueue.enqueue(5);
        arrayQueue.enqueue(6);
        arrayQueue.enqueue(7);
        arrayQueue.enqueue(8);
        arrayQueue.enqueue(9);
        arrayQueue.enqueue(10);
        arrayQueue.enqueue(11);
        arrayQueue.enqueue(12);
        arrayQueue.enqueue(13);
        arrayQueue.enqueue(14);
        System.out.println(Arrays.toString(arrayQueue.arr));
        arrayQueue.dequeue();
        arrayQueue.dequeue();
        arrayQueue.peek();
        arrayQueue.dequeue();
        arrayQueue.dequeue();
        arrayQueue.dequeue();
        arrayQueue.dequeue();
    }

    public int peek() {
        System.out.println("Inside peek func");
        if (rear == 0) return -1;
        System.out.println("Peeked val is: " + arr[rear - 1]);
        return arr[rear - 1];
    }

    public void enqueue(int obj) {
        if (rear == arr.length) resize();
        arr[rear] = obj;
        rear++;
        System.out.println("Arr after enqueue of val " + obj + " is: " + Arrays.toString(arr));
    }

    public int dequeue() {
        if (rear == 0) return -1;
        int dequeueVal = arr[0];
        int[] temp = new int[arr.length];
        System.arraycopy(arr, 1, temp, 0, rear);
        arr = temp;
        rear--;
        System.out.println("Array after dequeue of val " + dequeueVal + " is: " + Arrays.toString(arr));
        return dequeueVal;
    }

    public boolean isEmpty() {
        return rear == 0;
    }

    public int size() {
        return rear;
    }

    private void resize() {
        System.out.println("Resizing arr of length: " + arr.length);
        int[] temp = new int[arr.length * 2];
        System.arraycopy(arr, 0, temp, 0, arr.length);
        arr = temp;
        System.out.println("Resized arr is: " + Arrays.toString(arr));
    }
}
