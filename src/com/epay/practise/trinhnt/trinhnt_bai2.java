package com.epay.practise.Bai1;

import java.util.Scanner;

public class trinhnt_bai2 {

    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);
        trinhnt_bai2 bai2=new trinhnt_bai2();
        //2. Tính tổng 2 số

        System.out.println("Nhap so nguyen n");
        int a =obj.nextInt();

        bai2.isEven(a);
        System.out.println("nhap 3 so ngau nhien");
        int so1 =obj.nextInt();
        int so2 =obj.nextInt();
        int so3 =obj.nextInt();
        int max=bai2.findMax(so1,so2,so3);
        System.out.println("Số lớn nhất là max" +max);
        //3. Xác định ngày trong tuần bằng switch case
        int thu;
        do {
            System.out.println("Nhập thứ trong tuần <8");
            thu =obj.nextInt();
            bai2.thutrongtuan(thu);
        }
        while (thu>7);
        //4. Xếp loại học sinh dựa trên điểm số
        int diemso=0;
        while (diemso<100){
            System.out.println("Nhập điểm từ  (0 - 100) ");
            diemso =obj.nextInt();
            bai2.díemso(diemso);
        }
     //  5. In tam giác số
        int tamgiac=0;
        System.out.println("nhap tamgiac");
        tamgiac =obj.nextInt();
        bai2.intamgiac(tamgiac);
    }
    public void isEven(int n)
    {
        if (n%2 ==0)
        {
            System.out.println("So nhap vao la so chan");
        }
        else
            System.out.println("So nhap vao la so le");
    }
    public int findMax (int a,int b,int c)
    {
        int max=a;
        if (b>max)
        {
            max = b;
            if(c>max)
                max=c;
        }
        else
            if(c>max)
            max=c;
            return max;
    }
    public void thutrongtuan(int thu)
    {
        switch (thu) {
            case 1:
                System.out.println("Ngày vừa nhập là chủ nhật");
                 break;
            case 2:
                System.out.println("Ngày vừa nhập là thứ "+thu);
                break;
            case 3:
                System.out.println("Ngày vừa nhập là thứ "+thu);
                break;
            case 4:
                System.out.println("Ngày vừa nhập là thứ "+thu);
                break;
            case 5:
                System.out.println("Ngày vừa nhập là thứ "+thu);
                break;
            case 6:
                System.out.println("Ngày vừa nhập là thứ "+thu);
                break;
            case 7:
                System.out.println("Ngày vừa nhập là thứ "+thu);
                break;
            default:
                System.out.println("Nhập số vừa nhập <8");
                break;
        }
    }
  public void díemso(int diem)
  {
      if((diem>=85) && (diem<=100))
      {
          System.out.println("Xếp loại A");
      }
      else
      {
          if (diem>=70)
          {
              System.out.println("Xếp loại B");
          }
         else
             if (diem>=50) {
              System.out.println("Xếp loại C");
          }
          else
          {
              System.out.println("Xếp loại D");
          }
      }
  }
  public void intamgiac(int n)
  {
      for (int i=1;i<=n;i++)
      {
          for(int j=1;j<=i;j++) {
              System.out.print("" + j);
          }
          System.out.print("\n");
      }
  }

}
