
//867A Between the offices
import java.util.*;
public class BetweenTheOffices{
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		int a = kbd.nextInt();
		String str = kbd.next();
		int b = 0;
		for (int i = 1; i < str.length(); i++)
			if (str.charAt(i) == 'F' && str.charAt(i-1) == 'S') b++;
			else if (str.charAt(i) == 'S' && str.charAt(i-1) == 'F') b--;
		System.out.println(b > 0 ? "YES" : "NO");
	}
}