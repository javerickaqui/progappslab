import java.util.Scanner;

public class Chores{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int n = in.nextInt();
		int k = in.nextInt();
		int x = in.nextInt();
		int[] a = new int[n];
		for(int i = 0;i<n;i++)a[i]=in.nextInt();
		int s = 0;
		for(int i = 0;i<n-k;i++){
			s+=a[i];
		}
		System.out.println((k*x+s));
	}
}
