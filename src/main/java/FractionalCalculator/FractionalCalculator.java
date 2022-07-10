package FractionalCalculator;

import java.util.Scanner;

public class FractionalCalculator {
    public static void main(String[] args) {
        String result = "1";
        try (Scanner in = new Scanner(System.in)) {
            String str1 = in.next();
            int ind = str1.indexOf('/');
            if (ind == -1) {
                int x = Integer.parseInt(str1);
                String num1 = in.next();
                String _y = in.next();
                result = calc(str1, num1, _y);
                //System.out.println(result);
                int y = Integer.parseInt(_y);
                if (y != 0) {
                    switch (num1) {
                        case "+":
                            System.out.println(x + y);
                            break;
                        case "-":
                            System.out.println(x - y);
                            break;
                        case "*":
                            System.out.println(x * y);
                            break;
                        case "/":
                            System.out.println(x + "/" + y);
                            break;
                    }
                } else if (y == 0 && x != 0) {
                    System.out.println("Cannot be divided by 0");
                } else if (x == 0 && y == 0) {
                    System.out.println("Uncertainty");
                }
            } else {
                int x2 = 0, y2 = 0;
                String[] parth = str1.split("/");
                int x1 = Integer.parseInt(parth[0]);
                int y1 = Integer.parseInt(parth[1]);
                String s1 = in.next();
                String str2 = in.next();
                result = calc(str1, s1, str2);
                // System.out.println(result);
                int ind1 = str2.indexOf("/");
                if (ind1 != -1) {
                    String[] parth1 = str2.split("/");
                    x2 = Integer.parseInt(parth1[0]);
                    y2 = Integer.parseInt(parth1[1]);
                } else {
                    x2 = Integer.parseInt(str2);
                    y2 = 1;
                }
                switch (s1) {
                    case "+":
                        if (y1 != 0 && y2 != 0) {
                            x1 = (x1 * y2) + (y1 * x2);
                            y1 *= y2;
                            System.out.println(x1 + "/" + y1);
                        } else
                            System.out.println("Cannot be divided by 0");
                        break;
                    case "-":
                        if (y2 != 0 && y1 != 0) {
                            x1 = (x1 * y2) - (y1 * x2);
                            y1 *= y2;
                            System.out.println(x1 + "/" + y1);
                        } else
                            System.out.println("Cannot be divided by 0");
                        break;
                    case "*":
                        if (y1 != 0 && y2 != 0) {
                            x1 *= x2;
                            y1 *= y2;
                            System.out.println(x1 + "/" + y1);
                        } else
                            System.out.println("Cannot be divided by 0");
                        break;
                    case "/":
                        if (y1 != 0 && y2 != 0) {
                            x1 *= y2;
                            y1 *= x2;
                            System.out.println(x1 + "/" + y1);
                        } else
                            System.out.println("Cannot be divided by 0");
                        break;
                }
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public static String calc(String num1, String op, String num2) {
        int slash = num1.indexOf('/');
        String result = "`";
        if (slash == -1) {
            int x = Integer.parseInt(num1);
            int y = Integer.parseInt(num2);
            if (y != 0) {
                switch (op) {
                    case "+":
                        result = Integer.toString(x + y);
                        break;
                    case "-":
                        result = Integer.toString(x - y);
                        break;
                    case "*":
                        result = Integer.toString(x * y);
                        break;
                    case "/":
                        String x__ = Integer.toString(x);
                        String y__ = Integer.toString(y);
                        result = result + x__ + "/" + y__;
                        break;
                }
            } else if (y == 0 && x != 0) {
                result = "Cannot be divided by 0";
                return result;
            } else if (x == 0 && y == 0) {
                result = "Uncertainty";
                return result;
            }
        } else {
            int x2 = 0, y2 = 0;
            String[] parth = num1.split("/");
            int x1 = Integer.parseInt(parth[0]);
            int y1 = Integer.parseInt(parth[1]);
            int ind1 = num2.indexOf("/");
            if (ind1 != -1) {
                String[] parth1 = num2.split("/");
                x2 = Integer.parseInt(parth1[0]);
                y2 = Integer.parseInt(parth1[1]);
            } else {
                x2 = Integer.parseInt(num2);
                y2 = 1;
            }
            switch (op) {
                case "+":
                    if (y1 != 0 && y2 != 0) {
                        x1 = (x1 * y2) + (y1 * x2);
                        y1 *= y2;
                        String x1__ = Integer.toString(x1);
                        String y1__ = Integer.toString(y1);
                        result = result + x1__ + "/" + y1__;
                        System.out.println(result);
                        return result;
                    } else
                        System.out.println("Cannot be divided by 0");
                    break;
                case "-":
                    if (y2 != 0 && y1 != 0) {
                        x1 = (x1 * y2) - (y1 * x2);
                        y1 *= y2;
                        String x1__ = Integer.toString(x1);
                        String y1__ = Integer.toString(y1);
                        result = result + x1__ + "/" + y1__;
                        System.out.println(result);
                        return result;
                    } else
                        System.out.println("Cannot be divided by 0");
                    break;
                case "*":
                    if (y1 != 0 && y2 != 0) {
                        x1 *= x2;
                        y1 *= y2;
                        String x1__ = Integer.toString(x1);
                        String y1__ = Integer.toString(y1);
                        result = result + x1__ + "/" + y1__;
                        System.out.println(result);
                        return result;
                    } else
                        System.out.println("Cannot be divided by 0");
                    break;
                case "/":
                    if (y1 != 0 && y2 != 0) {
                        x1 *= y2;
                        y1 *= x2;
                        String x1__ = Integer.toString(x1);
                        String y1__ = Integer.toString(y1);
                        result = result + x1__ + "/" + y1__;
                        System.out.println(result);
                        return result;
                    } else
                        System.out.println("Cannot be divided by 0");
                    break;
            }
        }
        System.out.println(result);
        return result;
    }
}