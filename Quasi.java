import java.util.Scanner;

public class Quasi {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Integer i = sc.nextInt();
	while (i%10==0) {
		i=i/10;
	}
	String k=new StringBuffer(i.toString()).reverse().toString();
	if (i.toString().equals(k)) {
		System.out.println("YES");
	}
	else {
		System.out.println("NO");
	}
	
	
    }
}