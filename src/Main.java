import java.util.ArrayList;
import java.util.LinkedList;

public class Main {


    public static void main(String[] args) {
    hashmap<String,Integer> map=new hashmap<>();
        System.out.println(map.isEmpty());
    map.put("Pakistan",15);
        map.put("Iran",10);
        map.put("Iraq",11);
        map.put("Canada",12);
        System.out.println(map.get("Pakistan"));
        System.out.println(map.get("india"));
        ArrayList<String> countries=map.keyset();
       for (int i=0;i<countries.size();i++){
           System.out.println(countries.get(i)+": "+map.get(countries.get(i)));
       }
        System.out.println(map.isEmpty());
        System.out.println(map.containskey("Iran"));
        System.out.println( map.containskey("bangladesh"));
        System.out.println(map.remove("Canada"));
        System.out.println(map.remove("india"));

    }
}