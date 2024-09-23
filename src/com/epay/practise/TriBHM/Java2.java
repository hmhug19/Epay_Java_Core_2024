package TriBHM;

import java.util.Scanner;

public class Java2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Kiểm tra số chẵn lẻ
        System.out.print("Nhập một số nguyên để kiểm tra chẵn lẻ: ");
        int number = scanner.nextInt();
        if (isEven(number)) {
            System.out.println(number + " là số chẵn.");
        } else {
            System.out.println(number + " là số lẻ.");
        }

        // 2. Tìm số lớn nhất trong ba số
        System.out.print("Nhập số thứ nhất: ");
        int num1 = scanner.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int num2 = scanner.nextInt();
        System.out.print("Nhập số thứ ba: ");
        int num3 = scanner.nextInt();
        int max = findMax(num1, num2, num3);
        System.out.println("Số lớn nhất trong ba số là: " + max);

        // 3. Xác định ngày trong tuần bằng switch case
        System.out.print("Nhập số nguyên từ 1 đến 7 để xác định ngày trong tuần: ");
        int day = scanner.nextInt();
        String dayOfWeek = getDayOfWeek(day);
        if (dayOfWeek != null) {
            System.out.println("Ngày tương ứng: " + dayOfWeek);
        } else {
            System.out.println("Số không hợp lệ.");
        }

        // 4. Xếp loại học sinh dựa trên điểm số
        System.out.print("Nhập điểm trung bình của học sinh (0 - 100): ");
        int score = scanner.nextInt();
        String grade = getGrade(score);
        System.out.println("Xếp loại: " + grade);

        // 5. In tam giác số
        System.out.print("Nhập số dòng cho tam giác số: ");
        int N = scanner.nextInt();
        printNumberTriangle(N);

        scanner.close();
    }

    // 1. Hàm kiểm tra số chẵn lẻ
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // 2. Hàm tìm số lớn nhất trong ba số
    public static int findMax(int num1, int num2, int num3) {
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        return max;
    }

    // 3. Hàm xác định ngày trong tuần bằng switch case
    public static String getDayOfWeek(int day) {
        switch (day) {
            case 1:
                return "Chủ nhật";
            case 2:
                return "Thứ hai";
            case 3:
                return "Thứ ba";
            case 4:
                return "Thứ tư";
            case 5:
                return "Thứ năm";
            case 6:
                return "Thứ sáu";
            case 7:
                return "Thứ bảy";
            default:
                return null;
        }
    }

    // 4. Hàm xếp loại học sinh dựa trên điểm số
    public static String getGrade(int score) {
        if (score >= 85) {
            return "A";
        } else if (score >= 70 && score < 85) {
            return "B";
        } else if (score >= 50 && score < 70) {
            return "C";
        } else {
            return "D";
        }
    }

    // 5. Hàm in tam giác số
    public static void printNumberTriangle(int N) {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
