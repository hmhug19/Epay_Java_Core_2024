package com.epay.practise.HoaDTK;

import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {

  public static void main(String[] args) {
    int[] myArray = nhapArray();
    findMaxInArray(myArray);
    countInArray(myArray);
    bubbleSortArray(myArray);
  }

  public static int[] nhapArray() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhap so phan tu cua mang: ");
    int n = scanner.nextInt();
    int[] myArray = new int[n];
    for (int i = 0; i < n; i++) {
      System.out.println("Nhap phan tu thu " + (i + 1));
      myArray[i] = scanner.nextInt();

    }
    System.out.println("Mang da nhap la: " + Arrays.toString(myArray));
    return myArray;
  }

  public static void findMaxInArray(int[] myArray) {
    int max = myArray[0];
    for (int j : myArray) {
      if (max < j) {
        max = j;
      }
    }
    System.out.println("So lon nhat trong mang la: " + max);
  }

  public static void countInArray(int[] myArray) {
    System.out.println("Nhap gia tri can dem ");
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int count = 0;
    for (int j : myArray) {
      if (j == a) {
        count = count + 1;

      }
    }
    System.out.println("So lan xuat hien cua " + a + " la: " + count);
  }

  public static void bubbleSortArray(int[] myArray) {

    for (int i = 0; i < myArray.length - 1; i++) {
      for (int j = 0; j < myArray.length - i - 1; j++) {
        if (myArray[j] > myArray[j + 1]) {
          int temp = myArray[j];
          myArray[j] = myArray[j + 1];
          myArray[j + 1] = temp;
        }
      }
    }
    System.out.println("Mang sau khi sap xep la: " + Arrays.toString(myArray));
  }
}
