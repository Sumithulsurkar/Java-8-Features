package com.interviews.equalshashcod;

import java.util.HashMap;
import java.util.Objects;

public class EqualsAndHashCodeDemo {

    String str = "";

    EqualsAndHashCodeDemo(String str) {
        this.str = str;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        EqualsAndHashCodeDemo that = (EqualsAndHashCodeDemo) o;
        return Objects.equals(str, that.str);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(str);
    }

    /**
     * The equals method always returning true means all instances are considered equal.
     * The hashCode method always returning 2 means all instances have the same hash code.
     * The HashMap treats all instances as the same key, resulting in a single entry with the last assigned value.
     * @param args
     */
   /* @Override
    public boolean equals(Object o) {
        return true;
    }

    @Override
    public int hashCode() {
        return 2;
    }*/

    public static void main(String[] args) {
        EqualsAndHashCodeDemo a1 = new EqualsAndHashCodeDemo("AB");
        EqualsAndHashCodeDemo a2 = new EqualsAndHashCodeDemo("AB");
        EqualsAndHashCodeDemo a3 = new EqualsAndHashCodeDemo("PQ");
        EqualsAndHashCodeDemo a5 = new EqualsAndHashCodeDemo("PQQ");
        EqualsAndHashCodeDemo a4 = a1;

        HashMap<EqualsAndHashCodeDemo,Integer> mp = new HashMap<EqualsAndHashCodeDemo, Integer>();
        mp.put(a1,1);
        mp.put(a1,2);
        mp.put(a2,2);
        mp.put(a3,2);
        mp.put(a4,3);

        int size = mp.size();

        System.out.println("Size of the map: " + size);  //1
        System.out.println(mp.get(a1));  // 3
        System.out.println(mp.get(a2)); //   3
        System.out.println(mp.get(a3)); //    3
        System.out.println(mp.get(a4)); // 3
        System.out.println(mp.get(a5)); //   null   (3)
    }
}
