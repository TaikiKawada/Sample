package jp.ssie.ocjp.複合;

import java.util.Random;
import java.util.Scanner;

public class Practice0509_3 {
    public static void main(String[] args) {
        // コンピュータが選んだランダムな数字を生成
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1; // 1から100の間のランダムな整数
        
        // ユーザーの入力を受け取るためのScanner
        Scanner scanner = new Scanner(System.in);
        int guess = 0; // ユーザーが入力する推測
        
        System.out.println("1から100の間で数字を当ててください！");
        
        // ユーザーが正解するまで繰り返す
        while (guess != targetNumber) {
            System.out.print("推測を入力: ");
            guess = scanner.nextInt();
            
            if (guess < targetNumber) {
                System.out.println("小さいです");
            } else if (guess > targetNumber) {
                System.out.println("大きいです");
            } else {
                System.out.println("正解！");
            }
        }

        scanner.close();
    }
}
