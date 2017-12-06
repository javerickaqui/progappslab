import java.util.Scanner;

public class FractionSolution {

    public static void main(String [] args) {
        Scanner kbd = new Scanner(System.in);
        int n = kbd.nextInt();
        int b = 0;
        if(n%2 == 0 && n%4 != 0) {
            b = n/2 + 2;
        } else {
            b = n/2 + 1;
        }

        System.out.print(n-b + " " + b);
    }
}