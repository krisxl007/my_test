package java_foundation.object_deep_copy;

public class Main {

    public static void main(String[] args) throws Exception{
        System.out.println("****************Deep copy solution 1******************");
        ImplementCloneableInterface deepCopy1 = new ImplementCloneableInterface();
        deepCopy1.deepCopy();

        System.out.println("****************Deep copy solution 2******************");
        DeepCloneBySerializable deepCopy2 = new DeepCloneBySerializable();
        deepCopy2.deepCopy();
    }
}
