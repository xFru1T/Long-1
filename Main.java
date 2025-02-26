import java.util.Scanner;
class Long {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Print element Fibonacci: ");
        long element = scanner.nextInt();
        long result = fib(element - 1);
        System.out.println("Number in the element: " + result);
        }
    public static long fib(long element) {
        if (element == 0) {
            return 0;
        } else
            if (element == 1) {
            return 1;
        }
            else {
            return fib(element - 1) + fib(element - 2);
            }
        }
    }
