import java.util.Scanner;

public class KalkulatorDoWhile {
    public static void main(String[] args) throws NumberFormatException {
        Scanner input=new Scanner(System.in);
        System.out.println("welcome to our cslculstor");
        String goOn;
        do {

            System.out.print("enter the firs number :");
            double a = Double.parseDouble(input.nextLine());
            System.out.println("enter the second number:");
            double b = Double.parseDouble(input.nextLine());
            System.out.println("choose one of the following oprations:");
            System.out.println("1- addition");
            System.out.println("2- subtraction");
            System.out.println("3- multiplication");
            System.out.println("4- divisiom");
            System.out.println("enter your choice");
            int choice = Integer.parseInt(input.nextLine());
            double result = 0.0;
            switch (choice) {

                case 1:
                    result = a + b;
                    break;
                case 2:
                    result = a - b;
                    break;
                case 3:
                    result = a * b;
                    break;
                case 4:
                    result = a / b;
                    break;
                default:
                    break;
            }
            if ((choice > 0) && (choice < 5)) {
                System.out.println("result: " + result);

            } else {
                System.out.println("invalid choice");
            }
            System.out.println("would you like to make another calculation?[yes/no:");
            goOn = input.nextLine();
        }while (goOn.equals("yes"));
        System.out.println("thanks you for using our calculator");
            }

    }