package Algorithm;
import java.util.Scanner;
public class PythagoreanTriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	   int a,b,c;
	   System.out.println("Enter Three Numbers...");
	   a=sc.nextInt();
	   b=sc.nextInt();
	   c=sc.nextInt();
	   if(a*a+b*b==c*c)
	   {
		   System.out.println("Yes");
	   }
	   else {
		   System.out.println("No");
	   }
	   
	}
}
	    

