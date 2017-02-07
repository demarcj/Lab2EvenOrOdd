import java.util.Scanner;

/**
 * Created by DeMarcj on 1/31/2017.
 */
public class OddOrEven {
    public static void main (String [] args) {
        //Basic variable/reference setup
        Scanner scan = new Scanner(System.in);
        String repeater = "";


        System.out.println("What is your name?");
        String userName = scan.nextLine();

        //This do while is going allow the usere to enter a number
        do {
            System.out.println(userName + " enter a number between 1 - 100");
            double inputNum = scan.nextDouble();

            //This is a validation while loop to make sure the user write between the number 1-100
            while (inputNum < 1 || inputNum > 100) {
                if (inputNum < 1) {
                    System.out.println(userName + " your number too low!");
                } else {
                    System.out.println(userName + " your number too high!");
                }
                inputNum = scan.nextDouble();
            }//End of the validation loop

            //This if statement will print out a string depending on the input string
            if (inputNum % 2 == 1 && inputNum < 60) {
                System.out.println(userName + ", your number is odd");
            } else if (inputNum % 2 == 0 && inputNum >= 2 && inputNum <= 25) {
                System.out.println(userName + " Even and less than 25");
            } else if (inputNum % 2 == 0 && inputNum >= 26 && inputNum <= 60) {
                System.out.println(userName + " your number is even");
            } else if (inputNum % 2 == 0 && inputNum > 60) {
                System.out.println(userName + ", " + (int) inputNum + " and Even");
            } else if (inputNum % 2 == 1 && inputNum > 60) {
                System.out.println(userName + ", " + (int) inputNum + " and Odd");
            }
            System.out.print("Repeat: Yes/No: ");
            repeater = scan.next();
        }//End of the do while that allow the user to put in a number
        while (repeater.equals("Yes"));
        System.out.print("Bye bye, " + userName);
        scan.close();
    }
}
