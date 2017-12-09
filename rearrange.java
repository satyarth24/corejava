import java.io.*;
import java.util.*;
class rearrange
{
 public static void main(String ar[])throws Exception
 {
  DataInputStream z=new DataInputStream(System.in);
  String s,str,t="";
  System.out.println("Enter the sentence");
  s=z.readLine();
  str=s.toUpperCase();
  StringTokenizer s1=new StringTokenizer(str);
  int N;
  N=s1.countTokens();
  String a[]=new String[N];
  for(int i=0;i<N;i++)
  {
   a[i]=s1.nextToken();
  }
  for(int i=0;i<=N-2;i++)
  {
   for(int j=0;j<=N-2;j++)
   {
    if((a[j].compareTo(a[j+1]))>0)
    {
     t=a[j];
     a[j]=a[j+1];
     a[j+1]=t;
    }
   }
  }
  System.out.println("Length(in Words)="+N);
  System.out.println("Rearranged Sentence :");
  for(int i=0;i<N;i++)
  {
   System.out.print(a[i]+" ");
   }
  }
 }
