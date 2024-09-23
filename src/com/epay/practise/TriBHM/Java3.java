package TriBHM;

import java.util.Scanner;

public class Java3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Tạo và in các phần tử trong mảng
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.println("Mảng bạn đã nhập:");
        printArray(arr);

        // 2. Tính tổng các phần tử trong mảng
        int sum = calculateSum(arr);
        System.out.println("Tổng các phần tử trong mảng: " + sum);

        // 3. Tìm phần tử lớn nhất trong mảng
        int max = findMax(arr);
        System.out.println("Phần tử lớn nhất trong mảng: " + max);

        // 4. Đếm số lần xuất hiện của phần tử trong mảng
        System.out.print("Nhập giá trị cần đếm số lần xuất hiện: ");
        int valueToCount = scanner.nextInt();
        int count = countOccurrences(arr, valueToCount);
        System.out.println("Số lần xuất hiện của " + valueToCount + " trong mảng: " + count);

        // 5. Sắp xếp mảng theo thứ tự tăng dần (Sắp xếp nổi bọt - Bubble Sort)
        bubbleSort(arr);
        System.out.println("Mảng sau khi sắp xếp theo thứ tự tăng dần:");
        printArray(arr);

        scanner.close();
    }

    // Hàm in mảng
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // 2. Hàm tính tổng các phần tử trong mảng
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum;
    }

    // 3. Hàm tìm phần tử lớn nhất trong mảng
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int value : arr) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    // 4. Hàm đếm số lần xuất hiện của phần tử trong mảng
    public static int countOccurrences(int[] arr, int value) {
        int count = 0;
        for (int v : arr) {
            if (v == value) {
                count++;
            }
        }
        return count;
    }

    // 5. Hàm sắp xếp mảng theo thứ tự tăng dần (Bubble Sort)
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Hoán đổi arr[j] và arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
