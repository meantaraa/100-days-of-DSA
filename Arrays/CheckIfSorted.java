import java.util.Scanner;

public class CheckIfSorted {
    
     public static int isSorted(int n, int[] a) {
        for (int i = 1; i < n; i++) {
            if (a[i] < a[i - 1]){
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int result = isSorted(n, a);
        System.out.println(result);
        sc.close();
    }
}
