import java.util.ArrayList;
import java.util.Collections;

class Arraylist {

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<Boolean> list2 = new ArrayList<Boolean>();

        //add elements
        list.add(0);
        list.add(1);

        System.out.println(list);

        //get element
        int el = list.get(0);
        System.out.println(el);

        //add element in between
        list.add(1, 2); //(index, value)
        System.out.println(list);

        //set element
        list.set(0, 5);
        System.out.println(list);

        //delete element
        list.remove(2); //(index)
        System.out.println(list);

        //size
        int size = list.size();
        System.out.println(size);

        //loops
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ",");
        }
        System.out.println();

        //sorting
        Collections.sort(list);
        System.out.println(list);
    }
}
