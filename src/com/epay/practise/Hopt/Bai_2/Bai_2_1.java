package Bai_2;

import java.util.Scanner;

public class Bai_2_1 {
    public static void main(String[] args) {
        isEven();
        findMax();
        NgayTrongTuan();
    }

    public static boolean isEven() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập số nguyên dương a = ");
        int a = scanner.nextInt();
        if (a % 2 == 0) {
            System.out.println("Số " + a + " là số chẵn");
            return true;
        }
        else {
            System.out.println("Số " + a + " là số lẻ");
            return false;
        }
    }
    public static void findMax () {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập số nguyên dương a = ");
        int a = scanner.nextInt();
        System.out.printf("Nhập số nguyên dương b = ");
        int b = scanner.nextInt();
        System.out.printf("Nhập số nguyên dương c = ");
        int c = scanner.nextInt();
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println("Số lớn nhất là = " +max);
    }
    public static void NgayTrongTuan () {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập số từ 1->7 = ");
        int a = scanner.nextInt();
        switch (a) {
            case 1:
                System.out.println("Chủ Nhật");
                break;
            case 2:
                System.out.println("Thứ Hai");
                break;
            case 3:
                System.out.println("Thứ Ba");
                break;
            case 4:
                System.out.println("Thứ Tư");
                break;
            case 5:
                System.out.println("Thứ Năm");
                break;
            case 6:
                System.out.println("Thứ Sáu");
                break;
            case 7:
                System.out.println("Thứ Bảy");
                break;
            default:
                System.out.println("Số không hợp lệ! Vui lòng nhập số từ 1 đến 7.");
        };
    }
}
