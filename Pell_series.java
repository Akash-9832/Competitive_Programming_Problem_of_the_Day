import java.util.*;
public class Pell_series
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter the range of the Pell Series: ");
		int size=sc.nextInt();
		int first=1, second=2;
		System.out.print(first+", "+second);
		for(int i=0;i<size-2;i++){
		    int c = second*2+first;
		    System.out.print(", "+c);
		    first=second;
		    second=c;
		}
	}
}
