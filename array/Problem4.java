package array;
import java.util.Scanner;

class Problem4{
    
    static void sort012(int[] a, int n){
        int low = 0, high = n-1, mid = 0, temp;
        while (mid <= high){
            switch (a[mid]){
                case 0: {
                    temp = a[low];
                    a[low] = a[mid];
                    a[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1:{
                    mid++;
                    break;
                }
                case 2:{
                    temp = a[mid];
                    a[mid] = a[high];
                    a[high] = temp;
                    high--;
                    break;
                }
            }
        }
    }

    /* Utility function to print array arr[] */
    static void printArray(int[] a,int n) {
        int i;
        for (i = 0; i < n; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    /* Driver Function */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        sort012(a, n);
        System.out.println("Array after segregation");
        printArray(a, n);
    }
}
