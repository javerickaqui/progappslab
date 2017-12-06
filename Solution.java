import java.io.*;
import java.util.*;


// 878C - Tournament
public class C {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);


		int n = sc.nextInt(), k = sc.nextInt();

		TreeMap<Integer, Group>[] map = new TreeMap[k];
		for(int i = 0; i < k; ++i)
			map[i] = new TreeMap<>();

		StringBuilder sb = new StringBuilder("1\n");
		Group maxGroup = null;
		for(int t = 1; t <= n; ++t)
		{
			int[] minS = new int[k], maxS = new int[k];
			for(int i = 0; i < k; ++i)
				maxS[i] = minS[i] = sc.nextInt();
			Group cur = new Group(minS, maxS);
			if(t == 1)
			{
				maxGroup = cur;
				continue;
			}
			addGroup(map, cur);
			while(true)
			{
				Group other = null;
				for(int i = 0; i < k; ++i)
				{
					Map.Entry<Integer, Group> x = map[i].higherEntry(maxGroup.minWin[i]);
					if(x != null)
					{
						other = x.getValue();
						break;
					}
				}
				if(other == null)
					break;
				Group merge = Group.merge(maxGroup, other);
				removeGroup(map, other);
				if(merge == null)
				{
					//other dominates maxGroup
					addGroup(map, maxGroup);
					merge = other;
				}

				maxGroup = merge;
			}
			sb.append(maxGroup.sz + "\n");
		}
		out.print(sb);
		out.close();
	}

	static void addGroup(TreeMap<Integer, Group>[] map, Group g)
	{
		for(int i = 0; i < g.minWin.length; ++i)
			map[i].put(g.maxWin[i], g);
	}

	static void removeGroup(TreeMap<Integer, Group>[] map, Group g)
	{
		for(int i = 0; i < g.minWin.length; ++i)
			map[i].remove(g.maxWin[i]);
	}

	static class Group
	{
		int[] minWin, maxWin;
		int sz = 1;

		Group(int[] a, int[] b) { minWin = a; maxWin = b; }

		static Group merge(Group x, Group y)
		{
			boolean dominates = true;
			for(int i = 0; i < y.minWin.length; ++i)
				if(y.minWin[i] < x.maxWin[i])
					dominates = false;
			if(dominates)
				return null;
			int[] minR = new int[x.minWin.length], maxR = new int[minR.length];
			for(int i = 0; i < minR.length; ++i)
				minR[i] = Math.min(x.minWin[i], y.minWin[i]);
			for(int i = 0; i < minR.length; ++i)
				maxR[i] = Math.max(x.maxWin[i], y.maxWin[i]);
			Group ret = new Group(minR, maxR);
			ret.sz = x.sz + y.sz;
			return ret;
		}
	}
	static class Scanner
	{
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream s){	br = new BufferedReader(new InputStreamReader(s));}

		public Scanner(FileReader s) throws FileNotFoundException {	br = new BufferedReader(s);}

		public String next() throws IOException
		{
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int nextInt() throws IOException {return Integer.parseInt(next());}

		public long nextLong() throws IOException {return Long.parseLong(next());}

		public String nextLine() throws IOException {return br.readLine();}

		public double nextDouble() throws IOException { return Double.parseDouble(next()); }

		public boolean ready() throws IOException {return br.ready();}
	}
}