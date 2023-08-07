import java.io.*;

class EMP implements Serializable{
    private static final long serialversionUID = 12345L;
    transient int a;
    static int b;
    String name;
    int age;

    public EMP(int a, int b, String name, int age){
        this.a = a;
        this.b = b;
        this.name = name;
        this.age = age;
    }
}

public class Serialization_002 {
    public static void printData(EMP emp){
        System.out.println("Show data: " + emp.a + " - " + emp.b + " - " + emp.name + " - "  + emp.age);
    }

    public static void main(String[] args) throws IOException{
        EMP obj1 = new EMP(2, 1000,"Nguyen Van A", 10);
//        Serialization
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("file1.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(obj1);

            fileOutputStream.close();

            obj1.a = 10000;
            obj1.b = 50000;
            obj1.name = "Nguyen Van B";
            obj1.age = 20;
        } catch(IOException e){
            System.out.println(e);
        }
//        Deserialization
        EMP objDeser1 = null;
        try{
            FileInputStream fileInputStream = new FileInputStream("file1.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            objDeser1 =(EMP) objectInputStream.readObject();
            printData(objDeser1);
        }  catch(Exception e){
            System.out.println(e);
        }
    }
}
