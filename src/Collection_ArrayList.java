import java.util.ArrayList;

import java.util.Arrays;

public class Collection_ArrayList {
    public static void main(String[] args){
        //1. Khai bao arrayList
        ArrayList<Integer> arrayList1 = new ArrayList<>();
//        2. khai bao voi so luong ban dau
        ArrayList<Integer> arrayList2 = new ArrayList<>(10);
//        3. Khai bao voi list cho truoc
        ArrayList<Integer> arrayList3 = new ArrayList<>(Arrays.asList(1, 3, 4, 5));

//        xuat list
        System.out.println(arrayList1);
        System.out.println(arrayList2);
        System.out.println(arrayList3);

//        4. Add thêm phân tử
        ArrayList<Integer> arrayList4 = new ArrayList<>();
        arrayList4.add(1);
        arrayList4.add(3);
        arrayList4.add(4);

        System.out.println(arrayList4);

        arrayList4.add(0,5);
        arrayList4.add(2, 7);
        System.out.println(arrayList4);

//        show size arrayList
        System.out.println(arrayList4.size());

//        remove (index)
        arrayList4.remove(2);
        System.out.println(arrayList4);

//        5. Remove 1 phan tu duoc chi dinh
        ArrayList<Integer> arrayList5 = new ArrayList<>(Arrays.asList(1,3,4,5,6));
        System.out.println(arrayList5);

//        arrayList5.remove(Integer.valueOf(5));
//        System.out.println(arrayList5);

//        6. set(index, value)
        arrayList5.set(1,2);
        System.out.println(arrayList5);
    }
}
