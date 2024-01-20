import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Average_sequence {
    public static int sum(int[]temp, int m){
            int c=0;
            for(int i=0;i<=m;i++){
                c+=temp[i];
            }
            return c;
        }
    public static void main(String args[] ) throws Exception {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int arr2[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        if(n==1){
            arr2[0]=arr[0];
        }
        else{
            arr2[0]=arr[0];
            int j=0;
            for(int i=1;i<n;i++){
                arr2[i]=((i+1)*arr[i])-sum(arr2,i-1);
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
