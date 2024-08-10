import java.util.HashSet;
import java.util.Iterator;

class hashset {

    public static void main(String args[]) {
        //creating
        HashSet<Integer> set = new HashSet<>();

        //insert
        set.add(1);
        set.add(2);
        set.add(3);

        //search-contains
        if (set.contains(1)) {
            System.out.println("Set contains 1");
        }

        //remove
        set.remove(1);
        if (!set.contains(1)) {
            System.out.println("Deleted 1");
        }

        //size = Ignores the duplicate elements
        System.out.println("Size is " + set.size());

        //printing all elements
        System.out.println(set);

        //Iterator - functions 1) hasNext => boolean, 2) next => value
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
