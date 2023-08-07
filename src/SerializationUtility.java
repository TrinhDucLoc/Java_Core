import java.io.*;
import java.util.Base64;

class AppleProduct implements Serializable {

    private static final long serialVersionUID = 1234567L;

    public String headphonePort;
    public String thunderboltPort;

    public String getHeadphonePort() {
        return headphonePort;
    }

    public void setHeadphonePort(String headphonePort) {
        this.headphonePort = headphonePort;
    }

    public String getThunderboltPort() {
        return thunderboltPort;
    }

    public void setThunderboltPort(String thunderboltPort) {
        this.thunderboltPort = thunderboltPort;
    }
}

public class SerializationUtility {

    public static void main(String[] args) throws IOException {
        AppleProduct macBook = new AppleProduct();
        macBook.headphonePort = "headphonePort2020";
        macBook.thunderboltPort = "thunderboltPort2020";

        String serializedObj = serializeObjectToString(macBook);

        System.out.println("Serialized AppleProduct object to string:");
        System.out.println(serializedObj);
    }

    public static String serializeObjectToString(Serializable o) throws IOException {
        FileOutputStream baos = new FileOutputStream("ser.txt");
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(o);
        oos.close();

        return Base64.getEncoder().encodeToString(baos.toString().getBytes());
    }
}


