import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
  		int num=in.nextInt();
      int count=0;
      for(int i=1;i<=num;i++)
      {
        count=count+1;
        for(int j=1;j<=i;j++)
        {
           System.out.print(count);  
         
         
        }   System.out.print("\n");   
      }
	}
}