package IFstatement;

import java.util.Scanner;

public class BiggerNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter second number");
        int num2= input.nextInt();
        System.out.println("Enter third number: ");
        int num3 = input.nextInt();

        if (num1>num2 && num1>num3){
            System.out.println("" +num1);
        }
        else if (num2>num3){
            System.out.println("biggest number is "+ num2);
        }else {
            System.out.println("biggest number is " + num3);
        }



    }

}
