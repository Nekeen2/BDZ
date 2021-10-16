package com.company;
import java.util.Scanner;
public class Task_7 {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int a = sc.nextInt();
        int[][] arr = new int[a+1][b+1];
        for(int i = 1; i<a+1;i++){
            for(int j = 1;j < b+1; j++){
                arr[i][j]=i*j;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
