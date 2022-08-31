package util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileUtil {

    public static Object readFileDeserialize(String name) {
        Object obj = null;
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(name))) {
            obj = in.readObject();
        } finally {
            return obj;
        }
    }

    public static void writeToObjectFile(Object object, String name) throws RuntimeException {
        try(FileOutputStream fOut = new FileOutputStream(name);
            ObjectOutputStream out = new ObjectOutputStream(fOut)) {
            out.writeObject(object);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}
