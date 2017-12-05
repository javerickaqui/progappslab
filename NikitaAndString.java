import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class NikitaAndString {

    public static void main(String[] args) {
        NikitaAndString obj = new NikitaAndString();
        obj.solve(System.in, System.out);
    }

    public void solve(InputStream is, PrintStream ps) {
        Scanner input = new Scanner(is);
        String s = input.next();
        int counta = 0;
        int countab = 0;
        int countaba = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a') {
                counta++;
                countaba = Math.max(countaba,countab) + 1;
            } else {
                countab = Math.max(counta,countab) + 1;
            }
        }
        System.out.println( Math.max(Math.max(counta,countab),countaba));
        input.close();
    }
}