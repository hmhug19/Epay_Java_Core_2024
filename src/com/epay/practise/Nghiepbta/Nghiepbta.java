package com.epay.practise.Nghiepbta;

import java.util.Scanner;
public class Nghiepbta {
    //Bài 1 In ra dòng chữ “Hello, World”
//    public  static void main (String [] args ) {
//        System.out.println("Hello, World");
//    }
    //Bài 2 Tính tổng 2 số
//    public  static void main (String [] args ) {
//        int a,b;
//        Scanner sc =new Scanner(System.in);
//        System.out.println("Nhập số a = ");
//        a=sc.nextInt();
//        System.out.println("Nhập số b = ");
//        b=sc.nextInt();
//        System.out.println("Tổng a + b = " + (a+b));
//    }
    //Bài 3 Kiểm tra số chẵn hay lẻ
//
    //Bài 4 Tính diện tích và chu vi hình chữ nhật
//    public  static void main (String [] args ) {
//        Float a,b;
//        Scanner sc =new Scanner(System.in);
//        System.out.println("Nhập số a = ");
//        a=sc.nextFloat();
//        System.out.println("Nhập số b = ");
//        b=sc.nextFloat();
//        System.out.println("Diện tích hcn " + (a*b));
//        System.out.println("Chu vi hcn " + 2*(a+b));
//    }

    // Bài 5 Tính tổng các số từ 1 đến n
    public  static void main (String [] args ) {
        int n;
        int tong =0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhập số nguyên n = ");
        n=sc.nextInt();
        for (int i=0; i<=n;i++)
         tong=tong+i;

        System.out.println("Tổng số từ 1 đến n = " + tong);
    }
}


