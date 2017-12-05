import java.util.Scanner;

public class SlavaAndTanks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println((int) ((n / 2) * 2 + Math.ceil(n / 2.0)));
		for (int i = 1; i < n; i += 2) System.out.print(i+1 + " ");
		for (int i = 0; i < n; i += 2) System.out.print(i+1 + " ");
		for (int i = 1; i < n; i += 2) System.out.print(i+1 + " ");
		
		sc.close();
	}
}