package file;

import java.io.*;

public class FileUtility {
    public static Object readFileDeserialize(String name)  {
        Object object =null;
        try(ObjectInputStream objectInputStream =new ObjectInputStream(new FileInputStream(name))){
            object=objectInputStream.readObject();
        }
        finally {
            return object;
        }
    }

    public static void writeObjectIntoFile(Serializable object, String data) throws Exception{
        try (FileOutputStream fileOutputStream =new FileOutputStream(data);
             ObjectOutputStream objectOutputStream =new ObjectOutputStream(fileOutputStream);
        ){
            objectOutputStream.writeObject(object);
        }

    }

}
