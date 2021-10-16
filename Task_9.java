package com.company;
import java.util.Scanner;
public class Task_9 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b=0,temp=a;
        while(a>0){
            b = b*10 + a % 10;
            a = a / 10;
        }
        if(temp == b)
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}
