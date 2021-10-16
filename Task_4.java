package com.company;
import java.util.Scanner;
public class Task_4 {
    public static void main(){
        int max1 = 0, max2 = 0, max3 = 0, max4 = 0, max5 = 0;
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        while(b!=0){
            if(max1 <= max2 && max1 <= max3 && max1 <= max4 && max1 <= max5 && b > max1){
                max1 = b;
            }
            else {
                if (max2 <= max1 && max2 <= max3 && max2 <= max4 && max2 <= max5 && b > max2) {
                    max2 = b;
                }
                else {
                    if (max3 <= max2 && max3 <= max1 && max3 <= max4 && max3 <= max5 && b > max3) {
                        max3 = b;
                    }
                    else {
                        if (max4 <= max2 && max4 <= max3 && max4 <= max1 && max4 <= max5 && b > max4) {
                            max4 = b;
                        }
                        else {
                            if (max5 <= max2 && max5 <= max3 && max5 <= max4 && max5 <= max1 && b > max5) {
                                max5 = b;
                            }
                        }
                    }
                }
            }
            b = sc.nextInt();
        }
        System.out.println(max1 + " " + max2 + " " + max3 + " " + max4 + " " + max5 + " " );
    }
}
