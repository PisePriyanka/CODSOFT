package simple;
import java.util.Scanner;
public class taskno2 {

public static void main(String[] args)
	{
		try (Scanner obj = new Scanner(System.in)) 
		{
			int []marks =new int[100];
			int total=0;
			float per;
			System.out.println("Enter Your marks of all subject(out of 100)");
			for (int i=0;i<5;i++)
			{
				marks[i]=obj.nextInt();
			}
			for( int i=0;i<5;i++)
			{
				total=total+marks[i];
			}
			per=(total/5);
			System.out.println("Total Marks="+total);
			System.out.println("\nAverage Percentage="+per+"%\n");
			if(per<40)
			{
				System.out.println("Grade= F");
			}
			
			else if(per>=40 && per<60)
			{
				System.out.println("Grade= C");
			}
			
			else if(per>=60 && per<65)
			{
				System.out.println("Grade= B");
			}
			
			else if(per>=65 && per<70)
			{
				System.out.println("Grade= A");
			}
			
			else if(per>=70 && per<80)
			{
				System.out.println("Grade= A+");
			}
			
			else
			{
				System.out.println("Grade= O");
			}
		}


	}

}
