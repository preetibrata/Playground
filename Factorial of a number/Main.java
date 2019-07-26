import java.util.Scanner;
class Main{
	public static void main (String[] args){
         Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int prod=1;
      int num1=num;
      for(int i=1;i<=num;i++)
      {
        
        prod=prod*i;
        
      }
       System.out.println(prod);
	}
      
}