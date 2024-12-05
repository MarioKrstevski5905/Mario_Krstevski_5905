import java.io.*;

public class Main {
    public static void main(String[] args) {
        Child childClass = new Child();
        childClass.setProduct("Product");
        childClass.setProductID(123);
        childClass.setBrand("Brand");
        String fileName = "testChild.txt";
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(childClass);

            FileInputStream fileInputStream = new FileInputStream(fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            objectInputStream.readObject(childClass);
        }
    }
}