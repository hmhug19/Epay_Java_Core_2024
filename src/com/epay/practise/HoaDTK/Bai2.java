package com.epay.practise.HoaDTK;

import java.util.Scanner;

public class Bai2 {

  public static void main(String[] args) {

    isEven();
    findMax();
    findDay();
    Xeploai();
    triangle();

  }

  public static void isEven() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhap 1 so nguyen: ");
    int c = scanner.nextInt();
    if (c % 2 == 0) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }
  }

  public static void findMax() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhap so nguyen thu nhat : ");
    int a = scanner.nextInt();
    System.out.println("Nhap so nguyen thu hai : ");
    int b = scanner.nextInt();
    System.out.println("Nhap so nguyen thu ba : ");
    int c = scanner.nextInt();
    int max = a;
    if (max < b) {
      max = b;
    }
    if (max < c) {
      max = c;
    }
    System.out.println("so lon nhat la: " + max);
  }

  public static void findDay() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhap 1 so tu 1-7");
    int day = scanner.nextInt();
    switch (day) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
      default:
        System.out.println("Vui long nhap tu 1-7");
    }

  }

  public static void Xeploai() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhap diem cua hoc sinh");
    int score = scanner.nextInt();
    if (score >= 85) {
      System.out.println("Hoc sinh xep loai A");
    } else if (score >= 70) {
      System.out.println("Hoc sinh xep loai B");
    } else if (score >= 50) {
      System.out.println("Hoc sinh xep loai C");
    } else if (score >= 0) {
      System.out.println("Hoc sinh xep loai D");
    } else {
      System.out.println("Diem da nhap khong hop le");
    }

  }

  public static void triangle() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhap 1 so nguyen duong");
    int n = scanner.nextInt();
    if (n >= 0) {
      for (int i = 1; i <= n; ++i) {
        for (int j = 1; j <= i; ++j) {
          System.out.print(j);
        }
        System.out.println();
      }
    } else {
      System.out.println("Vui long nhap so nguyen duong");
    }
  }

}
