import java.util.Scanner;
import java.util.ArrayList;

public class WhichFloor {
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		ArrayList<Integer> array = new ArrayList<Integer>(100);
		ArrayList<Integer> del = new ArrayList<Integer>(100);
		int n = kbd.nextInt();
		int m = kbd.nextInt();
		int f;
		int k;
		kbd.close();
		for (int i = 1; i <= 100; i++)
			array.add(i);		
		for (int i = 0; i < m; i++)	{
			k = kbd.nextInt();
			f = kbd.nextInt();
			for (int j = 0; j < array.size(); j++) {
				int x = array.get(j);
				if ((k - 1) / x + 1 != f) {
					del.add(x);
				}
			}

			for (int ii = 0; ii < del.size(); ii++) {
				array.remove(new Integer(del.get(ii)));
			}
		}

		for (int i = 0; i < array.size(); i++) {
			int x = array.get(0);
			array.add((n - 1) / x + 1);
			array.remove(0);
		}
		for(int i = 0; i < array.size(); i++)
			if(array.get(i)!=array.get(0)){
				System.out.print(-1);
				return;
			}
		if(array.size()==0) {
			System.out.print(-1);
		}			
		else {
			System.out.print(array.get(0));
		}
	}
}