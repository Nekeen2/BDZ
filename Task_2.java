package com.company;
import java.util.Scanner;
public class Task_2 {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int max = 0, min = Integer.MAX_VALUE;
        float average = 0;
        for(int i = 0; i < a; i ++){
            int b = sc.nextInt();
            if(b > max)
                max = b;
            if(b < min)
                min = b;
            average += b;
        }
        System.out.println(max + " " + min + " " + (average/a));
    }
}
