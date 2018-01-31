package Lab_3;

public class ArrayStatistics {


    public static double sum(double[] x) {
        int len = x.length;
        double sum = 0;
        for (int i = 0; i < len; i++) {
            sum = sum + x[i];
        }
        return sum;
    }
    public static double mean(double[] x) {
        int len = x.length;
        double mean = 0;
        double sum = 0;
        for (int i = 0; i < len; i++) {
            sum = sum + x[i];
        }
        mean = sum / len;
        return mean;
    }
    public static double min(double[] x) {
        int len = x.length;
        double min = x[1];
        for (int i = 0; i < len; i++) {
            if (x[i] < min) min = x[i];
        }
        return min;
    }
    public static double max(double[] x) {
        double max = 0;
        int len = x.length;
        for (int i = 0; i < len; i++) {
            if (x[i] > max) max = x[i];
        }
        return max;
   }
}