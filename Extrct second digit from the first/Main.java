import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int n1=n;
        int count=0;
        while(n1!=0)
        {
        	n1=n1/10;
        	count++;
        	
        }
      while(count!=0)
        {
        	
        	if(count==2)
        	{
              int n_1=n%10;
        		 System.out.println(n_1);
              
        	}
        	
        	count=count-1;
        	n=n/10;
      }
      
    }
}