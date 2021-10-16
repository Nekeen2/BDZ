package com.company;
import java.util.Scanner;
public class Task_8 {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int temp = a;
        for(int i = 2;i < Math.sqrt(temp) ;i++) {
            if (a % i == 0) {
                a = a / i;
                if(a==1)
                    System.out.print(i);
                else
                    System.out.print(i + "*");
                i--;
            }
        }
    }
}
