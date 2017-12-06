import java.util.*;

public class MaximumofMaximumsofMinimums{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int k = sc.nextInt();
			int m[] = new int[n];
			int max = -1000000002;
			int min = 1000000002;
			for(int i = 0;i < n;i ++){
				m[i] = sc.nextInt();
				if(m[i] > max){max = m[i];}
				if(m[i] < min){min = m[i];}
			}
			if(k == 1){System.out.println(min);}
			else if(k == 2){System.out.println(Math.max(m[0],m[n - 1]));}
			else{System.out.println(max);}
		}
	}
}
				    			