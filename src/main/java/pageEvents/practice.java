package main.java.pageEvents;

import java.util.*;

public class practice {
    public static void main(String[] args) {

        List<Integer> integerlist = new ArrayList<Integer>();
        integerlist.add(2);
        integerlist.add(2);
        integerlist.add(3);
        integerlist.add(3);
        integerlist.add(4);
        integerlist.add(4);

        System.out.println(integerlist);

        Set<Integer> removeduplicate = new LinkedHashSet<>(integerlist);

        integerlist.clear();
        integerlist.addAll(removeduplicate);
        System.out.println(integerlist);
    }
}
