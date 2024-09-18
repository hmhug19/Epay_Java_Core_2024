package com.epay.practise.Bai1;

import java.util.Scanner;

public class ManhLD {
    public static void main(String[] args) {
        ManhLD run = new ManhLD();
        System.out.println("------Bài 1------");
        run.Bai_1();
        System.out.println("------Bài 2------");
        run.Bai_2();
        System.out.println("------Bài 3------");
        run.Bai_3();
        System.out.println("------Bài 4------");
        run.Bai_4();
        System.out.println("------Bài 5------");
        run.Bai_5();
        System.out.println("\nThân ái và chào tạm biệt!");
    }

    public void Bai_1() {
        System.out.println("In ra dòng chữ: Hello World!");
    }

    public void Bai_2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên thứ nhất: ");
        int num1 = scanner.nextInt();
        System.out.print("Nhập số nguyên thứ hai: ");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println("Tổng của hai số là: " + sum);
    }

    public void Bai_3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên: ");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("Số bạn vừa nhập vào là số chẵn");
        } else {
            System.out.println("Số bạn vừa nhập vào là số lẻ");
        }
    }

    public void Bai_4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào chiều dài hình chữ nhật: ");
        float length = scanner.nextFloat();
        System.out.print("Nhập vào chiều rộng hình chữ nhật: ");
        float width = scanner.nextFloat();
        System.out.println("Chu vi hình chữ nhật là: " + (length + width) * 2);
        System.out.println("Diện tích hình chữ nhật là: " + length * width);
    }

    public void Bai_5() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên n: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Vui lòng nhập một số nguyên dương.");
        } else {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            System.out.println("Tổng các số nguyên từ 1 đến " + n + " là: " + sum);
        }
    }
}
