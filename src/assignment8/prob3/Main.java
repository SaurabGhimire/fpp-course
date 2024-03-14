package assignment8.prob3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Marketing> mList = new ArrayList<Marketing>();
        mList.add(new Marketing("saurab", "iphone", 1000));
        mList.add(new Marketing("yogen", "mac", 1600));
        mList.add(new Marketing("benefo", "ipad", 1000));
        mList.add(new Marketing("luwam", "car", 2200));

        mList.remove(0);
        System.out.println("The list of the array is:" + mList.size());
        System.out.println(mList.get(0) + " == " + mList.get(1) + " : " + mList.get(0).equals(mList.get(1)));
        List<Marketing> morethan1000 = listMoreThan1000(mList);
        System.out.println("List more than 1000 with sorting :" + morethan1000);
    }

    public static List<Marketing> listMoreThan1000(List<Marketing> list) {
        List<Marketing> m = new ArrayList<Marketing>();
        Iterator<Marketing> it = list.iterator();
        while (it.hasNext()) {
            Marketing next = it.next();
            if (next.getSalesAmount() > 1000)
                m.add(next);
        }
        Marketing.sortEmployeesByName(m);
        return m;
    }
}
