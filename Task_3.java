package com.company;
import java.util.Scanner;
import java.util.Scanner;
public class Task_3 {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int rez = 0,b = sc.nextInt();
        while (b != 0){
            rez += b;
            b = sc.nextInt();
        }
        System.out.println((int) Math.sqrt(rez));
    }
}
