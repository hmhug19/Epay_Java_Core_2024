package com.epay.practise.huyenltk;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        // Kiểm tra số chẵn lẻ
        System.out.println("Nhập số nguyên cần kiểm tra chẵn/lẻ ");
        int x = scanner.nextInt();
        isEven(x);

        // Tìm số lớn nhất
        System.out.println("Nhập số nguyên a ");
        int a = scanner.nextInt();
        System.out.println("Nhập số nguyên b ");
        int b = scanner.nextInt();
        System.out.println("Nhập số nguyên c ");
        int c = scanner.nextInt();
        int max=findMax(a,b,c);
        System.out.println("Số lớn nhất trong 3 số đã nhập là " + max);

        // Ngày trong tuần
        System.out.println("Nhập số nguyên ");
        int d = scanner.nextInt();
        int day=day(d);

    }

    static void isEven(int x){
        boolean isEven=x%2==0;
        if(isEven){
            System.out.println( x + " là số chẵn");
        }
        else{
            System.out.println( x + " là số lẻ");
        }

    }

    static int findMax(int a, int b, int c){
        int max=a;
        if(max<b){
            max=b;
        }
        if(max<c){
            max=c;

        }
        return max;

    }

    static int day(int d){
        switch(d){
            case 1:
                System.out.println("Nay là thứ Hai");
                break;
            case 2:
                System.out.println("Nay là thứ Ba");
                break;
            case 3:
                System.out.println("Nay là thứ Tư");
                break;
            case 4:
                System.out.println("Nay là thứ Năm");
                break;
            case 5:
                System.out.println("Nay là thứ Sáu");
                break;
            case 6:
                System.out.println("Nay là thứ Bảy");
                break;
            case 7:
                System.out.println("Nay là Chủ Nhật");
                break;
            default:
                System.out.println("Ngày không hợp lệ");
                break;
        }
     return d;
    }
}
