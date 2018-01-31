package lab2;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Main.RandomWalk();

    }
    public static void temp () {
        System.out.println("Please input a temperature:");
        Scanner input = new Scanner(System.in);
        double temp = input.nextDouble();
        if (temp<=0) {System.out.println("Solid");}
        else if(temp>=100) {System.out.println("Gaseous");}
        else {System.out.println("Liquid");}
    }
    public static void CompInterest (){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter year:");
        int year = input.nextInt();
        System.out.println("Please input the initial balance of your saving account:");
        double bal = input.nextDouble();
        System.out.println("Please input the rate of interest in percentage;");
        double rate_1 = input.nextDouble();
        rate_1 = rate_1/100;
        double rate_2 = 1+rate_1;
        for (int i=1;i<=year;i++){
            bal = bal*rate_2;
            System.out.println("The ballance after "+i+" year is "+bal+".");
        }
    public static void isPalindormeWords (){
            Scanner input = new Scanner (System.in);
            String word =  "";
            String reversed = "";
            System.out.println("Please enter a word:");
            word =  Scanner.next();
            word = word.trim();
            int length = word.length();
            for (int i = length; i>0; i--){
                reversed += word.charAt(i-1);
            }
            if (word == reversed){
                System.out.println("It is a palindrom word");
            } else {
                System.out.println("This is not a palindrome word");
            }
        }

    }
    public static void RandomWalk()
    {
        {
            int N = Integer.parseInt(args[0]);
            int reps = Integer.parseInt(args[1]);
            int x = 0;
            int y = 0;
            double r;
            int steps = 0;

            while (x * x + y * y <= N * N) {
                steps++;
                r = Math.random();

                if (r <= 0.25) x++;
                else if (r <= 0.50) x--;
                else if (r <= 0.75) y++;
                else if (r <= 1.00) y--;
            }

            System.out.println(steps);
        }

    }
}