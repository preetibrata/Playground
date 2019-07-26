import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int prod=1;
      int num2=num;
      int num3=num;
      int count=0;
      int sum=0;
       while(num2!=0)
      {
        
       count+=1;
       num2=num2/10;
       
     }   
     
     while(num3!=0)
      {
       int num4=num3%10;
        for(int j=1;j<=count;j++)
        {
          prod=prod*num4;
        }
       num3=num3/10;
       sum=sum+prod;
       prod=1;
      
       
       
     } 
      if(sum==num)
      {
        System.out.println("Armstrong Number");
      }
      else
         System.out.println("Not a Armstrong Number");
	}
}