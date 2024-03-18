package assignment11.prob1;

import java.util.*;

public class Admin {
    public static HashMap<Key, Student> processStudents(List<Student> students) {
        HashMap<Key, Student> map = new HashMap<>();
        for (Student s : students) {
            map.put(new Key(s.getFirstName(), s.getLastName()), s);
        }
        return map;
    }

    public static double computeAverageGPA(HashMap<Key, Student> maps) {
        Iterator<Student> s = maps.values().iterator();
        double gpaSum = 0.0;
        int count = 0;
        while (s.hasNext()) {
            Student temp = s.next();
            gpaSum += temp.getGpa();
            count++;
        }
        return gpaSum / count;
    }
}
