
import java.io.*;

public class Child extends ParentClass implements Serializable {
    private String brand;

    public java.lang.String getBrand() {
        return brand;
    }

    public void setBrand(java.lang.String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand + " " + getProduct() + " " + getProductID();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(getProductID());
        objectOutputStream.writeObject(getProduct());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        objectInputStream.defaultReadObject();
        setProductID(objectInputStream.readInt());
        setProduct((String objectInputStream.readObject());
    }

}
