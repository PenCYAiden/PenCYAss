package lab3;

import static lab3.ArrayStatistics.*;
import java.until.Arrays;

public class Main {

    public static void main(double[] args) {
	// write your code here
        Main.sum();
        Main.min();
        Main.max();
        Main.mean();
    }
    public static double sum(){
        int[] no ={23,34,43,25,36,28,22,31,31};
        int len = no.length;
        int sum = 0;
        for(int i=0;i<len; i++ )
            sum = sum + no[i];

        System.out.println("The sum is "+sum+".");
    }
    public static double mean(double[] x){
        int[] no ={23,34,43,25,36,28,22,31,31};
        int len = no.length;
        int mean = 0;
        int sum = 0;
        for (int i = 0; i<len; i++) sum = sum + no[i];
        mean = sum/len;
        System.out.println("The mean is "+mean+".");

    }
    public static double min(double[] x){
        int[] no ={23,34,43,25,36,28,22,31,31};
        int len = no.length;
        int min = no[0];
        for(int i=0; i<len; i++){
            if (no[i]<min) min = no[i];

        }
        System.out.println("The mininum number id "+min);
    }
    public static double max(double[] x){
        int[] no ={23,34,43,25,36,28,22,31,31};
        int len = no,length;
        int max = 0;
        int len = no.length;
        for (int i =0; i<len;i++){
            if (no[i]> max) max = no[i];
        }
        System.out.println("The maximun number is "+max);
    }

}

