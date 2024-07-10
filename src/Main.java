import java.util.Scanner;



public class Main {


    public static void main(String[] args) {

        System.out.println("Welcome to this Calculator");
        System.out.println("1. Addition");
        System.out.println("2. Multiplication");
        System.out.println("3. Negative number to exit the space");

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Choose a operation number");
            int n = sc.nextInt();
            sc.nextLine();
            if(n==1 || n==2){
                System.out.println("Enter the inputs with a space");
                String input = sc.nextLine(); // take the inputs with a space.
                String[] inputValues = input.split(" ");
                int[] numbers = new int[inputValues.length];
                for (int i = 0; i < inputValues.length; i++) {
                    numbers[i] = Integer.parseInt(inputValues[i]);
                }
                if (n == 1) {
                    long addition = Addition.getAddition(numbers);
                    System.out.println("Your output " + addition);
                }
                else {
                    long multiple = Multiplication.getMultiplication(numbers);
                    System.out.println("Your output " + multiple);
                }
            }else if (n>2){
                System.out.println("Try again with a different operator");
            }else{

                    System.out.println("Thank-you for using this calculator");
                    break;

            }





        }



    }
}