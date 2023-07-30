import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void show(HashMap<Integer, String> hashMap){
        Set<Integer> keySet = hashMap.keySet();
        for(Integer key: keySet){
            System.out.println(key + " - " + hashMap.get(key));
        }
    }

//    public static void main(String[] args){
//        HashMap<Integer, String> hashMap = new HashMap<>();
//
//        hashMap.put(1, "Laptop");
//        hashMap.put(2, "Phone");
//        hashMap.put(3, "PC");
//        System.out.println(hashMap);
//    }

//    Map.Entry
    public static void main(String[] args){
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

        hashMap.put(1, "Java");
        hashMap.put(2, "Python");
        hashMap.put(3, "C++");

        for(Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

}
