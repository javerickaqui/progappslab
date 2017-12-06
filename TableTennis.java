
// 879B Table Tennis
import java.util.*;
public class TableTennis {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();

        long p = sc.nextLong();
        long c = 0;
        for (long i = 0; i < n-1; i++) {
            long newP = sc.nextLong();
            if (newP > p) {
                p = newP;
                c = 1;
            } else {
                c++;
                if (c >= k) {
                    break;
                }
            }
        }
        System.out.println(p);
    }

}
