class rec
{
 int n;
 void print(int n)
 {
  if(n>1)
  {
   System.out.println(n+" ");
   print(n-1);
   System.out.println(n);
  }
  else
  {
  System.out.println(n);
  }
 }
 public static void main(String ar[])
 {
  rec x1=new rec();
  x1.print(20);
 }
}
            
