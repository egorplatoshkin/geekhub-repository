package com.company.GeekHub.HomeTask.Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeTask1 {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        boolean exit = true;
        while (exit){
        System.out.println("Home task #1\n" +
                "Choose action\n" +
                "1.Count factorial\n" +
                "2.Fibonacci numbers \n" +
                "3.Output the number in words\n" +
                "4.EXIT");
        int choose = Integer.parseInt(reader.readLine());
        int number = 0;
        switch (choose)
        {
            case 1:
                System.out.println("Enter number for count:");
                number = Integer.parseInt(reader.readLine());
                Factorial factorial = new Factorial();
                System.out.println("Result :" + factorial.count(number));
                continue;
            case 2:
                boolean flag = true;
                while (flag) {
                    System.out.println("Enter the last number in the sequence:");
                    number = Integer.parseInt(reader.readLine());
                    if (number<=0) {
                        System.out.println("Illegal value! Please enter number more than zero.");
                        continue;
                    }else flag = false;

                }
                Fibonacci fibonacci = new Fibonacci();
                fibonacci.buildSequence(number);
                continue;
            case 3:
                System.out.println("Enter number which you want transform:");
                number = Integer.parseInt(reader.readLine());
                NumberToWord numberToWord = new NumberToWord();
                System.out.println("Result : " + numberToWord.transform(number));
                continue;
            default:
                System.out.println("You make wrong choice. Pleas try again one more time.");
                continue;
            case 4:
                exit = false;
                break;
        }
    }
    }
}
