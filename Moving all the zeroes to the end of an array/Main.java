import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
    int arr_size=sc.nextInt();
    int [] arr=new int[arr_size];
    for(int i=0;i<=arr.length-1;i++)
    {
      arr[i]=sc.nextInt();
    }
    for(int k=0;k<=arr.length-1;k++)
    {
     for(int j=k+1;j<=arr.length-1;j++)
     {
       if(arr[k]==0&&arr[j]!=0)
       {
         int temp=arr[k];
         arr[k]=arr[j];
         arr[j]=temp;
       }
         
    }
    }
     for(int i=0;i<=arr.length-1;i++)
    {
      System.out.print(arr[i]+" ");
        
    }

}
}