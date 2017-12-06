import java.util.*;

public class PolycarpAndLetters {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N=scan.nextInt();
		String input=scan.next();
		char[] A=input.toCharArray();
		
		HashSet<Character> hm=new HashSet<Character>();
		int count=0,max=0;
		for(int i=0;i<N;i++){
			if(A[i]>=65&&A[i]<=90){
				hm.clear();
				count=0;
			}else if(!hm.contains(A[i])){
				count++;
				hm.add(A[i]);
				max=Math.max(max,count);
			}		
		}		
		System.out.println(max);	
		scan.close();
	}
}