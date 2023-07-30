import com.sun.media.jfxmediaimpl.HostUtils;

import java.util.*;

public class Collection_Training_001 {
    public static void main(String[] args){
//        create arrayList
        List<String> arrayList = new ArrayList<>();
//        add data input arrayList
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("C++");

        System.out.println("Array List: " + arrayList);
//        create linkedList
        List<String> linkedList = new LinkedList<>();
//        add data input linkedList
        linkedList.add("Java");
        linkedList.add("Python");
        linkedList.add("C++");

        System.out.println("Linked List: " + linkedList);
//        create set
        Set<String> hashSet = new HashSet<>();
//        add data
        hashSet.add("Java");
        hashSet.add("Python");
        hashSet.add("C++");

        System.out.println("HashSet: " + hashSet);
//        create map
        Map<Integer, String> hashMap = new HashMap<>();
//        add data
        hashMap.put(1, "Java");
        hashMap.put(2, "Python");
        hashMap.put(3, "C++");

        System.out.println("Hashmap: " + hashMap);

//        Iterator show list key hashMap
        Iterator<Integer> iterator = hashMap.keySet().iterator();
        while (iterator.hasNext()){

            System.out.println(iterator.next());
        }

//        Foreach show key - value hashMap
        for(Map.Entry<Integer, String> keyMapItem: hashMap.entrySet()){
            System.out.println(keyMapItem.getKey() + "-" + keyMapItem.getValue());
        }


//        Iterator show list value list
        Iterator<String> iteratorArrayList = arrayList.iterator();
        while (iteratorArrayList.hasNext()){
            System.out.println(iteratorArrayList.next());
        }

//        Show list arrayList with foreach
        System.out.println("Show list array list with foreach: ");
        for (String arraylistItem: arrayList){
            System.out.print(arraylistItem + ",");
        }

//        Show list arrayList with index
        System.out.println("\nShow list array list with index: ");
        for(int i=0; i<arrayList.size(); ++i){
            System.out.print(arrayList.get(i) + ",");
        }
    }
}
