import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int sum=0;
    int num1=num;
   while(num1!=0)
   {
     int numr=num1%10;
     sum=(sum*10)+numr;
     num1=num1/10;  
  }
    System.out.println(sum);
}
}