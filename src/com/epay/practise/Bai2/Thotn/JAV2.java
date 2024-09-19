package com.epay.practise.Bai2.Thotn;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class JAV2 {
    private static final Scanner scanner = new Scanner(System.in);

    public static boolean isEven() {
        System.out.print("Nhập vào số nguyên: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            return true; // Trả về true nếu số là chẵn
        } else {
            return false; // Trả về false nếu số là lẻ
        }
    }

    public static int findMax() {
        // So sánh ba số để tìm số lớn nhất
        System.out.print("Nhập vào số a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập vào số b: ");
        int b = scanner.nextInt();
        System.out.print("Nhập vào số c: ");
        int c = scanner.nextInt();
        int max = a; // giả sử a là số lớn nhất
        if (b > max) {
            max = b;  // Cập nhật max nếu b lớn hơn max hiện tại
        }
        if (c > max) {
            max = c;  // Cập nhật max nếu c lớn hơn max hiện tại
        }
        return max;
    }

    public static void dayOfWeek() {
        // Lấy ngày hiện tại
        LocalDate currentDate = LocalDate.now();
        // Lấy ngày trong tuần của ngày hiện tại
        DayOfWeek today = currentDate.getDayOfWeek();
        int dayNumber = scanner.nextInt();
        String dayName;
        switch (dayNumber) {
            case 1:
                dayName = "Chủ nhật";
                System.out.println(dayName);
                break;
            case 2:
                dayName = "Thứ hai";
                System.out.println(dayName);
                break;
            case 3:
                dayName = "Thứ ba";
                System.out.println(dayName);
                break;
            case 4:
                dayName = "Thứ tư";
                System.out.println(dayName);
                break;
            case 5:
                dayName = "Thứ năm";
                System.out.println(dayName);
                break;
            case 6:
                dayName = "Thứ sáu";
                System.out.println(dayName);
                break;
            case 7:
                dayName = "Thứ bảy";
                System.out.println(dayName);
                break;
            default:
                dayName = String.valueOf(today);
                System.out.println(dayName);
                break;
        }
    }

    public static void xeploaihs() {
        int diem = scanner.nextInt();
        if (diem >= 85 && diem <= 100) {
            System.out.println("Xếp loại A");
        } else if (diem >= 70 && diem < 85) {
            System.out.println("Xếp loại B");
        } else if (diem >= 50 && diem < 70) {
            System.out.println("Xếp loại C");
        } else if (diem >= 0 && diem < 50) {
            System.out.println("Xếp loại D");
        } else {
            System.out.println("Bạn ở hành tinh khác đến à");
        }
    }

    public static void hinhtamgiac() {
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Test hàm isEven
        boolean result = isEven();
        System.out.println("Kết quả kiểm tra số nhập vào là: " + result);

        // Test hàm findMax
        int solonnhat = findMax();
        System.out.println("Số lớn nhất là: " + solonnhat);

        // Test today
        System.out.print("Nhập ngày trong tuần: ");
        dayOfWeek();

        // Test xep loại hs
        System.out.print("Nhập số điểm của học sinh: ");
        xeploaihs();

        // Test in hình tam giác
        System.out.print("Nhập vào số nguyên N: ");
        hinhtamgiac();

        scanner.close();
    }
}
