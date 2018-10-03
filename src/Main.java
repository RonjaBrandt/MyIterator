import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Ronja on 2018-10-03.
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Annika");
        names.add("Simona");
        names.add("Emma");
        names.add("Missy");
        /*names.forEach((String name) -> System.out.println(name));*/
        names.forEach(name -> System.out.println(name));

        names.removeIf(name-> name.startsWith("A"));
        names.forEach(name-> System.out.println(name));
       /* System.out.println(names);

        Iterator iter = names.iterator();

        while(iter.hasNext()) {
            String name = (String) iter.next();
            if (name.equals("Missy")){
                iter.remove(); //deletes teh last object
            }
        }

        System.out.println("After remove");
        for (String name : names){
            System.out.println(name);
        }*/
    }
}
