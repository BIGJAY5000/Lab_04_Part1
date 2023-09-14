import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);

    //variable declarations
        int intOperandA = 6;
        int intOperandB = 4;
        int intSum = 0;
        int intDifference = 0;
        int intProduct = 0;
        int intQuotient = 0;
        int intModulo = 0;
        double doubleOperandA = 3.8;
        double doubleOperandB = 12.5;
        double doubleSum = 0.0;
        double doubleProduct = 0.0;
        double doubleDifference = 0.0;
        double doubleQuotient = 0.0;
        double doubleModulo = 0.0;

        //operating tings
        intSum = intOperandA + intOperandB;
        System.out.println("The sum of " + intOperandA + " and " + intOperandB + " equals" + intSum);
        intDifference = intOperandA - intOperandB;
        System.out.println("The difference of " + intOperandA + " and " + intOperandB + " equals" + intDifference);
        intProduct = intOperandA * intOperandB;
        System.out.println("The difference of " + intOperandA + " and " + intOperandB + " equals" + intProduct);
        intQuotient = intOperandA / intOperandB;
        System.out.println("The difference of " + intOperandA + " and " + intOperandB + " equals" + intQuotient);
        intModulo = intOperandA % intOperandB;
        System.out.println("The difference of " + intOperandA + " and " + intOperandB + " equals" + intModulo);
        doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The difference of " + doubleOperandA + " and " + doubleOperandB + " equals" + doubleSum);
        doubleDifference = doubleOperandA - doubleOperandB;
        System.out.println("The difference of " + doubleOperandA + " and " + doubleOperandB + " equals" + doubleDifference);
        doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The difference of " + doubleOperandA + " and " + doubleOperandB + " equals" + doubleProduct);
        doubleQuotient = doubleOperandA / doubleOperandB;
        System.out.println("The difference of " + doubleOperandA + " and " + doubleOperandB + " equals" + doubleQuotient);
        doubleModulo = doubleOperandA % doubleOperandB;
        System.out.println("The difference of " + doubleOperandA + " and " + doubleOperandB + " equals" + doubleModulo);
    }
}