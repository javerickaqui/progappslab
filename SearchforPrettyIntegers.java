import java.util.*;
import java.io.*;

public class SearchforPrettyIntegers
{
    public static void main(String args[] ) throws Exception 
    {
Scanner sc=new Scanner(System.in);
boolean[] an=new boolean[10];
int n=sc.nextInt();
int m=sc.nextInt();
int arrn[]=new int[n];
int arrm[]=new int[m];
for(int i=0;i<n;i++){
    arrn[i]=sc.nextInt();
    an[arrn[i]]=true;
}
int mc=10;
for(int i=0;i<m;i++)
{
    arrm[i]=sc.nextInt();
    if((an[arrm[i]]==true)&&(mc>arrm[i])){
        mc=arrm[i];
    }
   }
if(mc==10){
    Arrays.sort(arrm);
    Arrays.sort(arrn);
    System.out.println((arrm[0]<arrn[0])?(arrm[0]+""+arrn[0]):(arrn[0]+""+arrm[0]));
}
else{
    System.out.println(mc);
}


    }
}