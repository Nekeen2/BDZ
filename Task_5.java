package com.company;
import java.util.Scanner;
public class Task_5 {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        for(int i = 0; i < a; i++){
            int b = sc.nextInt();
            while(b >= 10){
                b = b/10;
            }
            sum = sum * 10 + b;
        }
        System.out.println(sum);
    }
}
