import java.io.*;
import java.util.Scanner;
public class odd
{
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int b,c;
		System.out.println("Enter the lower limit:");
		b=a.nextInt();
		System.out.println("Enter the upper limit:");
		c=a.nextInt();
		System.out.print("The odd number between "+b+" and "+c+" are ");
		for(int i=b;i<=c;i+=1){
		    if(i%2==0){
		        continue;
		    }
		    System.out.print(" ,"+i);
		}
		System.out.print(".");
	}
}
