package arcesium.solution;

import java.util.UUID;

public class NumberLineJumps {
    public static void main(String[] args) {
        System.out.println( UUID.randomUUID().toString());
     //   System.out.println(NumberLineJumps.kangaroo(0,3,4,2));
    }

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
        double n = x1-x2/v2-v1;
        return (n>0 && n == (int)n) ? "YES" : "NO";

    }
}
