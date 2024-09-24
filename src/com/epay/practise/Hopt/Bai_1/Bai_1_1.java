package Bai_1;

import java.util.Scanner;

public class Bai_1_1 {
    public static void main(String[] args) {
        System.out.println("Hello, World");
        Sum();
        KiemTraChanLe();
        DienTichChuVi();
        TongSoNguyenDuong();
        TongSoNguyenDuong();
        }
    public static void Sum (){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập số a = ");
        int a = scanner.nextInt();
        System.out.printf("Nhập số b = ");
        int b = scanner.nextInt();
        System.out.println("a+b = "+(a+b));
        }
    public static void KiemTraChanLe () {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập số dương a = ");
        int a = scanner.nextInt();
        if(a%2==0)
            System.out.println("Số "+ a +" là số chẵn");
            else
            System.out.println("Số "+ a +" là số lẻ");
    }
    public static void DienTichChuVi (){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập chieu dai = ");
        int a = scanner.nextInt();
        System.out.printf("Nhập chiều rộng = ");
        int b = scanner.nextInt();
        System.out.println("Chu vi hình chữ nhật là = "+(a+b)*2);
        System.out.println("Diện tích hình chữ nhật là = "+a*b);
    }
    public static void TongSoNguyenDuong (){

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập số nguyên dương = ");
        int n = scanner.nextInt();
        int Sum = 0;
        for (int i=1; i<=n; i++) {
         Sum += i;
        }
        System.out.println("Tổng các số nguyên dương = "+Sum);
    }
}
