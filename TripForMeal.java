import java.util.Scanner;

public class TripForMeal {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(), a = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt();
		int curr = 1, distance = 0;
		while(--n > 0){
			switch(curr){
			case 1:
				if(a <= b){
					distance += a;
					curr = 2;
				}
				else{
					distance += b;
					curr = 3;
				} break;
			case 2:
				if(a <= c){
					distance += a;
					curr = 1;
				}
				else{
					distance += c;
					curr = 3;
				} break;
			case 3:
				if(b <= c){
					distance += b;
					curr = 1;
				}
				else{
					distance += c;
					curr = 2;
				}
			}
		}
		System.out.println(distance);
	}

}