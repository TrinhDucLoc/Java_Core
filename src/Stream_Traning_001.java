import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product {
    int id;
    String name;
    float price;

    public Product(int id, String name, float price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public float getPrice(){
        return price;
    }
}

public class Stream_Traning_001 {
    public static void main(String[] args){
//        List<Product> listProduct = new ArrayList<Product>();
//
//        listProduct.add(new Product(1, "HP", 20));
//        listProduct.add(new Product(2, "DELL", 30 ));
//        listProduct.add(new Product(3, "Lenovo", 35));
//        listProduct.add(new Product(4, "Mac Book", 50));
//        listProduct.add(new Product(5, "Acer", 10));
//
//        List<Float> listProductPrices = new ArrayList<>();
//        for(Product obj: listProduct){
//            if(obj.price > 30){
//                listProductPrices.add(obj.price);
//            }
//        }
//        System.out.println("List price > 30: " +  listProductPrices);

        HashSet<Integer> array1 = new HashSet<>();
        array1.add(10);
        array1.add(1);
        array1.add(0);
        array1.add(5);
        array1.add(3);
        System.out.println("Find first: "+ array1.stream().findAny());

        array1.stream().sorted();


//        List<Float> listProductPrices2 = listProduct.stream()
//                .filter(item -> item.price == 30)
//                .map(item -> item.price)
//                .collect(Collectors.toList());
//        System.out.println("Show: " + listProductPrices2);
//
////        Java Stream Iterating
//        System.out.println("Java Stream Iterating 1: ");
//        Stream.iterate(1, element -> element + 1)
//                .filter(element -> element % 5 == 0)
//                .limit(5)
//                .forEach(System.out::println);
//
//        System.out.println("Java Stream Iterating 2: ");
//        Stream.iterate(1, items -> items + 1)
//                .filter(items -> items % 3 == 0)
//                .limit(5)
//                .forEach(System.out::println);
//
////        Filtering and Iterator collection
//        System.out.println("Product name have price = 30: ");
//        listProduct.stream()
//                .filter(items -> items.price == 30)
//                .forEach(items -> System.out.println(items.name));
//
////        Java Stream Example : reduce() Method in Collection
////        This is more compact approach for filtering data
//        Float totalPrice = listProduct.stream()
//                .map(item -> item.price)
//                .reduce(0f, (sum, price) -> sum+price);
//        System.out.println("Reduce: " + totalPrice);
//
//        Float totalPrice2 = listProduct.stream()
//                .map(item -> item.price)
//                .reduce(0f, Float::sum);
//        System.out.println("Reduce2: "+totalPrice2);
//
//
////        Java Stream Example: Sum by using Collectors Methods
//        double totalPrice3 = listProduct.stream()
//                        .collect(Collectors.summingDouble(item -> item.price));
//
//        System.out.println("Reduce3: " + totalPrice3);
//
////        Java Stream Example: Find Max and Min Product Price
//        Product productA = listProduct.stream()
//                .max((product1, product2) -> product1.price > product2.price ? 1 : -1).get();
//
//        System.out.println("Product max price: " + productA.price);
//
//        Product productB = listProduct.stream()
//                .min((product1, product2) -> product1.price > product2.price ? 1 : -1).get();
//
//        System.out.println("Product min price: " + productB.price);
//
////        Java Stream Example: count() Method in Collection
//        System.out.println("Count number of product base on filter: ");
//        long count = listProduct.stream()
//                .filter(item -> item.price < 35)
//                .count();
//        System.out.println(count);
//
////        Java Stream Example : Convert List into Set
//        Set<Float> pricetListSet = listProduct.stream()
//                .filter(item -> item.price < 35)
//                .map(item -> item.price)
//                .collect(Collectors.toSet());
//        System.out.println("Conver list into Set: " + pricetListSet);
////        Java Stream Example : Convert List into Map
//        Map<Integer,String> priceListMap = listProduct.stream()
//                .filter(item -> item.price < 35)
//                .collect(Collectors.toMap(item -> item.id, item -> item.name));
//        System.out.println("Conver list into Map: "+ priceListMap);
//
////        Method Reference in stream
//        List<Float> listPrice = listProduct.stream()
//                .filter(item -> item.price < 35)
//                .map(Product::getPrice)
//                .collect(Collectors.toList());
//
//        System.out.println("Method reference in stream: " + listPrice);

//        Long[] a = new Long[1];
//        System.out.println("A.length: "+ a.length);
//        a[0] = 1L;
//        a = new Long[a.length + 1];
//        a[1] = 2L;
//        a = new Long[a.length + 1];
//        a[2] = 3L;
//
//        for(Long item: a){
//            System.out.println(item);
//        }
//        // Get user by access token
//        Map<String, String> map= new LinkedHashMap<>();
//        map.put("token1", "aaaa");
//        map.put("token2", "bbbb");



        // lay phan tu voi access key token 1
    }
}
