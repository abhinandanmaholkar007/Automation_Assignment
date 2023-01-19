package sessions;

import java.util.HashSet;

public class HashSetMethodsExplore {
    public static void main(String args[]){
        HashSet<String> set=new HashSet<>();
        set.add("Abhi");
        set.add("Nikhil");
        set.add("Shashvat");
        set.add("Pavan");
        System.out.println("An initial list of elements: "+set);
        //Removing specific element from HashSet
        set.remove("Pavan");
        System.out.println("After invoking remove(object) method: "+set);
        HashSet<String> set1=new HashSet<>();
        set1.add("Viraj");
        set1.add("Himanshu");
        set.addAll(set1);
        System.out.println("Updated List: "+set);
        //Removing all the new elements from HashSet
        set.removeAll(set1);
        System.out.println("After invoking removeAll() method: "+set);
        //Removing elements on the basis of specified condition
        set.removeIf(str->str.contains("Abhi"));
        System.out.println("After invoking removeIf() method: "+set);
        //Removing all the elements available in the set
        set.clear();
        System.out.println("After invoking clear() method: "+set);
    }
}

