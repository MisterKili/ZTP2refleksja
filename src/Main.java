import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[]args) throws Exception{
        ArrayList <Double> list = createMethod(ArrayList.class);
        list.add(1.2);
        System.out.println(list.get(0).toString());

        int[] ints = (int[]) Array.newInstance(int.class, 10);
        ints[0]=100;
        System.out.println("\n"+ints[0]);

        Contener<Double>[] doubleArray = (Contener[]) createArrayMethod(Contener.class, 10);
        doubleArray[0]= new Contener<Double>(2.2);
        System.out.println("\n"+doubleArray[0].value);
    }

    public static <T> T createMethod (Class <T> type) throws Exception{
        return  type.newInstance();
    }

    public static Object createArrayMethod (Class clas, int size) {
        return  Array.newInstance(clas, size);
    }
}
