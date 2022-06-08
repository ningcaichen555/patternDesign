package _001_createPattern._003_clone;

public class Client {
    public static void main(String[] args) {
        RealizeType realizeType = new RealizeType();
        try {
            RealizeType clone = (RealizeType) realizeType.clone();

            System.out.println(clone == realizeType);


        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
