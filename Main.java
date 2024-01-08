import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\n***** Welcome to Binary Calculator *****"); //Interface Code
        System.out.println("Choose Option :");
        System.out.println("1 - Decimal to Binary");
        System.out.println("2 - Binary to Decimal");
        System.out.println("3 - Binary Addition");
        System.out.println("4 - Binary Subtraction");
        System.out.print("\nYour Choice : ");

        int choice = Integer.valueOf(input.nextLine());
        int sbin1;
        if (choice == 1) {
            System.out.println("Decimal to Binary Calculator");
            System.out.print("Enter the Decimal Number: ");
            sbin1 = Integer.valueOf(input.nextLine());
            System.out.println(decimalToBinary(sbin1));
        } else if (choice == 2) {
            System.out.println("Binary to Decimal Calculator");
            System.out.print("Enter Binary Number: ");
            sbin1 = Integer.valueOf(input.nextLine());
            System.out.println(binaryTodecimal(sbin1));
        } else {
            int sbin2;
            double binsub;
            int y;
            if (choice == 3) {
                System.out.println("Binary Addition");
                System.out.println("Enter first Binary Number: ");
                sbin1 = Integer.valueOf(input.nextLine());
                System.out.println("Enter second Binary Number: ");
                sbin2 = Integer.valueOf(input.nextLine());
                binsub = binaryTodecimal(sbin1) + binaryTodecimal(sbin2);
                y = (int)binsub;
                System.out.println("Sum of " + sbin1 + " & " + sbin2 + " = " + decimalToBinary(y));

            } else if (choice == 4) {
                System.out.println("Binary Subtraction");
                System.out.println("Enter first Binary Number:");
                sbin1 = Integer.valueOf(input.nextLine());
                System.out.println("Enter second Binary Number:");
                sbin2 = Integer.valueOf(input.nextLine());
                binsub = binaryTodecimal(sbin1) - binaryTodecimal(sbin2);
                y = (int)binsub;
                System.out.println("Subtraction of " + sbin1 + " & " + sbin2 + " = " + decimalToBinary(y));
            } else {
                System.out.println("Wrong Entry!!");
            }
        }

    }

    public static String decimalToBinary(int a) { //Method for Decimal to Binary
        String var10000;
        String store;
        for(store = Integer.toString(a % 2); a > 1; store = var10000 + store) {
            a /= 2;
            var10000 = Integer.toString(a % 2);
        }

        return store;
    }

    public static double binaryTodecimal(int a) { //Method for Binary to Decimal
        double dec = 0.0; //Because of the Math.pow function, only works with double

        for(double m = 0.0; a >= 1; ++m) {
            int rem = a % 10;  //Finds the binary digit
            a /= 10; //Prepares number for finding next binary digit
            dec += Math.pow(2.0, m) * (double)rem;  //Starting from the LSB and will go upto MSB
        }

        return dec; //double dec is returned
    }
}
