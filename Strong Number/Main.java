import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int prod=1;
      int sum=0;
      int num2=num;
      while(num2!=0)
      {
        int num1=num2%10;
        for(int j=num1;j>=1;j--)
        {
          prod=prod*j;
        }
        sum=sum+prod;
         prod=1;  
        num2/=10;
      }
      if(sum==num)
      {
         System.out.println("Yes");
      }
      else
        System.out.println("No");
      
	}
}