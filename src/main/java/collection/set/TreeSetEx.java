package collection.set;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetEx  {
    public static void main(String[] args) {
        SortedSet set = new TreeSet();

        String from  = "bat";
        String to = "d";

        // set 객체에 추가
        set.add("ant"); set.add("alias");
        set.add("batman"); set.add("aha");
        set.add("cola"); set.add("Cola");
        set.add("ddr"); set.add("dance");
        set.add("dEEE"); set.add("deee");
        set.add("ever"); set.add("giant");
        set.add("zoo");

        // 출력
        System.out.println(set);
        System.out.println("from:" + from + ", to: "+ to);
    }

    class Descend implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            Comparable c1 = (Comparable) o1;
            Comparable c2 = (Comparable) o2;
            return c1.compareTo(c2) * (-1); //역순으로 정렬

        }
    }

}
