import java.io.*;
import java.util.*;
import java.util.Map.Entry;
public class TurnOffTV {
	public static void main(String[] args)throws Throwable {
		MyScanner sc=new MyScanner();
		PrintWriter pw=new PrintWriter(System.out);

		int n=sc.nextInt();
		int [] l=new int [n];
		int [] r=new int [n];
		TreeMap<Integer, Integer> map=new TreeMap<Integer, Integer>();
		for(int i=0;i<n;i++){
			l[i]=sc.nextInt();
			r[i]=sc.nextInt()+1;
			if(map.containsKey(l[i]))
				map.put(l[i] ,map.get(l[i])+1);
			else
				map.put(l[i], 1);
			if(map.containsKey(r[i]))
				map.put(r[i] ,map.get(r[i])-1);
			else
				map.put(r[i], -1);
		}
		ArrayList<Integer> pos=new ArrayList<Integer>();
		ArrayList<Integer> cnt=new ArrayList<Integer>();
		int last=0;
		for(Entry<Integer, Integer> e : map.entrySet()){
			last+=e.getValue();
			pos.add(e.getKey());
			cnt.add(last);
		}
		int m=pos.size();
		int [] c1=new int [m];
		int tmp=0;
		for(int i=0;i<m;i++){
			if(cnt.get(i)==1)
				tmp++;
			c1[i]=tmp;
		}
		map=new TreeMap<Integer, Integer>();
		for(int i=0;i<m;i++)
			map.put(pos.get(i), i);
		int ans=-1;
		for(int i=0;i<n;i++){
			int posL=map.get(l[i]);
			int posR=map.get(r[i]);
			int cntOnes=c1[posR]-c1[posL];
			if(cnt.get(posL)==1)
				cntOnes++;
			if(cnt.get(posR)==1)
				cntOnes--;
			if(cntOnes==0){
				ans=i+1;
				break;
			}
		}
		pw.println(ans);
		pw.flush();
		pw.close();
	}

	static class MyScanner {
		BufferedReader br;
		StringTokenizer st;
		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		String next() {while (st == null || !st.hasMoreElements()) {
			try {st = new StringTokenizer(br.readLine());}
			catch (IOException e) {e.printStackTrace();}}
		return st.nextToken();}
		int nextInt() {return Integer.parseInt(next());}
		long nextLong() {return Long.parseLong(next());}
		double nextDouble() {return Double.parseDouble(next());}
		String nextLine(){String str = "";
		try {str = br.readLine();}
		catch (IOException e) {e.printStackTrace();}
		return str;}
	}
}