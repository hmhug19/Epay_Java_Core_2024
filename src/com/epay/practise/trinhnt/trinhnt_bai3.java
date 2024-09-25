package com.epay.practise.Bai1;

import java.util.Scanner;

public class trinhnt_bai3 {

    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);
        System.out.println("Nhap so nguyen n");
        trinhnt_bai3 bai3=new trinhnt_bai3();
        int n =obj.nextInt();
        int[] arr=new int[n];
        for (int i=0; i<n;i++)
        {   int giatri;
            System.out.println("Nhap giá trị cho mảng");
            giatri=obj.nextInt();
            arr[i]=giatri;
        }
        System.out.print("Giá trị của mảng là: ");
        for (int i=0; i<n;i++)
        {
            System.out.print(arr[i] +" ");
        }

        // tính tổng mảng
        System.out.println("Tổng là: "+bai3.tínhtong(arr));
        System.out.println("max là: "+bai3.max(arr));

         // dem so lan xuat hien cua so
        System.out.println("Nhap so can dem");
       int  socandem=obj.nextInt();
        System.out.print("số xuất hiên của"+bai3.dem(arr,socandem));
        // sapxep

        arr=   bai3.sapxep(arr);
        for (int i=0; i<n;i++)
        {
            System.out.println (arr[i] +" ");
        }
    }
    public int tínhtong (int[] arr)
    {
        int tong=0;
        for (int i=0;i<arr.length-1;i++)
        {
            tong +=arr[i];
        }
        return tong;
    }

    public int max (int[] arr)
    {
        int max=0;
        for (int i=0;i<arr.length-1;i++)
        {
           if(arr[i]>max)
               max=arr[i];
        }
        return max;
    }
    public int dem (int[] arr,int socandem)
    { int dem=0;
        for (int i=0;i<arr.length-1;i++)
        {
            if (arr[i]==socandem) {
                dem += 1;
            }
        }
        return dem;
    }
    public int[] sapxep(int[] arr)
    {
        int tam;
        for (int i=0;i<arr.length;i++)
        {
            for (int j=0;j< arr.length - i - 1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    tam=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tam;
                }
            }
        }
        return arr;
    }
}
