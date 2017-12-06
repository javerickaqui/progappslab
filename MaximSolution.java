import java.util.*;
public class MaximSolution {
    public static void main(String [] args) {
        Scanner kbd=new Scanner(System.in);
        int n=kbd.nextInt(), k=kbd.nextInt();
        if(k==0||n==k)
            System.out.print(0+" "+0);
        else
            System.out.print(1+" "+(int)Math.min(k*2,n-k));
    }
}