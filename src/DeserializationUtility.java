import java.io.*;
import java.util.Base64;

public class DeserializationUtility {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String serializedObj = "ser.txt"; // ommited for clarity
        System.out.println(
                "Deserializing AppleProduct...");

        AppleProduct deserializedObj = (AppleProduct) deSerializeObjectFromString(
                serializedObj);

        System.out.println(
                "Headphone port of AppleProduct:"
                        + deserializedObj.getHeadphonePort());
        System.out.println(
                "Thunderbolt port of AppleProduct:"
                        + deserializedObj.getThunderboltPort());
    }

    public static Object deSerializeObjectFromString(String s)
            throws IOException, ClassNotFoundException {

//        byte[] data = Base64.getDecoder().decode(s);
        FileInputStream data = new FileInputStream(s);
        ObjectInputStream ois = new ObjectInputStream(
                data);
        Object o = ois.readObject();
        ois.close();
        return o;
    }
}
