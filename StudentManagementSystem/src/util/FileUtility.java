
package util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Ayxan
 */
public class FileUtility implements Serializable{
    public static void writeObjectToFile(Serializable object, String name){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(name));){
            oos.writeObject(object);
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    public static Object readObjectFromFile(String name){
        Object obj = null;

        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(name))){
            obj = in.readObject();
            
        } finally{
            return obj;
        }
    }
}
