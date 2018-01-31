package Lab_3;
import static Lab_3.ArrayStatistics.*;
import java.util.Arrays;
public class TestStatistics {
    public static void main(String[] args) {
        testStatistics(new double[] { 1.0, -2.0, 3.0, -4.0, 5.0 });
    }
    public static void testStatistics (double[] x) {
        System.out.println("Array = " + Arrays.toString(x));
        System.out.println("Sum = " + sum(x));
        System.out.println("Average = " + mean(x));
        System.out.println("Min = " + min(x));
        System.out.println("Max = " + max(x));
    }
}