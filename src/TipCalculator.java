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
        System.out.print("What is the tip percentage (0-100): ");
        int tipPercentage = scan.nextInt();
        scan.nextLine();

        //dish info
        System.out.print("Enter the dish price, e.g. 10.50 (-1 to end): ");
        double dish = scan.nextDouble();
        scan.nextLine();
        double dishTotal = dish;
        while (dish != -1)  //while loop
        {
            System.out.print("Enter the dish price, e.g. 10.50 (-1 to end): ");
            dish = scan.nextDouble();
            dishTotal += dish;
        }
        dishTotal ++;
        System.out.println("---------------------------------------");

        //total tip
        double totalTip = (tipPercentage*.01) * dishTotal;
        String formattedtotalTip = formatter.format(totalTip);

        //total bill
        double totalBill = totalTip + dishTotal;
        String formattedtotalBill = formatter.format(totalBill);

        //per person cost before tip
        double personBeforeTip = dishTotal/people;
        String formattedpersonBeforeTip = formatter.format(personBeforeTip);

        //tip per person
        double tipPerPerson = totalTip/people;
        String formattedtipPerPerson = formatter.format(tipPerPerson);

        //total cost per person
        double costPerPerson = personBeforeTip + tipPerPerson;
        String formattedcostPerPerson = formatter.format(costPerPerson);

        //finals
        System.out.println("Your total bill before tip is: $"+ dishTotal);
        System.out.println("The tip percentage is: "+ tipPercentage);
        System.out.println("Your total tip is: $"+ formattedtotalTip);
        System.out.println("Your total bill after tip is: $"+ formattedtotalBill);
        System.out.println("Per person cost before tip is: $"+ formattedpersonBeforeTip);
        System.out.println("Per person tip is: $"+ formattedtipPerPerson);
        System.out.println("Total cost per person: $" + formattedcostPerPerson);
    }



}




