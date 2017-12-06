import java.util.*;

public class TomRiddle{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		int number=reader.nextInt();

		String[] string=new String[number];
		int i=0;
		while(number>0)
		{
			string[i]=reader.next()+reader.nextLine();
			for(int x=0;x<i;x++)
			{
				if(string[x].equals(string[i]))
				{
					System.out.println("YES");
					break;
				}
			}
			if(x==i)
				System.out.println("NO");
			number--;
			i++;
		}
	}
}