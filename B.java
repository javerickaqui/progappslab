import java.util.*;

public class B{
    public static void main(String[] v) {
        Scanner s = new Scanner(System.in);
        long n = s.nextInt(), k = (long)Math.pow(10,s.nextInt()), c=n, d=k;
        while(k!=0) {
            k^=n%=k;
            k^=n^=k;
        }
        System.out.print(c*d/n);
    }
}