package assignment6;

public class MyTable {
    private Entry[] entries = new Entry[26];

    // returns the String that is matched with char c in the table
    public String get(char c) {
        int cIntValue = (int) c;
        if (cIntValue < 97 || cIntValue > (97 + 26)) {
            System.out.println("The corresponding str for " + c + " not found");
            return "";
        }
        int index = cIntValue - 97;
        return entries[index].getStr();
    }

    public static void main(String[] args) {
        MyTable t = new MyTable();
        t.add('a', "Andrew");
        t.add('b', "Billy");
        t.add('w', "Willie");
        System.out.println(t);
    }


    //adds to the table a pair (c, s) so that s can be looked up using c
    public void add(char c, String s) {
        // a = 97
        int cIntValue = (int) c;
        if (cIntValue < 97 || cIntValue > (97 + 26)) {
            System.out.println("Please add lower case alphabets");
            return;
        }
        int index = cIntValue - 97;
        entries[index] = new Entry(c, s);
    }

    // returns a String consisting of nicely formatted display
    // of the contents of the table
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (Entry entry : entries) {
            if (entry == null) continue;
            str.append(entry.toString() + "\n");
        }
        return str.toString();
    }

    private class Entry {
        char ch;
        String str;

        Entry(char ch, String str) {
            this.ch = ch;
            this.str = str;
        }

        //returns a String of the form "ch->str"
        public String toString() {
            return ch + "->" + str;
        }

        public String getStr() {
            return str;
        }
    }
}
