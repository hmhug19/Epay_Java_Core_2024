import java.util.Scanner;

public class Bai1 {

    //Câu 1
    public static void Case1() {
        System.out.println("Hello, world");
    }
    //Câu 2
    public static void Case2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên thứ nhất: ");
        int num1 = scanner.nextInt();
        System.out.println("Nhập số nguyên thứ hai: ");
        int num2 = scanner.nextInt();
        System.out.println("Tong " + num1 + " + " + num2 + " la: " + (num1 + num2));
    }
    //Câu 3
    public static void Case3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhật một số nguyên bất kỳ: ");
        int num3 = scanner.nextInt();
        if (num3 % 2 == 0) {
            System.out.println("Số " + num3 + " là số nguyên chẵn");
        } else {
            System.out.println("Số " + num3 + " là số nguyên lẻ");
        }
    }
    //Câu 4
    public static void Case4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài: ");
        int length = scanner.nextInt();
        System.out.println("Nhập chiều rộng:  ");
        int width = scanner.nextInt();
        int chuvi = (length + width) * 2;
        int dientich = length * width;
        System.out.println("Chu vi hình chữ nhật là: " + chuvi);
        System.out.println("Diện tích hình chữ nhật là: " + dientich);
    }
    //Câu 5
    public static void Case5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 1 số nguyên dương bất kỳ:  ");
        int n = scanner.nextInt();
        if(n>=0) {
            int tong = 0;
            for (int i = 0; i <= n; i++) {
                tong = tong + i;
            }
            System.out.println("Tổng các số từ 1 đến " + n + " la: " + tong);
        }else
            System.out.println("Nhập sai. Vui lòng nhập lại");
    }

    public static void main(String[] args) {
        Case1();
        Case2();
        Case3();
        Case4();
        Case5();

    }

}
