import java.util.*;
public class Avg_using_scanner
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the 5 numbers: ");
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    int c=sc.nextInt();
	    int d=sc.nextInt();
	    int e=sc.nextInt();
	    double avg=(a+b+c+d+e)/5;
	     System.out.println("Avg = "+avg);
	    
		
	}
}