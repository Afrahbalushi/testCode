import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;

public class set {

    public static void main(String[] args) throws IOException {

        // creating LinkedHashSet implementation using the Set

        Set<String> emailset = new HashSet<>();

        emailset.add("Mohammed@gmail.com");
        emailset.add("Mohammed@gmail.com");
        emailset.add("Mohammed@gmail.com");
        emailset.add("Mohammed@hotmail.com");
        emailset.add("Mohammed@gmail.com");
        emailset.add("Isra@gmail.com");
        emailset.add("Isra@gmail.com");
        emailset.add("Fahima@gmail.com");
        emailset.add("noor@gmail.com");

        //System.out.println(emailset);


        Map<String,String> map = new HashMap<>();


        map.put("sleep","rest");
        map.put("apple","fruit");
        map.put("cat","animal");
        map.put("java","language");


        map.put("java","code");

        map.remove("apple");
      //  System.out.println(map);


        Map<Integer,String> map1 = new HashMap<>();

        map1.put(102,"Fahima");
        map1.put(105,"Ahmed");
        map1.put(106,"Isra");
        map1.put(107,"Mohammed");

        System.out.println(map1);




    }
}
