import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;

public class HashMap_Iterator {
//    public static void main(String[] args){
////        create hashmap
//        HashMap<Integer, String> hashMap = new HashMap<>();
////        put data into hashMap
//        hashMap.put(1, "Java");
//        hashMap.put(2, "Python");
//        hashMap.put(3, "C++");
////        show hashMap
//        Iterator<Integer> iterator = hashMap.keySet().iterator();
//        while (iterator.hasNext()){
//            System.out.println(hashMap.get(iterator.next()));
//        }
//    }

    public static void main(String[] args){
//        create ArrayList
        ArrayList<String> language = new ArrayList<>();
//        Add items into ArrayList
        language.add("English");
        language.add("Vietnamese");
        language.add("Chinese");
//        Using iterator to show arrayList
        Iterator<String> iterator = language.iterator();

//        If iterator have next item, statement will continue implement
        while(iterator.hasNext()){
            Object object = iterator.next();
            System.out.println(object);
        }

//        Change value with ListInterator
        ListIterator<String> listIterator = language.listIterator();
        while(listIterator.hasNext()){
            Object object = listIterator.next();
            listIterator.set(object + "Learning");
        }

        iterator = language.listIterator();

        while(iterator.hasNext()){
            Object object = iterator.next();
            System.out.println(object);
        }

//        show list data 

    }
}
