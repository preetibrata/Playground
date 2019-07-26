import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int quo=num/100;
      int rem=num%10;
      int add=quo+rem;
      System.out.println(add);
	}
}