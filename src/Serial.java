import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serial {
    public static void main(String[] args) throws IOException {
        FileOutputStream fs = new FileOutputStream("testSerial.ser");
        ObjectOutputStream os = new ObjectOutputStream(fs);
        os.writeObject(new BeatBox());
    }
}

