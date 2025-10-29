import java.util.Scanner;

public class wrappertoprimitive {
      public static void main(String[] args) {
        Double object = 45.67;
        Double d = object.doubleValue();
        int i=(int)object.doubleValue();
        System.out.println(object);
        System.out.println(d);
        System.out.println(i);
     }
}
