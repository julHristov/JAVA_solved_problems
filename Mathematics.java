package math;

import java.util.Locale;

public class Mathematics {
    public static void main(String[] args){
//           Sum of numbers
        System.out.println(2 + 3);

        //        Absolute value
        int a = Math.abs(- 147);
        int b = Math.abs(15);
        int c = Math.abs(0);
        int d = Math.abs(18);
        System.out.println(a + "\t" + b + "\t" + c + "\t" + d );

        //        square root calculation 8, 353, 78, 3, -67, 723, 2000, -100

        int e = Math.abs(8);
        int f = Math.abs(353);
        int g = Math.abs(78);
        int h = Math.abs(3);
        int i = Math.abs(-67);
        int j = Math.abs(723);
        int k = Math.abs(2000);
        int l = Math.abs(-100);

        System.out.println(Math.sqrt(e) + " " + Math.sqrt(f) + " " + Math.sqrt(g) + " " + Math.sqrt(h) +
                " " + Math.sqrt(i) + " " + " " + Math.sqrt(j) + " " + Math.sqrt(k) + " " + Math.sqrt(l));


        //        -20, 92, 638, 73, 200, -22
        System.out.println(Math.pow(-20,2) + " " + Math.pow(92,2) + " " + Math.pow(638, 2) + " " +
                Math.pow(200, 2) + " " + Math.pow(-22, 2));
    }
}
