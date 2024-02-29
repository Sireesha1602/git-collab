import java.util.Scanner;

interface Calci
{
   public int add(int n1,int n2);
}
class calciImpl implements Calci{
   public int add(int n1,int n2){
      return n1+n2;
   }

}
class CalciDriver
{
  public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
  System.out.println("enter the numbers to add");
  int n1=sc.nextInt();
  int n2=sc.nextInt();
  calciImpl c=new calciImpl();
  System.out.println("sum is :"+c.add(n1,n2));
   }

}
