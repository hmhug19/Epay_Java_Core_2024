package com.epay.practise.Thotn;

import java.util.Scanner;

public class JAV1 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void printText(String text) {
        System.out.println(text);
    }

    public static void sapNumber() {
        // Nhập số nguyên đầu tiên từ bàn phím
        System.out.print("Nhập số nguyên thứ nhất: ");
        int num1 = scanner.nextInt();

        // Nhập số nguyên thứ hai từ bàn phím
        System.out.print("Nhập số nguyên thứ hai: ");
        int num2 = scanner.nextInt();

        // Tính tổng của hai số
        int total = num1 + num2;

        // Tính diện tích
        int area = num1 * num2;
        // Tính chu vi
        int perimeter = 2 * (num1 + num2);
        // Hiển thị kết quả
        System.out.println("Tổng 2 số nhập vào: " + total);
        System.out.println("Chu vi hình chữ nhật: " + perimeter);
        System.out.println("Diện tích hình chữ nhật: " + area);

    }

    public static void getText() {
        System.out.print("Nhap so can kiem tra: ");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("Số nhập vào là số chẵn");
        } else {
            System.out.println("Số nhập vào là số lẻ");
        }
    }

    public static int sums() {
        System.out.print("Nhập số nguyên thứ n cần tính tổng: ");
        int nums = scanner.nextInt();
        // Tỉnh tổng các số từ 1 đến n
        int tong = 0;
        if (nums < 1) {
            System.out.println("nums phải lớn hơn or bằng 1");
        } else {
            for (int i = 1; i <= nums; i++) {
                tong += i;
            }
        }
        System.out.println("Tổng của các số tuwf 1 đến n: " + tong);

        return tong;
    }


    public static void main(String[] args) {
        // Test In ra dòng chữ " Hello, world"
        printText("Hello, World");
        // Biểu thức toán học
        sapNumber();
        // Kiểm tra số nhập vào là chẵn hay lẻ
        getText();
        // Tính tổng các số từ 1 đến n
        sums();

        scanner.close();
    }
}
