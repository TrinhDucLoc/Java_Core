import java.io.*;

class Cat implements Serializable{
    String name = "Doremon";
    transient int age = 2;
}

public class Serialization_003 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Cat cat1 = new Cat();
//        Serialization

        FileOutputStream fileOutputStream = new FileOutputStream("cat1.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(cat1);


//        Deserlization

        FileInputStream fileInputStream = new FileInputStream("cat1.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Cat cat2 = (Cat) objectInputStream.readObject();

        System.out.println("Name: " + cat2.name + " - Age: " + cat2.age);

    }
}
