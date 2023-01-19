package sessions;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetConcept {
    public static void main(String[] args) {
        HashSet<Integer> hashSet=new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(40);
        hashSet.add(30);
        hashSet.add(30);
        hashSet.add(null);

        // 1st way
        System.out.println(hashSet);
        // 1. Does not follow insertion order.
        // 2. Duplicates are not allowed.
        // 3. Null is allowed.
        System.out.println("===================");
        // 2nd way to print by using for each loop
        for (Integer i:hashSet) {
            System.out.println(i);
        }
        System.out.println("===================");
        //3rd way
        Iterator it= hashSet.iterator();
        System.out.println(it.next());
        System.out.println("================");
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

    }
}
