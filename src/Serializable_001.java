import java.io.*;

class Demo implements Serializable{
    public int a;
    public String b;

    public Demo(int a, String b){
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }
}

public class Serializable_001 {
    public static void main(String[] args){
        Demo object = new Demo(1, "Java");
        String filename = "filename1.ser";

//        Serialization
        try(FileOutputStream fileOutputStream = new FileOutputStream(filename);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);){
//            Saving object in file


//            Method for serialization of object
            objectOutputStream.writeObject(object);

        } catch (Exception e){
            System.out.println(e);
        }

        Demo object2 = new Demo(2, "Python");
        String filename2 = "filename2.ser";

        try{
//            FileOutputStream
            FileOutputStream fileOutputStream = new FileOutputStream("filename2.ser");
//            ObjectOutputStream
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//            writeObject
            objectOutputStream.writeObject(object2);
//            close resource
            fileOutputStream.close();
            objectOutputStream.close();
        } catch(Exception e){
            System.out.println(e);
        }

        Demo object3 = new Demo(3, "C++");
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("filename3.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(object3);

        } catch(Exception e){
            System.out.println(e);
        }

//        Deserialization
        Demo objectDeserlization1 = null;

        try{
            FileInputStream fileInputStream = new FileInputStream("filename1.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            objectDeserlization1 = (Demo) objectInputStream.readObject();

            fileInputStream.close();
            objectInputStream.close();


            System.out.println(objectDeserlization1.getB());
        } catch(Exception e){
            System.out.println(e);
        }

//        Deserialization 2
        Demo obj2 = null;
        try{
            FileInputStream fileInputStream = new FileInputStream("filename2.ser");
            ObjectInputStream objectInputStream2 = new ObjectInputStream(fileInputStream);

            obj2 = (Demo) objectInputStream2.readObject();
            fileInputStream.close();
            objectInputStream2.close();

            System.out.println(obj2.getB());

        } catch(Exception e){
            System.out.println(e);
        }

//        Deserialization3
        Demo obj3 = null;
        try{
            FileInputStream fileInputStream = new FileInputStream("filename3.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            obj3 = (Demo) objectInputStream.readObject();


            fileInputStream.close();
            objectInputStream.close();

            System.out.println(obj3.getA() + "-" + obj3.getB());
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
