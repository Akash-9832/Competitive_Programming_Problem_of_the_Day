import java.util.*;
public class Frequency_of_each_digit
{
	public static void main(String[] args) {
	    int[] out = new int[10];
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter an Integer: ");
		int size=sc.nextInt();
		while(size!=0){
		    int r=size%10;
		    out[r]++;
		    size=size/10;
		}
    for(int i=0;i<10;i++){
		    if (out[i] > 0) {
            System.out.println("No. of "+i+" = "+out[i]);
        }
		}
	}
}
