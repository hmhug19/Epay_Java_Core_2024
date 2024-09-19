package com.epay.practise.Bai3.Thotn;

import java.util.Arrays;
import java.util.Scanner;

public class JAV3 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void arrs() {
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();

        int[] arrs = new int[n];
        int max = 0;
        for(int i =0; i<n ; i++) {
            System.out.println("Nhập giá trị cho phần tử thứ " + (i + 1) + ": ");
            arrs[i] = scanner.nextInt();
            if(arrs[i] > max) {
                max = arrs[i];
            }
        }

        // Nhập phần tử cần đếm
        System.out.print("Nhập phần tử cần đếm số lần xuất hiện: ");
        int elementToCount = scanner.nextInt();

        // Đếm số lần xuất hiện của phần tử
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arrs[i] == elementToCount) {
                count++;
            }
        }

        // In ra mảng đã nhập
        System.out.print("Mảng đã nhập: ");
        int tong  = 0;
        for (int i = 0; i < n; i++) {
            System.out.print(arrs[i] + " ");
            tong += arrs[i];
        }
        // Sắp xếp mảng theo thứ tự tăng dần
        Arrays.sort(arrs);

        System.out.println();
        System.out.println("Tổng các phần tử của mảng :" + tong);
        System.out.println("Số lớn nhất trong mảng :" + max);
        // In ra số lần xuất hiện của phần tử
        System.out.println("Số lần xuất hiện của phần tử " + elementToCount + " là: " + count);
        // In ra mảng đã sắp xếp
        System.out.print("Mảng đã sắp xếp theo thứ tự tăng dần: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arrs[i] + " ");
        }

    }


    public static void main(String[] args) {
        // Thực thi - làm gì mà phải xoắn
        arrs();
        scanner.close();
    }
}
