package Leetcode;

import java.util.Scanner;

public class canPlaceFlowers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] flowerbed = {1,0,0,0,1};
        int n = sc.nextInt();
        for (int i = 0; i < flowerbed.length; i++) {
            if(flowerbed[i] == 0) {
                        // left side checking                      // Right side checking
                if((i==0 || flowerbed[i-1] == 0) && (i == flowerbed.length-1 || flowerbed[i+1] == 0)) {
                    flowerbed[i] = 1;
                    n--;

                    if (n == 0){
                        System.out.println(true);
                        break;
                    } else {
                        System.out.println(false);
                    }
                }
            }
        }
        
    }
}
