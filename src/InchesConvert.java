import java.util.Scanner;

public class InchesConvert {
    public static void main(String []args){

        Scanner scan =new Scanner(System.in);

        System.out.println("Enter number of  fathom ");
        int fathoms= scan.nextInt();

        System.out.println("Enter  number of ells ");
        int ells= scan.nextInt();

        System.out.println("Enter number of feet");
        int feet = scan.nextInt();

        System.out.println("Enter number of inches");
        int inches = scan.nextInt();

        // Step 1: Convert everything to inches
         double totalInches=
                 (fathoms * 72) +
                         (ells * 24) +
                         (feet * 12) +
                         inches;

        // Step 2: Convert inches to centimeters
         double totalCm=totalInches * 2.54;

        System.out.println("Total length in  centimeters:t " + totalCm + "cm");

        scan.close();



    }
}
