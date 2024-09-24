package com.epay.practise.Bai1;

import java.util.Scanner;

public class trinhnt {

    public static void main(String[] args) {
        System.out.println("Hello,world!");
        //2. Tính tổng 2 số
        Scanner obj =new Scanner(System.in);
        System.out.println("Nhap so nguyen a");
        int a =obj.nextInt();
        System.out.println("Nhap so nguyen b");
        int b =obj.nextInt();
        System.out.println("a+b="+(a+b));
        //  3. Kiểm tra số chẵn hay lẻ
        System.out.println("Nhap so nguyen c");
        int c =obj.nextInt();
        if (c%2==0)
            System.out.println("Số c là số chẵn");
        else
            System.out.println("Số c là số lẻ");
        // 4. Tính diện tích và chu vi hình chữ nhật
        System.out.println("Nhap chieu dai");
        int chieudai =obj.nextInt();
        System.out.println("Nhap chieu dai");
        int chieurong =obj.nextInt();
        System.out.println("Chu vi hinh chu nhat"+ ((chieudai+chieurong)*2));
        System.out.println("Dien tich hinh chu nhat"+ (chieudai*chieurong));
        //5. Tính tổng các số từ 1 đến n
        System.out.println(" Tính tổng các số từ 1 đến n, Nhập số n");
        int n =obj.nextInt();
        int tong=0;
        for (int i=1;i<=n;i++)
        {
            tong +=i;
        }
        System.out.println("Tổng của số từ 1 đến số"+n +"là " +tong);

    }

}
