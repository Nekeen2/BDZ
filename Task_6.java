package com.company;
import java.util.Scanner;
public class Task_6 {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int max = 0;
        for(int i = 0; i < a; i++){
            int b = sc.nextInt();
            if((b % 100) % 11 == 0 && (b % 100) < 12 && b > max){
                max = b;
            }
        }
        System.out.println(max);
    }
}
