package ru.ac.uniyar.esin.and.scherbakov;
import java.util.Scanner;

public class Main
{
    static char slash = '/';
    public static int getInt()
    {
        int num;
        if (scanner.hasNext())
        {
            num = scanner.nextInt();
        }
        else
        {
            System.out.print("Wrong input");
            scanner.next();
            num = getInt();
        }
        return num;
    }
    public static char getSign()
    {
        char op;
        if (scanner.hasNext())
        {
            op = scanner.next().charAt(0);
        }
        else
        {
            System.out.print("Wrong input");
            scanner.next();
            op = getSign();
        }
        return op;
    }
    public static int calc(int num1, int num2, char operator)
    {
        int sum = 0;
        switch (operator)
        {
            case '+':
                sum = num1 + num2;
                break;
            case '-':
                sum = num1 - num2;
                break;
            case '*':
                sum = num1 * num2;
                break;
            case '/':
                if (num2 == 0)
                {
                    System.out.print("Error");
                    System.exit(0);
                }
                else
                {
                    sum = num1 / num2;
                }
                break;
        }
        return sum;
    }
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        int num1 = getInt();
        char operator = getSign();
        int num2 = getInt();
        System.out.print(calc(num1, num2, operator));
    }
}