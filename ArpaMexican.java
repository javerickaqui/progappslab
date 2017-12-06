import java.util.*;
public class ArpaMexican{
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        long n=s.nextLong();
        long k=s.nextLong();
        long t=s.nextLong();
        System.out.println(Math.min(t,n)-Math.max(0,t-k));
    }
}