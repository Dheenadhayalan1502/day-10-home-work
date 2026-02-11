import java.util.Scanner;
class Dowhile
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print(" enter a number :");
		int num=sc.nextInt();
		
		int i=1;
		do
		{
		 
		
		  System.out.println(i);
		  i++;
		}
		while(i<num);
	}

}