import java.util.Scanner;

import java.text.DecimalFormat;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");
        //Welcome
        System.out.println("Welcome to the tip calculator!");
        //define variables
        System.out.print("How many people are in your group: " );
        int people = scan.nextInt();
        scan.nextLine();
        System.out.print("What is the tip percentage: ");
        int tipPercentage = scan.nextInt();
        scan.nextLine();
        //dish info
        System.out.print("Enter the dish price, e.g. 10.50 (-1 to end): ");
        double dish = scan.nextDouble();
        scan.nextLine();
        while (dish != -1)
        {
            System.out.print("Enter the dish price, e.g. 10.50 (-1 to end): ");
            dish = scan.nextDouble();
        }
    }


//        double num = 12.458172109;
//        String formattedNum = formatter.format(num);
//        System.out.println(formattedNum);

//        System.out.print("Enter an EVEN integer: ");
//        int number = scan.nextInt();

        // the while loop begins and repeats as
        // long as the condition is TRUE; as soon
        // as the condition becomes FALSE, it stops
//        while (number % 2 != 0) {
//            System.out.print("No silly, i said EVEN not odd! Try again: ");
//            number = scan.nextInt();
}




