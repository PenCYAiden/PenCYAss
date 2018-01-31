package lab1;

import javax.sql.rowset.serial.SQLOutputImpl;

import java.sql.SQLOutput;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Main.escapeSeq();
    }

    public static void calcInterest() {
        // insert code for exercise on calculating interest
        System.out.println("Exercise calculate Interest ");
        System.out.println("Please input the initial balance of your saving account:");
        Scanner input = new Scanner (System.in);
        double a = input.nextDouble();
        System.out.println("Please input the rate of interest in percentage;");
        double b = input.nextDouble();
        double rate = b/100 +1 ;
        double c = a*rate;
        System.out.println("blance after 1 year:"+c);
        c = c*rate;
        System.out.println("blance after 2 year:"+c);
        c = c*rate;
        System.out.println("blance after 3 year:"+c);
    }
    public static void calcMeans() {
        // insert code for exercise on calculating means
        System.out.println("Exercise calculate mean");
        System.out.println("Please input the first double number:");
        Scanner input = new Scanner(System.in);
        double num1 = input.nextDouble();
        System.out.println("Please input the second double number:");
        double num2 = input.nextDouble();
        double amean = (num1 + num2) / 2;
        double gmean = Math.sqrt(num1 * num2);
        double hmean = 2 / ((1 / num1) + (1 / num2));
        System.out.println("The arithmetic mean is " + amean);
        System.out.println("The geometric mean is " + gmean);
        System.out.println("The harmonic mean is " + hmean);
    }
    public static void readconcatenatestr() {
        System.out.println("Please input your first name");
        Scanner input = new Scanner(System.in);
        String f_name = input.nextLine();
        System.out.println("Please input your last name");
        String l_name = input.nextLine();
        f_name = f_name.trim();
        l_name = l_name.trim();
        System.out.println("Hello "+f_name+" "+l_name+".");
    }
    public static void escapeSeq() {
        System.out.println("Exercise: Escape Sequences");
        String s = "\"Hello,\n World\"";
        System.out.println(s);
        s = "\t\\t|t//t/";
        System.out.println(s);
        s = "#\'a\\ab\\b'^";
        System.out.println(s);
    }
    public static void nextCharacters(){
        System.out.println("Please enter a letter:");
        Scanner input = new Scanner(System.in);
        char c = input.next() . charAt(0);
        c++;
        System.out.print(c);
        c--;
        System.out.print(c);
        System.out.println();

    }
    public static void ageDifference(){
        System.out.println("Exercise: Age Difference");
        System.out.println("Please enter age of the first person in year and months");
        Scanner input = new Scanner(System.in);
        int y1 = input.nextInt();
        int m1 = input.nextInt();
        System.out.println("Please input the age of the second person in year and month");
        int y2 = input.nextInt();
        int m2 = input.nextInt();
        int totalMonthDiff = Math.abs(y1 * 12 + m1 - y2 * 12 - m2);
        int yearDiff = totalMonthDiff / 12 ;
        int monthDiff = totalMonthDiff % 12;
        System.out.println("Age Different is " + yearDiff + "year and " + monthDiff + "months");

    }




}
