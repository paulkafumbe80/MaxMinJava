
import java.util.Arrays;

public class MaxMin
{

    public static double findMean(int[] a, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += a[i];
        return (double) sum / (double) n;

    }


    // Function for calculating median

    public static double findMedian(int[] a, int n)
    {
        // first we sort the array
        Arrays.sort(a);

        // check for even  case


        if (n % 2 != 0)
            return a[n / 2];

        return (double) (a[(n - 1) / 2] + a[n / 2]) / 2.0;
    }

    // Guide code

    public static void main(String[] args) {
        int[] a = {5, 8, 0, 0, 1, 5, 5, 10, 6};
        int n = a.length;
        // Function call
        System.out.println("Mean = " + findMean(a, n));
        System.out.println("Median = " + findMedian(a, n));

    }
}