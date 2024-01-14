import java.util.Scanner;

public class Binary_search {
    public static void main(String[] args) {
        int i, n, c = 0, item, beg = 0, end, mid = 0;
        int arr[];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter the elements");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number to be searched: ");
        item = sc.nextInt();
        end = n - 1;
        while (beg <= end) {
            mid = (beg + end) / 2;
            if (arr[mid] == item) {
                System.out.println("Item found in index " + mid);
                c++;
                break;
            } else if (arr[mid] > item) {
                end = mid - 1;
            } else if (arr[mid] < item) {
                beg = mid + 1;
            }
        }
        if (c == 0) {
            System.out.println("Item doesn't exist");
        }
        sc.close();
    }
}
