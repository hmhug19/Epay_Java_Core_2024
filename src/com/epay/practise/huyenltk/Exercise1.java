package com.epay.practise.huyenltk;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        // in ra "Hello, world"
        System.out.println("Hello, world");

        // Tính tổng 2 số nguyên nhập từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên thứ 1");
        int a = scanner.nextInt();
        System.out.println("Nhập số nguyên thứ 2");
        int b = scanner.nextInt();
        int total = tongHaiSo(a,b);
        System.out.println("Tổng của 2 số nguyên đã nhập là " + total);

        // Kiểm tra chẵn lẻ
        System.out.println("Nhập số nguyên cần kiểm tra chẵn/lẻ ");
        int x = scanner.nextInt();
        checkChanLe(x);

        // Tính diện tích hình chữ nhật
        System.out.println("Nhập chiều dài hình chữ nhật ");
        float l = scanner.nextFloat();
        System.out.println("Nhập chiều rộng hình chữ nhật ");
        float w = scanner.nextFloat();
        float s = dienTich(l,w);
        float c = chuVi(l,w);
        System.out.println("Diện tích hình chữ nhật là " + s);
        System.out.println("Chu vi hình chữ nhật là " + c);

        // Tính tổng dãy số từ 1 đến n
        System.out.println("Nhập n ");
        int n = scanner.nextInt();
        int totalDS = tongDaySo(n);
        System.out.println("Tổng từ 1 đến " + n + " là " + totalDS);

    }
    static int tongHaiSo(int a, int b){
        int total = a+b;
        return total;
    }

    static void checkChanLe(int x){
        boolean checkChanLe;
        checkChanLe=x%2==0;
        if (checkChanLe){
            System.out.println( x + " là số chẵn");
        }
        else{
            System.out.println(x + " là số lẻ");
        }
    }

    static float dienTich(float l, float w){
        float s = l * w;
        return s;
    }

    static float chuVi(float l, float w){
        float c = (l + w)*2;
        return c;
    }

    static int tongDaySo(int n){
        int totalDS=0;
        for (int i=1; i<=n; i ++){
            totalDS+= i;
        }
        return totalDS;
    }


}
