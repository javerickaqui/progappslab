import java.util.Arrays;
import java.util.Scanner;

public class BalancedSubstring {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		char[] s = scan.next().toCharArray();
		int[] arr = new int[2*n+5];
		Arrays.fill(arr, -2);
		int off = n+1;
		arr[0+off] = -1;
		int c = 0;
		int max = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i] == '1')
				c++;
			else
				c--;
			if (arr[c+off] == -2) {
				arr[c+off] = i;
				continue;
			}
			max = Math.max(max, i-arr[c+off]);
		}
		System.out.println(max);
		scan.close();
	}
}