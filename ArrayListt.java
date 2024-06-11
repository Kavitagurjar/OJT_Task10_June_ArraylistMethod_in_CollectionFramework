import java.util.ArrayList;
public class ArrayListt {
    public static void main(String[] args) {
        // ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list = new ArrayList<String>();

        list.add("Kavita");
        list.add("Gurjar");
        list.add("Hello");
        list.add("World");
        list.add("Java");
        System.out.println(list);
        //to remove elements
        list.remove(1); 
        System.out.println(list);

        //to update
        list.set(0, "Kavita");
        System.out.println(list);

        //to get index
        System.out.println(list.indexOf("Kavita"));

        //to get elements
        System.out.println(list.get(2));

        //to get size
        System.out.println(list.size());
        // list.clear();

        //to check if list is empty
        System.out.println(list.isEmpty());

        //to check if list contains
        System.out.println(list.contains("Kavita"));

        //to sort
        list.sort(null);
        System.out.println(list);
        
    }
}
