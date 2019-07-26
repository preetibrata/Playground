import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int prod=product(num);
      System.out.println(prod);
      
	} 
 	 public static int product(int num)
  	{
       int sum=0;
       for(int i=1;i<=num;i++)
       {
         sum=sum+i;
       }
       return sum;
    }
	
}