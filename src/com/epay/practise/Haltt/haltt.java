package com.epay.practise.Haltt;

import java.util.Scanner;

public class haltt {
    public static void main(String[] args) {
        haltt luhaa = new haltt();
        System.out.println("Bài tập 1:");
        luhaa.bai1();
        System.out.println("Bài tập 2:");
        luhaa.bai2();
        System.out.println("Bài tập 3:");
        luhaa.bai3();
        System.out.println("Bài tập 4:");
        luhaa.bai4();
        System.out.println("Bài tập 5:");
        luhaa.bai5();
    }

    public void bai1(){
        System.out.println("Hello, World");
    }
    public void bai2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên a: ");
        int a = sc.nextInt();
        System.out.println("Nhập số nguyên b: ");
        int b = sc.nextInt();
        System.out.println("Tổng 2 số nguyên: " + (a+b));
    }
    public void bai3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số a: ");
        int a = sc.nextInt();
        if(a%2 == 0){
            System.out.println( a + " là số chẵn");
        }
        else
        {
            System.out.println( a + " là số lẻ");
        }
    }
    public void bai4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số chiều dài: ");
        int a = sc.nextInt();
        System.out.println("Nhập số chiều rộng: ");
        int b = sc.nextInt();
        int c = (a+b)*2;
        System.out.println("Chu vi hình chữ nhật là: " + c);
    }
    public void bai5(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số n: ");
        int n = sc.nextInt();
        int a = 0;
        for(int i=1; i<=n; i++){
            a += i;
        }
        System.out.println("Tổng các số là: " + a);
    }
}
