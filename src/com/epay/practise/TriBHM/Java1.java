package TriBHM;

import java.util.Scanner;

public class Java1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. In ra dòng chữ 'Hello, World'
        helloWorld();

        // 2. Tính tổng 2 số
        sumTwoNumbers(scanner);

        // 3. Kiểm tra số chẵn hay lẻ
        evenOrOdd(scanner);

        // 4. Tính diện tích và chu vi hình chữ nhật
        rectangleAreaPerimeter(scanner);

        // 5. Tính tổng các số từ 1 đến n
        sumFromOneToN(scanner);

        scanner.close();
    }

    // 1. In ra dòng chữ 'Hello, World'
    public static void helloWorld() {
        System.out.println("1. Hello, World");
    }

    // 2. Tính tổng 2 số
    public static void sumTwoNumbers(Scanner scanner) {
        System.out.print("2. Nhập số thứ nhất: ");
        int num1 = scanner.nextInt();

        System.out.print("Nhập số thứ hai: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        System.out.println("Tổng của hai số là: " + sum);
    }

    // 3. Kiểm tra số chẵn hay lẻ
    public static void evenOrOdd(Scanner scanner) {
        System.out.print("3. Nhập một số nguyên: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " là số chẵn.");
        } else {
            System.out.println(number + " là số lẻ.");
        }
    }

    // 4. Tính diện tích và chu vi hình chữ nhật
    public static void rectangleAreaPerimeter(Scanner scanner) {
        System.out.print("4. Nhập chiều dài: ");
        double length = scanner.nextDouble();

        System.out.print("Nhập chiều rộng: ");
        double width = scanner.nextDouble();

        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.println("Diện tích hình chữ nhật là: " + area);
        System.out.println("Chu vi hình chữ nhật là: " + perimeter);
    }

    // 5. Tính tổng các số từ 1 đến n
    public static void sumFromOneToN(Scanner scanner) {
        System.out.print("5. Nhập một số nguyên dương n: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Tổng các số từ 1 đến " + n + " là: " + sum);
    }
}
