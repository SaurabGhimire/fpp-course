package assignment8;

import java.util.Arrays;

public class MyPersonList {
    private final int INITIAL_LENGTH = 4;
    private Person[] currentArray;
    private int numOfElements;

    public static void main(String[] args) {
        MyPersonList test = new MyPersonList();
        test.add(new Person("Ghimire", "Saurab", 27));
        test.add(new Person("Pokhrel", "Yogen", 27));
    }

    public int getArrayLength() {
        System.out.println("Array length is : " + currentArray.length);
        return currentArray.length;
    }

    public MyPersonList() {
        currentArray = new Person[INITIAL_LENGTH];
        numOfElements = 0;
    }

    public void add(Person p) {
        System.out.println("Inside add : " + p);
        if (p == null) return;
        if (numOfElements == getArrayLength()) {
            resize();
        }
        currentArray[numOfElements] = p;
        numOfElements++;
        System.out.println(Arrays.toString(currentArray));
        System.out.println("-----");
    }

    private void resize() {
        System.out.println("Resizing");
        Person[] temp = new Person[getArrayLength() * 2];
        System.arraycopy(currentArray, 0, temp, 0, getArrayLength());
        currentArray = temp;
        System.out.println(Arrays.toString(currentArray));
        System.out.println("----");
    }

    public Person get(int i) {
        if (i < 0 || i >= numOfElements) {
            return null;
        }
        return currentArray[i];
    }

    public boolean isEmpty() {
        return numOfElements == 0;
    }

    public boolean find(Person p) {
        if (p == null || numOfElements == 0) return false;
        for (Person val : currentArray) {
            if (val.getLast().equals(p.getLast())) {
                return true;
            }
        }
        return false;
    }

    public void insert(Person p, int pos) {
        System.out.println("Inside insert p: " + p + "position: " + pos);
        if (pos < 0 || pos > numOfElements) return;
        if (p == null) return;
        if (numOfElements == getArrayLength()) {
            resize();
        }
        Person[] temp = new Person[getArrayLength()];
        System.arraycopy(currentArray, 0, temp, 0, pos);
        temp[pos] = p;
        System.arraycopy(currentArray, pos, temp, pos + 1, currentArray.length - (pos + 1));
        System.out.println(Arrays.toString(currentArray));
        System.out.println("----");
    }

    public boolean remove(Person p) {
        if (p == null) return false;
        if (numOfElements == 0) return false; //note
        int index = -1;
        for (int i = 0; i < getArrayLength(); i++) {
            if (currentArray[i].equals(p)) {
                index = i;
                break;
            }
        }
        if (index == -1) return false; // note
        Person[] temp = new Person[getArrayLength()];
        System.arraycopy(currentArray, 0, temp, 0, index);
        System.arraycopy(currentArray, index + 1, temp, index, currentArray.length - (index + 1));
        currentArray = temp; // note
        --numOfElements; // note
        return true;
    }


    public String toString() {
        StringBuilder base = new StringBuilder("[");
        for (int i = 0; i < getArrayLength(); i++) {
            base.append(i).append(", ");
        }
        return base + "]";
    }

    public int size() {
        return currentArray.length;
    }

    public Object clone() {
        Person[] temp = new Person[getArrayLength()];
        System.arraycopy(currentArray, 0, temp, 0, currentArray.length);
        return temp;
    }
}
