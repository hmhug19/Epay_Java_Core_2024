package com.epay.practise.HoaDTK;

import java.util.Scanner;

public class Bai1 {

  public static void TC1() {
    System.out.println("Hello world!");
  }

  public static void TC2() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhap so thu nhat: ");
    int a = scanner.nextInt();
    System.out.println("Nhap so thu hai: ");
    int b = scanner.nextInt();
    System.out.println("Tong " + a + " va " + b + " la: " + (a + b));
  }

  public static void TC3() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhap 1 so nguyen: ");
    int c = scanner.nextInt();
    if (c % 2 == 0) {
      System.out.println("So " + c + " la so chan");
    } else {
      System.out.println("So " + c + " la so le");
    }
  }

  public static void TC4() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhap chieu dai: ");
    int length = scanner.nextInt();
    System.out.println("Nhap chieu rong:  ");
    int width = scanner.nextInt();
    int chuvi = (length + width) * 2;
    int dientich = length * width;
    System.out.println("Chu vi hinh chu nhat la: " + chuvi);
    System.out.println("Dien tich hinh chu nhat la: " + dientich);
  }

  public static void TC5() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhap 1 so nguyen duong:  ");
    int n = scanner.nextInt();
    if(n>=0) {
      int tong = 0;
      for (int i = 0; i <= n; i++) {
        tong = tong + i;
      }
      System.out.println("Tong cac so tu 1 den " + n + " la: " + tong);
    }else
      System.out.println("Vui long nhap so nguyen duong");
  }

  public static void main(String[] args) {
    TC1();
    TC2();
    TC3();
    TC4();
    TC5();

  }

}
