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
        
		// TODO Auto-generated method stub
        sc.close();
        int ld=n%10;
    	sum=sum+ld;
        while(count!=0)
        {
        	
        	if(count==1)
        	{
        		int fd=n%10;
        		sum=sum+fd;
        	}
        	
        	count=count-1;
        	n=n/10;
        }
        System.out.println(sum);

	}
}